package tgkt.togastock.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tgkt.togastock.response.BaseResponse;

import java.io.IOException;

@WebServlet(name = "LogoutServlet", value = "/api/logout")
public class LogoutServlet extends BaseServlet {
    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        try {

            req.getSession().setAttribute("user", null);

            toJson(resp, BaseResponse.builder().ok(true).build());
        } catch (Exception e) {
            e.printStackTrace();
            toJson(resp, BaseResponse.builder().ok(false).msg("操作失败").build());
        }
    }
}
