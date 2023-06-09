package org.zyh.boot.common.controller;

import org.zyh.boot.common.bean.ResponseBean;
import org.zyh.boot.common.constants.ErrorConstants;

/**
 * @Auther : Zhao Yuheng
 * @Description :
 */
public abstract class BaseController {
    protected ResponseBean setSuccessResponse(ResponseBean responseBean) {
        responseBean.setMsg("success");
        responseBean.setCode(0);
        return responseBean;
    }

    protected ResponseBean setFailResponse(ResponseBean responseBean, ErrorConstants errorConstants) {
        responseBean.setMsg(ErrorConstants.);
    }
}
