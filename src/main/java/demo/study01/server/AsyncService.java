package demo.study01.server;

import org.springframework.stereotype.Service;

/**
 * @author:HuRan
 * @Description: 异步发送结果
 * @Date: Created in 13:26 2018/6/21
 * @Modified By:
 */
@Service
public class AsyncService {
    public void hello(){
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println("处理数据中......");
    }
}
