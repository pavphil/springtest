<!DOCTYPE html>

<html lang="en">
<script src="/resources/ts/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/ts/js/userscript.js"></script>
<link href="/resources/css/mycss.css" rel="stylesheet" />
<body>
<input type="button" class="button" id="testBut" value="Click me">

<form id="myForm">
    <label for="myName">Send me your name:</label>
    <input id="myName" name="name" value="John">
    <input type="submit" class="button" value="Send Me!">
</form>

<div id="result">hello</div>

<table border="1" id="myTable">

</table>

<#--<#list users as u>
    <div><h1>Пользователь <#if u.name??>${u.name}</#if>, возраст <#if u.age??>${u.age}</#if></h1></div>
</#list>-->
</body>

</html>