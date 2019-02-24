package com.blizzard.buy.util;

public class AjaxResult {

    private Boolean success = true;

    private String msg = "操作成功";

    private Object object;

    public Object getObject() {
        return object;
    }

    public Object setObject(Object object) {
        this.object = object;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public AjaxResult() {
    }

    /*public AjaxResult( String msg) {
        this.success = false;
        this.msg = msg;
    }*/

    public static AjaxResult myAjaxResult(){
        return new AjaxResult();
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }

}
