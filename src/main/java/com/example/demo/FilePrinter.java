package com.example.demo;

import com.example.demo.Reader.Reader;
import com.example.demo.Reader.StubReader;

public class FilePrinter {
    Reader reader = new StubReader();
    CsvPrinter csvPrinter = new CsvPrinter(reader);
    csvPrinter.start();
}
