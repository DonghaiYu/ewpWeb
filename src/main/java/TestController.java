/**
 * Created by dhslp on 2017/6/17.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class TestController {

    protected static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/hello")
    String hello() {
        System.out.println("hello");
        logger.info("hello test");
        logger.error("no error");
        return "Hello world";
    }

    //返回jsp页面
    @RequestMapping(value = "/")
    String home() {
        return "index";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestController.class, args);
    }

}
