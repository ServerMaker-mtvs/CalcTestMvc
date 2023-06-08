<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>ServerMaker</title>
</head>
<body>
    <h1 style="text-align: center">ServerMaker-Calc-Test</h1>
    <hr>
    <br>
    <br>
    <br>
    <br>
    <br>
    <form method="post" name="form1" style="text-align: center;">
        <label>1번째 정수 : </label>
        <input type="number" name="num1" id="num1" placeholder="정수를 입력해주세요">
        <br>
        <br>
        <label>기호 입력 : </label>
        <input type="text" name="sign" id="sign" placeholder="기호(+,-,*,%,/)를 입력해주세요">
        <br>
        <br>
        <label>2번째 정수 : </label>
        <input type="number" name="num2" id="num2" placeholder="정수를 입력해주세요">
        <br>
        <br>
        <input type="submit" value="계산하기" name="btn1">
    </form>


</body>
</html>