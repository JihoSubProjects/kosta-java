package kosta.jihogrammer.electronic;

import kosta.jihogrammer.electronic.air_conditioner.AirConditioner;

import kosta.jihogrammer.electronic.air_conditioner.LGAirConditioner;
import kosta.jihogrammer.electronic.air_conditioner.SamsungAirConditioner;
import kosta.jihogrammer.electronic.model.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("에어컨 테스트")
class AirConditionerTest {

    final String BRAND = "KOSTA";
    AirConditioner ac;

    @BeforeEach
    void beforeEach() {
        ac = new AirConditioner() {
            @Override
            public String getBrand() {
                return "KOSTA";
            }
        };
    }

    @Test
    @DisplayName("제작")
    void construct() {
        assertEquals(BRAND, ac.getBrand());
        assertEquals(Status.OFF, ac.getStatus());
    }

    @Test
    @DisplayName("가동")
    void turnOn() {
        ac.turnOn();
        assertEquals(Status.ON, ac.getStatus());
    }

    @Test
    @DisplayName("끄기")
    void turnOff() {
        ac.turnOn();
        ac.turnOff();
        assertEquals(Status.OFF, ac.getStatus());
    }

    @Test
    @DisplayName("망가짐")
    void broken() {
        ac.turnOn();
        ac.breakIt();
        assertEquals(Status.BROKEN, ac.getStatus());
    }

    @Test
    @DisplayName("고침")
    void fix() {
        ac.breakIt();
        ac.fix();
        assertEquals(Status.OFF, ac.getStatus());
    }

    @Test
    @DisplayName("온도 올리기")
    void tempUp() {
        ac.turnOn();
        int beforeTemp = ac.getTemperature();
        ac.temperatureUp();
        assertEquals(beforeTemp + 1, ac.getTemperature());
    }

    @Test
    @DisplayName("최고 온도는 25도")
    void tempUpLessThan25() {
        ac.turnOn();
        for (int i = ac.getTemperature(); i < 30; i++) {
            ac.temperatureUp();
        }
        assertEquals(25, ac.getTemperature());
    }

    @Test
    @DisplayName("온도 내리기")
    void tempDown() {
        ac.turnOn();
        int beforeTemp = ac.getTemperature();
        ac.temperatureDown();
        assertEquals(beforeTemp - 1, ac.getTemperature());
    }

    @Test
    @DisplayName("최저 온도는 18도")
    void tempUpGreaterThan18() {
        ac.turnOn();
        for (int i = ac.getTemperature(); i > 10; i--) {
            ac.temperatureDown();
        }
        assertEquals(18, ac.getTemperature());
    }

    @Test
    @DisplayName("off 상태에서 온도 볼 수 없음")
    void tempCheckAtOffStatus() {
        assertThrows(RuntimeException.class, ac::getTemperature);
        // setTemperature 메서드는 protected 접근제한자로 막아두었음
        // assertThrows(RuntimeException.class, ac::setTemperature);
    }

    @Test
    @DisplayName("off 상태에서 온도 조작하면 예외 발생")
    void tempControlAtOffStatus() {
        assertThrows(RuntimeException.class, ac::temperatureUp);
        assertThrows(RuntimeException.class, ac::temperatureDown);
    }

    @Test
    @DisplayName("삼성 에어컨")
    void samsung() {
        assertEquals("SAMSUNG", new SamsungAirConditioner().getBrand());
    }

    @Test
    @DisplayName("LG 에어컨")
    void life_is_good() {
        assertEquals("LG", new LGAirConditioner().getBrand());
    }

}
