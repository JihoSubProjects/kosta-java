package kosta.jihogrammer.electronic;

import kosta.jihogrammer.electronic.air_conditioner.LGAirConditioner;
import kosta.jihogrammer.electronic.air_conditioner.SamsungAirConditioner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    @Test
    @DisplayName("삼성 에어컨")
    void SAMSUNG() {
        assertInstanceOf(SamsungAirConditioner.class, Factory.getAirConditioner("samsung"));
        assertInstanceOf(SamsungAirConditioner.class, Factory.getAirConditioner("SAMSUNG"));
        assertInstanceOf(SamsungAirConditioner.class, Factory.getAirConditioner("SamSung"));
    }
    @Test
    @DisplayName("LG 에어컨")
    void LG() {
        assertInstanceOf(LGAirConditioner.class, Factory.getAirConditioner("lg"));
        assertInstanceOf(LGAirConditioner.class, Factory.getAirConditioner("LG"));
        assertInstanceOf(LGAirConditioner.class, Factory.getAirConditioner("Lg"));
    }
    @Test
    @DisplayName("없는 에어컨")
    void NO_BRAND() {
        assertThrows(RuntimeException.class, () -> Factory.getAirConditioner("KOSTA"));
        assertThrows(RuntimeException.class, () -> Factory.getAirConditioner("TYSYSTEMS"));
        assertThrows(RuntimeException.class, () -> Factory.getAirConditioner("JIHOGRAMMER"));
    }
}
