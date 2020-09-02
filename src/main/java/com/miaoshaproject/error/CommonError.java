package com.miaoshaproject.error;

/**
 * @Author Rope
 * @Date 2020/6/26 14:34
 * @Version 1.0
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
