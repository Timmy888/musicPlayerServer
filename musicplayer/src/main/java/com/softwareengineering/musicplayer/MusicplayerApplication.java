package com.softwareengineering.musicplayer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//批量扫描
@MapperScan(value="com.softwareengineering.musicplayer.mapper")
@SpringBootApplication
public class MusicplayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicplayerApplication.class, args);
    }

}
