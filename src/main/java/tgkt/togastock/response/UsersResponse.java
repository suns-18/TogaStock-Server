package tgkt.togastock.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class UsersResponse extends BaseResponse{
    private List<UserResponse> list;
}
