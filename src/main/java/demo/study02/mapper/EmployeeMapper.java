package demo.study02.mapper;

import demo.study02.entity.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 17:05 2018/6/21
 * @Modified By:
 */
@Mapper
@Service
public interface EmployeeMapper {
    @Select("SELECT * from employee WHERE id=#{id}")
    Employee getEmpById(Integer id);

    @Update("UPDATE employee SET lastName=#{lastName},email=#{email},gender=#{gender}")
    void updateEmpById(Employee employee);

    @Delete("DELETE * FROM employee WHERE id=#{id}")
    void deleteEmpById(Integer id);

    @Insert("INSERT INTO employee(lastName,email,gender,d_id) VALUES(#{lastName},#{email},#{gender},#{dId})")
    void InsertEmp(Employee employee);

    @Select("SELECT * FROM employee WHERE lastName = #{lastName}")
     Employee getEmpByLastName(String lastName);

}
