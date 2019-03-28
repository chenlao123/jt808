package com.jt809;

import com.jt809.netty.DiscardServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
@MapperScan("com.jt809.mapper")

public class Jt809Application implements CommandLineRunner {
//12313232132
    @Resource
    private DiscardServer discardServer;

    public static void main(String[] args) {

        SpringApplication.run(Jt809Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        discardServer.run(20049);
    }

}
