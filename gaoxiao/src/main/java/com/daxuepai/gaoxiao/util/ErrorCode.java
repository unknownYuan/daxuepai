package com.daxuepai.gaoxiao.util;

public enum ErrorCode {
    SUCCESS(200,"请求成功"),
    INSERT_MONITOR_FAIL(301, "插入monitor监控数据失败"),
    INSERT_MONITOR_EXCEPTION(302, "插入monitor监控数据异常"),
    MISSING_PARAMS_EXCEPTION(401, "请求缺少必需的参数"),
    INSERT_SMS_FAILED(501, "插入短信验证码出错"),
    SEND_SMS_FAILED(502, "发送短信失败！"),
    SERVER_BUSY(601, "你的服务器走丢了，赶快联系管理员找回"),
    REGISTER_HAS_LOGIN(701, "当前已经登录其他账号，请退出后重新注册"),
    PHONE_HAS_REGISTER(702, "该手机号已经被注册"),
    REGISTER_FAILED(703, "注册失败"),
    ;


    int code;
    String text;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    ErrorCode(int code, String text) {
        this.code = code;
        this.text = text;
    }

    @Override
    public String toString() {
        return "ErrorCode{" +
                "code=" + code +
                ", text='" + text + '\'' +
                '}';
    }
}
