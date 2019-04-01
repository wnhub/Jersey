package cn.wolfcode.jersey._01hello;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("dept")
public class DepartmentRest {

    /**
     * 1，@GET标签：说明该资源方法是使用get方式请求；
     * 2，@Produces标签：代表该资源方法生产的响应MIME格式为application/json；
     * 3，@Consumes标签：代表该资源方法能够接受请求MIME类型为application/json；
     * 4，在方法中，直接返回department对象的列表；
     *
     * @return
     */
    @GET
    @Path("dept1")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Department> list() {
        List<Department> dept = new ArrayList<>();
        dept.add(new Department(1L, "dept1"));
        dept.add(new Department(2L, "dept2"));
        return dept;
    }

//    @Path("dept2")
//    @GET
//    @Produces(MediaType.APPLICATION_XML)
//    @Consumes(MediaType.APPLICATION_XML)
//    public List<Department> listXml() {
//        List<Department> dept1 = new ArrayList<>();
//        dept1.add(new Department(11L, "dept11"));
//        dept1.add(new Department(21L, "dept21"));
//        return dept1;
//    }
}
