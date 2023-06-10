package org.zyh.boot.common.controller;

import org.zyh.boot.common.bean.ResponseBean;
import org.zyh.boot.common.constants.CommonConstant;
import org.zyh.boot.common.constants.ErrorConstants;
import org.zyh.boot.common.constants.HttpStatusMethod;

/**
 * @Auther : Zhao Yuheng
 * @Description :
 */
public abstract class BaseController {
    protected ResponseBean setSuccessResponse(ResponseBean responseBean) {
        return setResponse(responseBean, ErrorConstants.SUCCESS, CommonConstant.HTTP_SUCCESS);
    }

    protected ResponseBean setFailResponse(ResponseBean responseBean, String errorConstants) {
        return setResponse(responseBean, errorConstants, CommonConstant.HTTP_FAIL);
    }

    private ResponseBean setResponse(ResponseBean responseBean, String errorConstants, String status) {
        HttpStatusMethod httpStatusMethod = ErrorConstants.getErrorCodeStatusMapping().get(errorConstants);
        if (status == null) {
            responseBean.setHttpCode(500);
            responseBean.setMsg(CommonConstant.HTTP_CODE_ERROR);
            responseBean.setStatus(CommonConstant.HTTP_FAIL);
            return responseBean;
        }
        responseBean.setStatus(status);
        responseBean.setHttpCode(httpStatusMethod.getHttpCode());
        responseBean.setMsg(httpStatusMethod.getErrorMsg());
        responseBean.setCode(errorConstants.toString());
        return responseBean;
    }
}
