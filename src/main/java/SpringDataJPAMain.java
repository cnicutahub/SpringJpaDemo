import config.ApplicationConfig;
import model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.UserService;

import java.util.Arrays;

public class SpringDataJPAMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserService userService = ctx.getBean(UserService.class);

        userService.addAll(Arrays.asList(
                new User("cnicuta", "Ciprian", "Nicuta", "wasd1234")
        ));

        System.out.println("findAll=" + userService.findAll());
        ctx.close();
    }
}