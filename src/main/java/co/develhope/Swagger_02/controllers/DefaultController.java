package co.develhope.Swagger_02.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {
    @GetMapping(value = "")
    @ApiOperation(value = "Welcome", notes = "Welcome message for the root")
    public String welcome() {
        return "Welcome!";
    }
}
