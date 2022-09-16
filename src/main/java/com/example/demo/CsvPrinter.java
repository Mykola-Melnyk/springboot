package com.example.demo;

import com.example.demo.Parser.Parser;
import com.example.demo.Reader.Reader;
import com.example.demo.Reader.StubReader;
import com.example.demo.dto.NumberDTO;
import com.example.demo.printer.Printer;

public class CsvPrinter {
    private Reader reader;
    private Parser parser;
    private Printer printer;

    public CsvPrinter(Reader reader) {
        this.reader = reader;
        this.parser = parser;
        this.parser = parser;
    }

    public void start() {
        String line;
        line = reader.readLine();
        NumberDTO dto = parser.parse(line);
        printer.print(dto);
    }
}
