package org.zyh.boot.common.constants;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther : Zhao Yuheng
 * @Description :  httpCode代表httpCode（http状态码），  errorMsg代表msg（自定义），  下面的值代表code（自定义）。
 */
public class ErrorConstants {

    private static final Map<String, HttpStatusMethod> ERROR_CODE_STATUS_MAPPING = new HashMap<>();

    public static Map<String, HttpStatusMethod> getErrorCodeStatusMapping() {
        return ERROR_CODE_STATUS_MAPPING;
    }

    @HttpCode(httpCode = 200, errorMsg = "success")
    public static final String SUCCESS = "10000";

    @HttpCode(httpCode = 500, errorMsg = "An error has occurred")
    public static final String COMMON_FAIL = "10001";

    /**
     *  .getDeclaredFields()方法 能够获取指定类中所有声明属性的字段数组，其中封装了类中声明所有属性信息。
     *  field的内容是：[{"declaringClass":"org.zyh.boot.common.constants.ErrorConstants","name":"UNKNOWN_FAIL"}]
     *  field.get(null)后就获得了字段的值：例如"10000"
     */
    static {
        final Field[] fields = ErrorConstants.class.getDeclaredFields();
        for (final Field field : fields) {
            if (!Modifier.isStatic(field.getModifiers()) || !Modifier.isFinal(field.getModifiers())) {
                continue;
            }

            Object value;
            try {
                value = field.get(null);
            } catch (IllegalAccessException e) {
                continue;
            }
            if (!(value instanceof String)) {
                continue;
            }

            final HttpCode errorCode = field.getAnnotation(HttpCode.class);
            if(errorCode == null) {
                continue;
            }
            HttpStatusMethod status  = new HttpStatusMethod();
            status.setHttpCode(errorCode.httpCode());
            status.setErrorMsg(errorCode.errorMsg());

            final String code = (String) value;

            if (code.length() >= 0) {
                ERROR_CODE_STATUS_MAPPING.put(code, status);
            }
        }
    }
}
