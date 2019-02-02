<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>XMLParsing</title>
</head>
<body bgcolor="#ffefd5">
    <h2 align="center">Парсинг XML</h2>
    <form action="parsing" method="post" name="parserChooserForm" enctype="multipart/form-data">
        <p><input type="file" name="file"></p>
        <p>
            <select name="parserChooser">
            <option value="DOM">DOM</option>
            <option value="SAX">SAX</option>
            <option value="StAX">StAX</option>
        </select></p>
        <p><input type="submit" value="Отправить"></p>
    </form>
</body>
</html>
