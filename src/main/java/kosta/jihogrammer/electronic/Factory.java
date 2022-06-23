package kosta.jihogrammer.electronic;

import kosta.jihogrammer.electronic.air_conditioner.AirConditioner;
import kosta.jihogrammer.electronic.air_conditioner.LGAirConditioner;
import kosta.jihogrammer.electronic.air_conditioner.SamsungAirConditioner;

public class Factory {
    public static AirConditioner getAirConditioner(String brand) {
        switch (brand.toUpperCase()) {
        case "SAMSUNG":
            return new SamsungAirConditioner();
        case "LG":
            return new LGAirConditioner();
        default:
            throw new RuntimeException("INVALID BRAND NAME");
        }
    }
}
