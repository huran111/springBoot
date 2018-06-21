package demo.study01.server;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author:HuRan
 * @Description: 定时任务
 * @Date: Created in 13:33 2018/6/21
 * @Modified By:
 */
@Service
public class ScheduledService {
    @Scheduled(cron = "0-4 * * * * *")
    public void hello(){
    System.out.println("hello ...........");
    }
}
