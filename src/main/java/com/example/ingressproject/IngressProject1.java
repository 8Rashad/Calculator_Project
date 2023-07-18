package com.example.ingressproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class IngressProject1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Calculator calculator = new Calculator();
        log.info("Starting the calculation");
        int sum = calculator.add(num1, num2);
        log.info("Sum: {}", sum);

        int difference = calculator.subtract(num1, num2);
        log.info("Difference: {}", difference);

        System.out.println(sum);
        System.out.println(difference);
    }
}
