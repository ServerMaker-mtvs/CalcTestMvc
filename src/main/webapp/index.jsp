<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h2>계산기</h2>
<form action="calculate" method="post" name="form1">
    <input type="number" name="num1" id="num1"> <!-- name속성은 id와같다. 유지보수를 위해 id도 적어줌 -->
    <select name="op">
        <option selected>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
    </select>
    <input type="text" name="num2" id="num2">
    <input type="submit" value="계산하기" name="btn1">
    <input type="reset" value="다시입력" name="btn2">
</form>
</body>
</html>
