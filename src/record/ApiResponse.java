package record;

import java.util.List;

public record ApiResponse(int code, String message, List<Object> data) {

    public ApiResponse(ApiResponseMember apiResponseMember) {
        this(apiResponseMember.getCode(), apiResponseMember.getMessage(), apiResponseMember.getData());
    }
}
