package com.russell.mall;

import com.russell.mall.mapper.CityMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MallApplication implements CommandLineRunner {

    // comment
    final private CityMapper cityMapper;

    @RequestMapping(value="/", method = RequestMethod.GET)
    String index() {
        return "Hello World!";
    }

    @RequestMapping(value="/home", method = RequestMethod.GET)
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
    }

    public MallApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.cityMapper.findByState("CA"));
        System.out.println(this.cityMapper.findByCountry("US"));
    }
}
