package cn.wolfcode.jersey._01hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("path")
public class PathRest {
    /**
     * 映射url中匹配的占位符
     *
     * 1，PathRest类上面的@Path("path")限制了资源根路径为/path，而pathParam方法上的@Path("{id}")
     * 限制了子资源请求路径为/path/{id}，类似于SpringMVC中的@RequestMapping("{id}")。
     * 2，在请求方法中，使用@PathParam("id")完成从url中对资源占位符的解析，并同样支持类型转化，
     * 相当于SpringMVC中的@PathVariable标签；
     */
    @GET
    @Path("{id}")
    public String pathParam(@PathParam("id") Long id) {
        System.out.println(this);
        System.out.println(id);
        return "success";
    }
}
