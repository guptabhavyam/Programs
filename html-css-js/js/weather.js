
document.getElementById("searc").addEventListener('click', function () {
    var input1 = document.getElementById("sea").value;
    console.log(input1);
    fetch("https://api.openweathermap.org/data/2.5/weather?q=" + input1 + "&appid=4491f447a46c6e6eb0a83335a183a31f")
        .then(response => response.json())
        .then(data => {
            var Temp = Math.floor(data['main']['temp'] - 273);
            var Hum = data['main']['humidity'];
            var Pres = data['main']['pressure'];
            document.getElementById("city").innerHTML = input1 + " Weather";
            document.getElementById("Temp").innerHTML = " " + input1 + " Temperature =" + Temp;
            document.getElementById("Hum").innerHTML = " " + input1 + " Humidity =" + Hum;
            document.getElementById("Pres").innerHTML = " " + input1 + " Pressure =" + Pres;
            document.getElementById("cont").style.display = "block";
        })
        .catch(err => alert("Wrong city name"))
})