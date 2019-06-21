package cn.cby.aigou.util;

public class AjaxResult {
    private boolean success=true;
    private String msg;
    private Object obj;

    public static AjaxResult me(){
        return new AjaxResult().setMsg("成功").setObj(null);
    }
    public static AjaxResult u(){
        return new AjaxResult().setMsg("失败").setObj(null).setSuccess(false);
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
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

    public Object getObj() {
        return obj;
    }

    public AjaxResult setObj(Object obj) {
        this.obj = obj;
        return this;
    }
}
