package com.ohgiraffers.calctestmvc.calcController;

import com.ohgiraffers.calctestmvc.calcModel.CalcMultiplication;
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
        if(multi.equals(req.getParameter("op"))) {
            CalcMultiplication calcMulti = new CalcMultiplication();
            String multiTwoNumbers = String.valueOf(calcMulti.multiTwoNumbers(num1, num2));

            forwardView(req, resp, multiTwoNumbers);
        }
    }

    private static void forwardView(HttpServletRequest req, HttpServletResponse resp, String multiTwoNumbers) throws ServletException, IOException {
        req.setAttribute("multiTwoNumbers", multiTwoNumbers); // 파라미터에 값을 담고
        RequestDispatcher rd = req.getRequestDispatcher("result"); // 방향 설정
        rd.forward(req, resp); // 값을 보냄
    }
}
