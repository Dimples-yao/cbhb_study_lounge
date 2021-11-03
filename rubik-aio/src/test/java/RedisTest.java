import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.RedisUserService;

/**
 * @author lishaoyao
 * @date 2021/10/8 2:52 下午
 * @describe
 */
public class RedisTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring/*.xml");
        RedisUserService userService=ctx.getBean(RedisUserService.class);

        String key="cs2";
        String result=userService.getString(key); //这里是调用我们编写userService中的getString(key)方法
        System.out.println(result);
    }
}
