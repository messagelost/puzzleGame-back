package com.javaclimb.puzzlegameback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.javaclimb.puzzlegameback"})
@MapperScan(basePackages = {"com.javaclimb.puzzlegameback.mappers"})
@EnableTransactionManagement
@EnableAsync
@EnableScheduling
public class PuzzleGameBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(PuzzleGameBackApplication.class, args);
    }

}
