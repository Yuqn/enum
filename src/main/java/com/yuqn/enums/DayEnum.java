package com.yuqn.enums;

/**
 * 这里创建一个枚举，表示星期的某一天
 */
public enum DayEnum {
    MON(1,"星期一"),
    TUES(2,"星期二"),
    WED(3,"星期三"),
    THUR(4,"星期四"),
    FRI(5,"星期五"),
    SAT(6,"星期六"),
    SUN(7,"星期天");

    private Integer code;
    private String msg;

    DayEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
