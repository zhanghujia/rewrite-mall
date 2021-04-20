package com.jia.mallcommon.utils.result;

import com.jia.mallcommon.utils.enums.InfoEnum;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 10696
 */
public class R extends HashMap<String, Object> implements Serializable {

    private static final long serialVersionUID = -4595442123715501144L;

    public R() {
        put("code", "200");
        put("msg", "服务请求成功");
    }

    public static R success() {
        return new R();
    }

    public static R success(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R info(InfoEnum infoEnum) {
        R r = new R();
        r.put("code", infoEnum.getKey());
        r.put("msg", infoEnum.getMsg());
        return r;
    }

    public static R exception(Integer code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
