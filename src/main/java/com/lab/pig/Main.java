package com.lab.pig;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Stream.of(Util.getPigs())
                .filter(r -> r.getAddr().contains("桃園市"))
                .forEach(System.out::println);
        List Addr = Stream.of(Util.getPigs())
                .filter(r -> r.getAddr().contains("桃園市"))
                .collect(toList());
        System.out.printf("在桃園合格店數: %d, 內容 %s\n", Addr.size(), Addr);
    }
}
