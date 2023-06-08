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
        <input type="text" name="num1" id="num1"> <!-- name속성은 id와같다. 유지보수를 위해 id도 적어줌 -->
        <select name="op">
            <option selected>+</option>
            <option>-</option>
            <option>*</option>
            <option>/</option>
            <option>%</option>
        </select>
        <input type="text" name="num2" id="num2">
        <input type="submit" value="계산하기" name="btn1">
    </form>


</body>
</html>