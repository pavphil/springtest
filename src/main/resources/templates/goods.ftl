<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <#include "commons.ftl">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
<header>
    <div>
    <#if goods??>
        <#list goods as good>
            <ul class="list-group">
                <li class="list-group-item list-group-item-success">${good.name}</li>
            </ul>
        </#list>
    </#if>
    </div>
</header>
<menu>
    <#if goods??>
        <#list goods as good>
            <ul class="list-group">
                <li class="list-group-item list-group-item-success">${good.name}</li>
            </ul>
        </#list>
    </#if>
</menu>


</body>

</html>