package tgkt.togastock.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tgkt.togastock.bean.User;
import tgkt.togastock.response.BaseResponse;
import tgkt.togastock.response.UserResponse;
import tgkt.togastock.service.UserService;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/api/login")
public class LoginServlet extends BaseServlet{
    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        String name;
        String password;

        try {
            name = req.getParameter("name");
            password = req.getParameter("password");

            var u = UserService.getInstance().login(
                    name, password
            );

            if (u == null) {
                toJson(resp, BaseResponse.builder().ok(false).msg("用户名或密码错误").build());
                return;
            }

            req.getSession().setAttribute("user", u);
            toJson(resp, UserResponse.builder()
                    .ok(true)
                    .userId(u.getUserId())
                    .name(u.getName())
                    .gender(u.getGender())
                    .status(u.getStatus())
                    .createTime(u.getCreateTime())
                    .build()
            );

        } catch (Exception e) {
            e.printStackTrace();
            toJson(resp, BaseResponse.builder().ok(false).msg("操作失败，参数错误或数据访问错误").build());
        }

    }
}
