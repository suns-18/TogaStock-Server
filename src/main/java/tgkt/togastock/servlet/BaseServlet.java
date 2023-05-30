package tgkt.togastock.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tgkt.togastock.bean.User;
import tgkt.togastock.util.GsonUtil;

import java.io.IOException;

public class BaseServlet extends HttpServlet {
    protected void toJson(HttpServletResponse res,
                          Object obj) throws IOException {

        res.setCharacterEncoding("utf-8");
        res.setContentType("application/json");
        res.getWriter().write(
                GsonUtil.getGson().toJson(obj, obj.getClass())
        );
    }

    protected Object fromJson(HttpServletRequest req,
                              Object refObj) throws IOException {

        req.setCharacterEncoding("utf-8");

        var builder = new StringBuilder();
        var buffer = new String();
        while((buffer = req.getReader().readLine())!=null){
            builder.append(buffer);
        }
        try{
            return GsonUtil.getGson().fromJson(
                    builder.toString(), refObj.getClass());
        }catch (Exception e){
            return null;
        }
    }

    protected User isLoggedIn(HttpServletRequest req) {
        return (User) req.getAttribute(
                "user");
    }
}
