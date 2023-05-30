package tgkt.togastock.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tgkt.togastock.bean.User;
import tgkt.togastock.response.*;
import tgkt.togastock.service.UserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "UserListServlet", value = "/api/userList")
public class UserListServlet extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            // 获取参数
            // 预处理
        }
        catch (Exception e){
            // 输出错误信息
            toJson(response,
                    BaseResponse.builder()
                            .ok(false).msg("参数错误").build());
            return;
        }

        try{
            // 调用本服务类获取模式记录列表
            var beanList = UserService.getInstance().getUsers();

            // 外模式列表
            List<UserResponse> respList = new ArrayList<>();

            // 遍历列表，e代表遍历到的元素
            // 不需要遍历，不需要包装，只需复制粘贴
            beanList.forEach(u->{
                var item = UserResponse.builder()
                        .userId(u.getUserId())
                        .name(u.getName())
                        .gender(u.getGender())
                        .status(u.getStatus())
                        .createTime(u.getCreateTime())
                        .build();

                respList.add(item);
            });

            // 正常列表
            toJson(response, UsersResponse.builder().list(respList).ok(true).build());
        }catch (Exception e){
            // 错误信息
            toJson(response, BaseResponse.builder()
                    .ok(false).msg("获取列表失败，可能是数据库读取错误").build());
        }


    }
}