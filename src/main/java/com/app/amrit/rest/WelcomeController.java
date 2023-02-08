package com.app.amrit.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "Swagger2WelcomeRestController", description = "This REST Api related to Welcome Message!!!!")
public class WelcomeController {

    @ApiOperation(value = "Get Welcome Message For The Given Name ", response = String.class, tags = "getWelcomeNote")
    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable("name") String name){
        return name + ", Welcome to Swagger Documentation Application";
    }

    @ApiOperation(value = "Get Greet Message For The Given Name ", response = String.class, tags = "getGreetNote")
    @PostMapping("/greet")
    public String greet(@RequestBody String str){
        return str + ", Good Morning";
    }

}
