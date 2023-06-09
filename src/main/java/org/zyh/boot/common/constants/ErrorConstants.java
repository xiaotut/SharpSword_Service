package org.zyh.boot.common.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther : Zhao Yuheng
 * @Description :  注解httpCode代表httpCode， errorMsg代表msg， 下面的值代表code。
 */
public class ErrorConstants {

    private static final Map<String, HttpStatusMethod> ERROR_CODE_STATUS_MAPPING = new HashMap<>();

    public static Map<String, HttpStatusMethod> getErrorCodeStatusMapping() {
        return ERROR_CODE_STATUS_MAPPING;
    }

    @HttpCode(httpCode = 500, errorMsg = "An unknown error has occurred")
    public static final int FAIL = 10000;
}
