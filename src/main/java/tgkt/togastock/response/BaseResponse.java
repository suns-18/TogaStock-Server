package tgkt.togastock.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class BaseResponse {
    boolean ok;
    String msg;
    String error;
}