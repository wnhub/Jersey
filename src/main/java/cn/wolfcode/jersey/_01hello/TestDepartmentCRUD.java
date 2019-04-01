package cn.wolfcode.jersey._01hello;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("crud1")
public class TestDepartmentCRUD {

    /**
     * 1，@GET注解之前已经提到过，表示接受GET类型请求，类似@GetMapping;
     * 2，@POST，表示接受POST类型请求，类似@PostMapping，或者@RequestMapping(method=RequestMethod.POST);
     * 其次注意，在save方法参数列表中出现了@FormParam("name")，代表name参数映射请求的form表单中的name名
     * 称的字段值；关于参数绑定，Jersey还是提供了相当多的注解来映射，后面再介绍。
     * 3，@PUT，表示接受POST类型请求，类似@RequestMapping(method=RequestMethod.PUT);
     * 4，@DELETE，表示接受DELETE类型请求，类似@RequestMapping(method=RequestMethod.DELETE);
     * 5，另外，Jersey还提供了@HEAD，@OPTIONS，看名字对应的就是HEAD和OPTIONS两种请求方式，但是需要注意
     * 的一点就是Jersey没有提供针对PATCH 和 TRACE这两种请求方式的对应注解。
     *
     * @return
     */


    @GET //1
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_XML)
    public List<Department> list() {
        List<Department> dept = new ArrayList<>();
        dept.add(new Department(111L, "dept1"));
        dept.add(new Department(211L, "dept2"));
        return dept;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_XML)
    public Department get(@PathParam("id") Long id) {
        return new Department(id, "dept2");
    }

    @POST //2
    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_XML)
    public Department save(@FormParam("name") String name) {
        Department d = new Department(1L, name);
        System.out.println("name:" + name);
        return d;
    }

    @PUT //3
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_XML)
    public Department update(@PathParam("id") Long id, @FormParam("name") String name) {
        Department d = new Department(id, name);
        System.out.println("id:" + id + ",name:" + name);
        return d;
    }

    @DELETE //4
    @Path("{id}")
//    @Consumes(MediaType.APPLICATION_XML)
    public void delete(@PathParam("id") Long id) {
        System.out.println("删除部门：" + id);
    }
}
