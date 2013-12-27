package com.ghtn.context;

/**
 * User: Administrator
 * Date: 13-12-23
 * Time: 下午4:54
 */
public class SessionFactoryContextHolder {
    private static final ThreadLocal holder = new ThreadLocal<>();


    public static void setType(SessionFactoryType sessionFactoryType) {
        /*Map<String, Object> contextMap = holder.get();
        contextMap.put("dataSourceType", dataSourceType);*/
        holder.set(sessionFactoryType);
    }

    public static SessionFactoryType getType() {
        return (SessionFactoryType) holder.get();
    }

    public static void clearType() {
//        holder.get().put("dataSourceType", null);
        holder.remove();
    }

}
