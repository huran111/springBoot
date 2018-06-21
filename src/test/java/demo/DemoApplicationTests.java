package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    public void testSimpleMailMessage() {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setSubject("紧急通知");
        simpleMailMessage.setText("上课啦");
        simpleMailMessage.setSentDate(new Date());
        simpleMailMessage.setTo("80754207@yonghui.cn");
        javaMailSender.send(simpleMailMessage);
    }

}
