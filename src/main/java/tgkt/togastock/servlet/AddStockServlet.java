package tgkt.togastock.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tgkt.togastock.response.BaseResponse;
import tgkt.togastock.response.StockResponse;


import java.io.IOException;



@WebServlet(name = "AddStockServlet", value = "/api/addStock")
public class AddStockServlet extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
         StockResponse.builder()
                .ok(true)
                .name(request.getParameter("name"))
                .area(request.getParameter("area"))
                .exchange(request.getParameter("exchange"))
                .industry(request.getParameter("industry"))
                .symbol(request.getParameter("symbol"))
                .tsCode(request.getParameter("ts_code"))
                .market(request.getParameter("market"))
                .build();
    }catch (Exception e){
            // 错误信息
            toJson(response, BaseResponse.builder()
                    .ok(false).msg("增加股票信息失败，可能是数据库填写错误").build());
        }
    }
}