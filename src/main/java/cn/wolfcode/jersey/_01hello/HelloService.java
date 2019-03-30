package cn.wolfcode.jersey._01hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloService {
    /**
     * 1，注意类是放在cn.wolfcode.jersey._01hello包中，而这个包是我们jersey.config.server.provider.packages参数中配置的包的子包，即该类是能够被扫描到的；
     * 2，在类上面添加了@Path("hello")，代表资源根路径为hello，类似于SpringMVC中在类上面添加@RequestMapping("hello")；
     * 3，方法hi上面添加了两个标签，@GET标签代表该方法接受GET类型请求，类似于SpringMVC中的@GetMapping标签；
     * 4，@Produces标签代表该方法的响应MIME类型为text/plain，类似于@RequestMapping中的produces属性；
     * 5，该方法返回String，这个String值Jersey会自动按照text/plain格式输出。
     * 6,启动tomcat，请求/webapi/hello，得到正确的响应：
     *
     * @return
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hi() {
        return "hello jersey";
    }
}
