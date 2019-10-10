function change(state) {
    var handImg = document.getElementById("hand");
    handImg.src = "assets/hand" + state + ".png";
    var statusDiv = document.getElementById("statusDiv");
    statusDiv.innerHTML = "The hand is " + state;
}

function putar() {
    const imgComputer = document.querySelector('.img-komputer');
    const gambar = ['gajah', 'semut', 'orang']
    let i = 0;
    const waktuMulai = new Date().getTime();
    setInterval(function () {
        if (new Date().getTime() - waktuMulai > 1000) {
            clearInterval;
            return;
        }
        imgComputer.setAttribute('src', 'assets/' + gambar[i++] + '.png');
        if (i == gambar.length) return i = 0;
    }, 100)
}





$(document).ready(function () {
    var x = 0;
    var array = [];

    $("#login").click(function () {
        if ($("#name").val() == "") {
            alert("name can't be empty");
        } else if ($("#email").val() == "") {
            alert("email can't be empty");
        } else if ($("#password").val() == "") {
            alert("password can't be empty");
        }

    });


    $("#calculate").click(function () {
        var angka1 = $("#angka1").val();
        var angka2 = $("#angka2").val();
        var operator = $("#operator").val();
        var total;
        if (operator == "+") {
            total = parseInt(angka1) + parseInt(angka2);
        } else if (operator == "-") {
            total = parseInt(angka1) - parseInt(angka2);
        } else if (operator == "*") {
            total = parseInt(angka1) * parseInt(angka2);
        } else if (operator == "+") {
            total = parseInt(angka1) + parseInt(angka2);
        } else {
            total = "unknown";
        }
        $("#hasil").val(total);
    });
    //     if($('input').val() == ''){
    //         alert('Input can not be left blank');
    //     }
    $("#input").click(function () {
        array.push($("#push").val());
        console.log(array[x]);
        x++;
        $("#push").val("");
    });

    $("#display").click(function () {
        var e = "<br>";
        for (var y = 0; y < array.length; y++) {
            e += "Element " + y + " = " + array[y] + "<br/>";
        }
        $("#showArray").html(e);
    });






    //collapsible
    var coll = document.getElementsByClassName("collapsible");
    var i;

    for (i = 0; i < coll.length; i++) {
        coll[i].addEventListener("click", function () {
            this.classList.toggle("active");
            var content = this.nextElementSibling;
            if (content.style.display === "block") {
                content.style.display = "none";
            } else {
                content.style.display = "block";
            }
        });
    }


});