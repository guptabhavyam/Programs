const myform = document.querySelector('#myform');
myform.addEventListener('submit', function (e) 
{
    const name = document.querySelectorAll('input')[0].value;
    document.getElementById("print_name").innerHTML = name;
    const roll = document.querySelectorAll('input')[1].value;
    document.getElementById("roll_no").innerHTML = roll;
    const sem = document.querySelectorAll('input')[2].value;
    document.getElementById("sem_no").innerHTML = sem;
    const branch = document.querySelectorAll('input')[3].value;
    document.getElementById("branch_no").innerHTML = branch;

    const c1 = document.querySelectorAll('input')[4].value
    const c2 = document.querySelectorAll('input')[5].value
    const c3 = document.querySelectorAll('input')[6].value
    const c4 = document.querySelectorAll('input')[7].value
    const c5 = document.querySelectorAll('input')[8].value
   
    document.getElementById('m1').innerHTML = cgpa(c1);
    document.getElementById('m2').innerHTML = cgpa(c2);
    document.getElementById('m3').innerHTML = cgpa(c3);
    document.getElementById('m4').innerHTML = cgpa(c4);
    document.getElementById('m5').innerHTML = cgpa(c5);

    document.getElementById('cr1').innerHTML = credit(c1);
    document.getElementById('cr2').innerHTML = credit(c2);
    document.getElementById('cr3').innerHTML = credit(c3);
    document.getElementById('cr4').innerHTML = credit(c4);
    document.getElementById('cr5').innerHTML = credit(c5);

    
    document.getElementById('data').style.display = "block";
    e.preventDefault();
});

function cgpa(c) {
    if (isNaN(c)) {
        return "Worng input";
    }
    if (c >= 81 && c <= 100) {
        return "A+";
    }
    else if (c >= 72 && c <= 80) {
        return "B+";
    }
    else if (c >= 64 && c <= 71) {
        return "B";
    }
    else if (c >= 56 && c <= 63) {
        return "C+";
    }
    else if (c >= 48 && c <= 55) {
        return "C";
    }
    else if (c >= 40 && c <= 41) {
        return "D";
    }
    else {
        return "F"
    }
}
function credit(c) {
    if (isNaN(c)) {
        return "Worng input";
    }
    if (c >= 81 && c <= 100) {
        return "4";
    }
    else if (c >= 72 && c <= 80) {
        return "4";
    }
    else if (c >= 64 && c <= 71) {
        return "4";
    }
    else if (c >= 56 && c <= 63) {
        return "4";
    }
    else if (c >= 48 && c <= 55) {
        return "4";
    }
    else if (c >= 40 && c <= 41) {
        return "4";
    }
    else {
        return "0"
    }


}
