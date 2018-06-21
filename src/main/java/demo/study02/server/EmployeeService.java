package demo.study02.server;

import demo.study02.entity.Employee;
import demo.study02.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 17:04 2018/6/21
 * @Modified By:
 */
@Service
@CacheConfig(cacheNames = "emp")
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Cacheable(cacheNames = {"emp"})
    public Employee getEmpById(Integer id) {
        System.out.println("查询" + id + "号员工");
        Employee employee = employeeMapper.getEmpById(id);
        return employee;

    }
}
