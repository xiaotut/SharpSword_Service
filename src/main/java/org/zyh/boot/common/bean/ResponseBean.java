package org.zyh.boot.common.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * @Auther : Zhao Yuheng
 * @Description :
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // 这个表示为null时就不返回了。
public class ResponseBean implements Serializable {
    private static final long serialVersionUID = -123123123123123123L;

    private int httpCode;

    // 自定义返回值
    private String msg = null;

    // 自定义返回值
    private int code;

    // 要返回的数据
    private Object data = null;

    // 只有 success 和 fail 两个值。
    private String status = null;

    public ResponseBean() {
        this.status = "SUCCESS";
        this.httpCode = 200;
    }
}
