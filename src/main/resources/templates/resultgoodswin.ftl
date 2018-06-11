<!DOCTYPE html>

<<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="/resources/js/jquery-3.3.1.min.js"></script>

    <link href="/resources/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="/resources/js/bootstrap.js"></script>

</head>

<body>

<div class="container">
    <h2>Dropdowns</h2>
    <p>The .active class adds a blue background color to the active link.</p>
    <p>The .disabled class disables a dropdown item (grey text color).</p>
    <div class="dropdown">
        <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Tutorials
            <span class="caret"></span></button>
        <ul class="dropdown-menu">
            <li><a href="#">Normal</a></li>
            <li class="disabled"><a href="#">Disabled</a></li>
            <li class="active"><a href="#">Active</a></li>
            <li><a href="#">Normal</a></li>
        </ul>
    </div>
</div>

<#--<div class="list-group-item">
    <#list goods as good>
        <#if good.name?? && good.partNumber??>
            <a href="#" class="list-group-item disabled">
                <h4 class="list-group-item-heading">${good.name}</h4>
                <p class="list-group-item-text">${good.partNumber}</p>
            </a>
        </#if>
    </#list>
</div>-->



</body>

</html>