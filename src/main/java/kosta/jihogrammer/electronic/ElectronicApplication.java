package kosta.jihogrammer.electronic;

import kosta.jihogrammer.electronic.air_conditioner.AirConditioner;
import kosta.jihogrammer.electronic.air_conditioner.LGAirConditioner;
import kosta.jihogrammer.electronic.air_conditioner.SamsungAirConditioner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElectronicApplication {

    public static void main(String[] args) {

        SpringApplication.run(ElectronicApplication.class, args);

        AirConditioner sac = new SamsungAirConditioner();
        AirConditioner lac = new LGAirConditioner();

        System.out.println(sac.getBrand());
        System.out.println(lac.getBrand());

    }

}
