package com.example.demo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NumberDTO {
    private String number;
    private String enName;
    private String uaName;
}
