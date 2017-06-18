/**
 * Created by dhslp on 2017/6/17.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class TestController {

    protected static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/hello")
    String home() {
        System.out.println("hello");
        logger.debug("hello world");
        logger.info("hello test");
        return "Hello world";
    }

}
