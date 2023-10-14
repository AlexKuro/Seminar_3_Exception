package org.example;

import java.util.List;
import java.util.ArrayList;

public class Parse {
    public List<String> parse(StringBuilder strB) {
        return new ArrayList<>(List.of(strB.toString().split(" ")));
    }
}
