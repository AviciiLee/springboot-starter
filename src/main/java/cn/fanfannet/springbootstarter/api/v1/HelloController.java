package cn.fanfannet.springbootstarter.api.v1;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/hello")
@Validated
public class HelloController {

    @GetMapping("/{name}")
    public String helloWithName(@PathVariable @NotBlank String name){
        return "hello" + name;
    }
}
