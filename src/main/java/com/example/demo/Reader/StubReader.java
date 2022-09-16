package com.example.demo.Reader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StubReader implements Reader{
    private final Iterator<String> iterator;

    public StubReader() {
        List<String> lines = new ArrayList<>();
        lines.add("1,one,один");
        lines.add("2,two,один");
        lines.add("3,three,один");
        iterator = lines.iterator();
    }

    public String readLine() {
        return iterator.hasNext()
                ? iterator.next()
                : null;
    }
}
