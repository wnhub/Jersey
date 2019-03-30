package cn.wolfcode.jersey;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * 创建一个Application类，用于设置发布环境
 * ResourceConfig是Jersey中用于配置应用资源的类，在Jersey中，把所有提供REST服务的类，都称为资源类
 */
public class RestApplication extends ResourceConfig {
    public RestApplication() {
        this.packages("cn.wolfcode.jersey");
    }
}
