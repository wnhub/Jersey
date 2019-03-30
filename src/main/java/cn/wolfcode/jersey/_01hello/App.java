package cn.wolfcode.jersey._01hello;

import cn.wolfcode.jersey.RestApplication;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;

import java.net.URI;

/**
 * 新建一个App类，在该类的main方法中，使用包装好的JettyHttpContainerFactory，来发布一个应用。
 * 第一个参数很简单，就是发布的url地址，第二个参数就是传入一个我们创建的应用配置对象。
 * 注意：使用jetty发布的时候，不能有虚拟路径（必须发布在根路径上）
 */
public class App {
    public static void main(String[] args) {
        JettyHttpContainerFactory.createServer(URI.create("http://localhost:8083/"), new RestApplication());
    }
}
