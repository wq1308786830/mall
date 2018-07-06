package com.russell.mall;

import com.russell.mall.mapper.CityMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
    }

    final private CityMapper cityMapper;

    public MallApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.cityMapper.findByState("CA"));
    }
}
