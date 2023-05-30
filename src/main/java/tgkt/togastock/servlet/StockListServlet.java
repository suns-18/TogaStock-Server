package tgkt.togastock.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tgkt.togastock.response.BaseResponse;
import tgkt.togastock.response.StockResponse;
import tgkt.togastock.response.StocksResponse;
import tgkt.togastock.service.StockService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StockListServlet", value = "/api/stockList")
public class StockListServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try{
            // 调用本服务类获取模式记录列表
            var beanList = StockService.getInstance().getAllList();

            // 外模式列表
            List<StockResponse> respList = new ArrayList<>();

            // 遍历列表，e代表遍历到的元素
            // 不需要遍历，不需要包装，只需复制粘贴
            beanList.forEach(e->{
                var item = StockResponse.builder()
                        .ok(true)
                        .name(e.getName())
                        .area(e.getArea())
                        .exchange(e.getExchange())
                        .industry(e.getIndustry())
                        .symbol(e.getSymbol())
                        .tsCode(e.getTsCode())
                        .market(e.getMarket())
                        .build();

                respList.add(item);
            });

            // 正常列表
            toJson(resp, StocksResponse.builder().list(respList).ok(true).build());
        }catch (Exception e){
            e.printStackTrace();
            // 错误信息
            toJson(resp, BaseResponse.builder()
                    .ok(false).msg("获取股票列表失败，可能是数据库读取错误").build());
        }
    }
}
