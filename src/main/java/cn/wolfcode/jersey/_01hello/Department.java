package cn.wolfcode.jersey._01hello;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Department {
    private Long id;
    private String name;

//    public Department(Long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
}
