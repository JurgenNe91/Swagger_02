package co.develhope.Swagger_02.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {
    @ApiModelProperty(value = "The name of the operation", example = "Division")
    private String name;
    @ApiModelProperty(value = "The minimum number of operand")
    private int minNumberOfOperand;
    @ApiModelProperty(value = "The description of the operation")
    private String description;
    @ApiModelProperty(value = "A list of properties")
    private String[] properties;
}
