package record;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApiResponseMember apiResponseMember = ApiResponseMember.MEMBER_SAVE_SUCCESS;
        List<Object> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        apiResponseMember.addData(stringList);
        ApiResponse apiResponse = new ApiResponse(apiResponseMember);
        System.out.println(apiResponse);
    }
}
