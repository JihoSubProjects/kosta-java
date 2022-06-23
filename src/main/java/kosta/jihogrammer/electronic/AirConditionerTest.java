package kosta.jihogrammer.electronic;

import kosta.jihogrammer.electronic.air_conditioner.AirConditioner;
import kosta.jihogrammer.electronic.air_conditioner.LGAirConditioner;
import kosta.jihogrammer.electronic.air_conditioner.SamsungAirConditioner;

public class AirConditionerTest {

    public static void main(String[] args) {
        AirConditioner sac = new SamsungAirConditioner();
        AirConditioner lac = new LGAirConditioner();
    }

}
