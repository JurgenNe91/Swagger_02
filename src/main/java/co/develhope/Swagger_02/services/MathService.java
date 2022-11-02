package co.develhope.Swagger_02.services;

import co.develhope.Swagger_02.entities.ArithmeticOperation;
import io.swagger.annotations.ApiParam;
import lombok.ToString;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Service
public class MathService {

    public String welcomeMathMessage(){
        return "Welcome to Math path";
    }

    public ArithmeticOperation getDivisionInfo(){
        return new ArithmeticOperation("Division", 3, "Division operation", new String[]{"try"}); //I'm having troubles calling the array
    }

    public int getMultiplicationValue(@ApiParam(value = "the number to multiply")@RequestParam() int multiplication){
        return 10*multiplication;
    }
    public double getSquareValue(@ApiParam(value = "the square value")@PathVariable()  double n){
        return n*n;
    }
}
