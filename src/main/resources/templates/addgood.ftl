<!DOCTYPE html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <script src="/resources/js/jquery-3.3.1.min.js"></script>
    <link href="/resources/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="/resources/js/bootstrap.js"></script>
    <script type="text/javascript" src="/resources/js/goodsScript.js"></script>
</head>

<body>
<form action="/goods/add" id = "addform" method="post"class="form-horizontal">
    <div class="form-group">
        <label class="control-label col-sm-2" for="name">Наименование детали</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="name" name="name" placeholder="Введите наименование детали" value="hello">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="amount">Количество</label>
        <div class="col-sm-10">
            <input type="number" class="form-control" id="amount" name="amount" placeholder="Введите количество деталей">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="number">Серийный номер</label>
        <div class="col-sm-10">
            <input type="number" class="form-control" id="partNumber" name="partNumber" placeholder="Введите серийный номер детали">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Сохранить</button>
        </div>
    </div>
</form>


<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>
            <div class="modal-body">
                <span id="textSpan"></span>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>

    </div>
</div>

</body>

</html>