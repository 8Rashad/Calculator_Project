package com.example.ingressproject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {

    public static int add(int a, int b){
        log.debug("Adding {} and {}", a, b);
        return a+b;
    }

    public static int subtract(int a, int b){
        log.debug("Subtracting {} from {}", b, a);
        return a - b;
    }


}
