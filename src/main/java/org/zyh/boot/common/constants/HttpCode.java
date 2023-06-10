package org.zyh.boot.common.constants;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther : Zhao Yuheng
 * @Description :
 */
@Target(ElementType.FIELD) // 这个注解代表作用范围， FIELD：代表字段、枚举的常量。
@Retention(RetentionPolicy.RUNTIME) // 这个注解表示生命周期， RUNTIME：表示在运行时可以使用。
public @interface HttpCode {

    int httpCode();

    String errorMsg();
}
