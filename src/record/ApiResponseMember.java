package record;

import java.util.List;

public enum ApiResponseMember {
    MEMBER_SAVE_SUCCESS(200,"유저 저장에 성공하였습니다",null);
    private int code;
    private String message;
    private List<Object> data;

    ApiResponseMember(int code, String message, List<Object> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public List<Object> getData() {
        return data;
    }

    public void addData(List<Object> data) {
        this.data = data;
    }
}
