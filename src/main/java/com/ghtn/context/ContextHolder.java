package com.ghtn.context;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-12-23
 * Time: 下午4:54
 */
public class ContextHolder {
    private static final ThreadLocal<Map<String, Object>> holder = new ThreadLocal<>();

    static {
        Map<String, Object> contextMap = new HashMap<>();
        holder.set(contextMap);
    }

    public static void setDataSourceType(DataSourceType dataSourceType) {
        Map<String, Object> contextMap = holder.get();
        contextMap.put("dataSourceType", dataSourceType);
//        holder.set(dataSourceType);
    }

    public static DataSourceType getDataSourceType() {
        return (DataSourceType) holder.get().get("dataSourceType");
    }

    public static void clearDataSourceType() {
        holder.get().put("dataSourceType", null);
//        holder.remove();
    }

    public static void setSessionFactoryType(SessionFactoryType sessionFactoryType) {
        Map<String, Object> contextMap = holder.get();
        contextMap.put("sessionFactoryType", sessionFactoryType);
//        holder.set(sessionFactoryType);
    }

    public static SessionFactoryType getSessionFactoryType() {
        return (SessionFactoryType) holder.get().get("sessionFactoryType");
    }

    public static void clearSessionFactoryType() {
        holder.get().put("sessionFactoryType", null);
//        holder.remove();
    }
}
