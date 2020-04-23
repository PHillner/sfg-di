package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author phillner
 * @created 23.4.2020
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!!");
        return "That's all Folks!";
    }
}
