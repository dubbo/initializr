package io.dubbo.emptydubboinitializr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Sorry, the site is out of date. If you still want to create a dubbo project, try to visit https://start.aliyun.com/bootstrap.html .";
    }

}
