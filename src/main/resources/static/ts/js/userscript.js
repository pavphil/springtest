"use strict";
var first = 55;

function onClickTest() {
    console.log("FF");
}

$(document).ready(function () {
    $("#testBut").click(function () {
        console.log("cliked");
        $("div").hide();
    });
    var form = document.getElementById("myForm");
    form.addEventListener("submit", function (event) {
        event.preventDefault();
        sendData();
    });

    $("li").click(function () {
        $(this).hide( "slow", function() {
            alert( "Animation complete." );
        });
    });

    /*$("li").dblclick(function(){
        alert("dblcik");
    });*/

    $("#buttonBut").click(function () {
        $("li").toggle(1000, function () {
            alert("TOGLED");
        });
    });

    $("#buttonBut1").click(function () {
        $("li:first").show();
    });

    $("#fadeTest").click(function(){
        $("#div1").fadeToggle(); // fageIn, fadeOut, fadeTo(speed,opacity,callback);
        $("#div2").fadeToggle("slow");
        $("#div3").fadeToggle(3000);
    });

    $("#flip").click(function(){
        $("#panel").slideDown("slow");
    });
});

function sendData() {
    var sendVar = {"name": "vause"};
    $.ajax({
        type: 'POST',
        url: './userswithcomment',
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        data: JSON.stringify(sendVar),
        success: function (resp) {
            var usersArr = resp.users;
            $.each(usersArr, function (i, item) {
                var $tr = $('<tr>').append(
                    $('<td>').text(item.name),
                    $('<td>').text(item.surname),
                    $('<td>').text(item.age)
                ).appendTo('#myTable');
                console.log($tr.wrap('<p>').html());
            });
        }
    });
}


