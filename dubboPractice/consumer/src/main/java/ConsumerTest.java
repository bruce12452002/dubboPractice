import bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

import java.io.IOException;
import java.util.List;

public class ConsumerTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        System.out.println("consumer 已啟動");
        UserService us = context.getBean(UserService.class);
        List<User> list =  us.getUserByName("xxx");
        for(User u:list){
            System.out.println(u.getId());
            System.out.println(u.getName());
            System.out.println(u.getBloodType());
        }
//        us.getUserByName("xxx").forEach(x -> {
//            System.out.println(x.getId());
//            System.out.println(x.getName());
//            System.out.println(x.getBloodType());
//        });
        System.in.read();
    }
}
