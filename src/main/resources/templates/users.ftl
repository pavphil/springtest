<!DOCTYPE html>

<html lang="en">

<body>
<#list users as u>
    <div><h1>Пользователь <#if u.name??>${u.name}</#if>, возраст <#if u.age??>${u.age}</#if></h1></div>
</#list>
</body>

</html>