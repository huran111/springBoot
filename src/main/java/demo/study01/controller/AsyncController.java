package demo.study01.controller;

import demo.study01.server.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:HuRan
 * @Description: 异步发送结果
 * @Date: Created in 13:28 2018/6/21
 * @Modified By:
 */
@RestController
public class AsyncController {
    @Autowired
    AsyncService asyncService;

    @GetMapping("/hello")
    public String hello() {
        asyncService.hello();
        return "success";
    }
}
