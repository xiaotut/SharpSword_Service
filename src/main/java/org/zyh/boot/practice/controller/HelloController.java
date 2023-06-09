package org.zyh.boot.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zyh.boot.common.bean.ResponseBean;

/**
 * @Auther : Zhao Yuheng
 * @Description :
 */
//@ResponseBody  标记了这个注解，代表这个类都是用来返回json类型的数据的而不是跳转页面的。
//@Controller  标记了Controller的类就可以被外界访问到。
// 上面两个注解可以合成下面的注解：
@RestController
@RequestMapping(value = "/practice")
public class HelloController {

    @GetMapping("/hello")
    public ResponseBean practice() {
        ResponseBean responseBean = new ResponseBean();
        try {
            String a = "123123";
            responseBean.setData(a);
        } catch (Exception e) {
            return responseBean;
        }

        return responseBean;
    }
}
