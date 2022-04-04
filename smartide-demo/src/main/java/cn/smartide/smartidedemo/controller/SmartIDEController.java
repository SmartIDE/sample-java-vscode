/*SmartIDEController.java*/

package cn.smartide.smartidedemo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SmartIDEController {
    @RequestMapping("/home")
    String home(@RequestParam String language) {
        String hello = "Hello, SmartIDE Users!";
        return hello + " The dev language is:" + language + ".";
    }
}
