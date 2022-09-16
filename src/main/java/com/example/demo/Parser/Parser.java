package com.example.demo.Parser;

import com.example.demo.dto.NumberDTO;

public class Parser {
    public NumberDTO parse(String line) {
        String[] parts = line.split(",");
        // TODO: add validation
        NumberDTO dto = new NumberDTO();
        dto.setNumber(parts[0]);
        dto.setEnName(parts[1]);
        dto.setUaName(parts[2]);
        return dto;
    }
}
