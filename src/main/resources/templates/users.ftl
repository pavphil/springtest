<!DOCTYPE html>

<html lang="en">
<script src="/resources/ts/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/ts/js/userscript.js"></script>

<head>
    <link rel="stylesheet" type="text/css" href="/resources/css/styles.css">
    <style>
        #panel, #flip {
            padding: 5px;
            text-align: center;
            background-color: #e5eecc;
            border: solid 1px #c3c3c3;
        }

        #panel {
            padding: 50px;
            display: none;
        }
    </style>
</head>
<body>
<input type="button" class="button" id="testBut" value="Click me">

<ul>
    <li>Раз</li>
    <li>two</li>
    <li>three</li>
</ul>

<button id="buttonBut">TOOGLE</button>
<button id="buttonBut1">Восстановить 1 ли</button>

<form id="myForm">
    <label for="myName">Send me your name:</label>
    <input id="myName" name="name" value="John">
    <input type="submit" class="button" value="Send Me!">
</form>

<div id="result">hello</div>

<table border="1" id="myTable">

</table>

<button id="fadeTest">Click to fade out boxes</button><br><br>
<div id="div1" style="width:80px;height:80px;background-color:red;display: none;"></div><br>
<div id="div2" style="width:80px;height:80px;background-color:green;display: none;"></div><br>
<div id="div3" style="width:80px;height:80px;background-color:blue;display: none;"></div>

<div id="flip">Click to slide down panel</div>
<div id="panel">Hello world!</div>

<#--<#list users as u>
    <div><h1>Пользователь <#if u.name??>${u.name}</#if>, возраст <#if u.age??>${u.age}</#if></h1></div>
</#list>-->
</body>

</html>