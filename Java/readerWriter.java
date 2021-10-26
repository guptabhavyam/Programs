import java.util.concurrent.Semaphore;

public class readerWriter{
    
    static Semaphore mutex = new Semaphore(1);
    static Semaphore wrt = new Semaphore(1);
    static int readCount = 0;
    
    static void writer() throws InterruptedException{
        wrt.acquire();
        wrt.release();
    }
    
    static void reader() throws InterruptedException{
        do{
            mutex.acquire();
            readCount++;
            if(readCount==1){
                wrt.acquire();
                mutex.release();
            }
            mutex.acquire();
            readCount--;
            if(readCount==0){
                wrt.release();
            }
            mutex.release();
        }while(true);
    }
    
    public static void main(String args[]){
        Thread t1 = new Thread();
        t1.setName("Thread 1");
        Thread t2 = new Thread();
        t2.setName("Thread 2");
        Thread t3 = new Thread();
        t3.setName("Thread 3");
        Thread t4 = new Thread();
        t4.setName("Thread 4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}