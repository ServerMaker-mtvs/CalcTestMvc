package com.ohgiraffers.calctestmvc.calcController;

import com.ohgiraffers.calctestmvc.calcModel.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/calculate")
public class CalcControllerTestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        String multi = "*";
        String divide = "/";
        String minus = "-";
        String plus = "+";
        String modulo = "%";

        if(multi.equals(req.getParameter("op"))) {
            CalcMultiplication calcMulti = new CalcMultiplication();
            String multiTwoNumbers = String.valueOf(calcMulti.multiTwoNumbers(num1, num2));
            forwardView(req, resp, multiTwoNumbers);

        } else if(divide.equals(req.getParameter("op"))) {
            if(num2 == 0) {
                resp.sendError(500, "2번째 숫자는 0이 될 수 없습니다.");
            } else {
                CalcDivide calcDivide = new CalcDivide();
                String divideTwoNumber = String.valueOf(calcDivide.divideTwoNumber(num1, num2));
                forwardView(req, resp, divideTwoNumber);
            }

        } else if(minus.equals(req.getParameter("op"))) {
            CalcMinus calcMinus = new CalcMinus();
            String minusTwoNumbers = String.valueOf(calcMinus.minusTwoNumbers(num1, num2));
            forwardView(req, resp, minusTwoNumbers);

        } else if(plus.equals(req.getParameter("op"))) {
            CalcPlus calcPlus = new CalcPlus();
            String plusTwoNum = String.valueOf(calcPlus.plusTwoNum(num1, num2));
            forwardView(req, resp, plusTwoNum);

        } else if(modulo.equals(req.getParameter("op"))) {
            if (num2 == 0) {
                resp.sendError(500, "2번째 숫자는 0이 될 수 없습니다.");
            } else {
                CalModulo calModulo = new CalModulo();
                String moduloTwoNum = String.valueOf(calModulo.calculateModulo(num1, num2));
                forwardView(req, resp, moduloTwoNum);
            }

        } else {
            resp.sendError(404, "잘못된 기호를 입력하셨습니다.");
        }
    }

    private static void forwardView(HttpServletRequest req, HttpServletResponse resp, String twoNumbers) throws ServletException, IOException {
        req.setAttribute("twoNumbers", twoNumbers); // 파라미터에 값을 담고
        RequestDispatcher rd = req.getRequestDispatcher("result"); // 방향 설정
        rd.forward(req, resp); // 값을 보냄
    }
}
