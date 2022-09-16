package com.example.demo.printer;

import com.example.demo.dto.NumberDTO;

public class Printer {
    public void print(NumberDTO dto) {
        System.out.printf("%s -> %s | %s%n", dto.getNumber(), dto.getEnName(), dto.getUaName());
    }
}
