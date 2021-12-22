package com.example.testingweb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class GreetingController {

    private final GreetingService greetingService;

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return greetingService.greet();
    }
}
