package com.ghtn.util;

import com.ghtn.context.ContextHolder;
import com.ghtn.context.SessionFactoryType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;

/**
 * User: Administrator
 * Date: 13-12-24
 * Time: 下午3:13
 */
public class SessionFactoryUtil {
    private static Log log = LogFactory.getLog(DataSourceUtil.class);

    public void before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();

        if (methodName.toUpperCase().contains("MYSQL")) {
            log.info("切换到sessionFactory : mysql");
            ContextHolder.setSessionFactoryType(SessionFactoryType.mysql);
        }
        if (methodName.toUpperCase().contains("ORACLE")) {
            log.info("切换到sessionFactory : oracle");
            ContextHolder.setSessionFactoryType(SessionFactoryType.oracle);
        }
    }
}
