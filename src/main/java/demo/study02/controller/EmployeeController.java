package demo.study02.controller;

import demo.study02.entity.Employee;
import demo.study02.server.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:HuRan
 * @Description:控制层
 * @Date: Created in 17:17 2018/6/21
 * @Modified By:
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id) {
        return employeeService.getEmpById(id);
    }
}
