package co.develhope.Swagger_02.controllers;

import co.develhope.Swagger_02.entities.ArithmeticOperation;
import co.develhope.Swagger_02.services.MathService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private MathService mathService;
    @GetMapping("")
    public String getWelcome(){
        return mathService.welcomeMathMessage();
    }
    @GetMapping("/division-info")
    public ArithmeticOperation getInfo(){
        return mathService.getDivisionInfo();
    }
    @GetMapping("/multiplication")
    public int getMultiplicationInfo(@ApiParam(value = "the number to multiply")@RequestParam() int multiplication){
        return mathService.getMultiplicationValue(multiplication);
    }
   @GetMapping("/square/{n}")
    public double getSquareOfN(@ApiParam(value = "the square value")@PathVariable()  double n){
        return mathService.getSquareValue(n);
   }
}
