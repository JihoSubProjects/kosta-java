package kosta.jihogrammer.electronic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Factory {

    @Test
    void 에어컨_제작() {
        Electronic product = new SamsungAirConditioner();
        assertTrue(product.isState());
    }

    @Test
    void 리모컨_연결() {
        AirConditioner product = new SamsungAirConditioner();
        RemoteController<AirConditioner> remoteController = new RemoteController<>(product);
        remoteController.turnOn();
        assertTrue(product.isPower());
    }

    @Test
    void 에어컨_끄기() {
        AirConditioner product = new SamsungAirConditioner();
        RemoteController<AirConditioner> remoteController = new RemoteController<>(product);
        remoteController.turnOn();
        remoteController.turnOff();
        assertFalse(product.isPower());
    }

    @Test
    void 에어컨_올리기() {
        AirConditioner product = new SamsungAirConditioner();
        RemoteController<AirConditioner> remoteController = new RemoteController<>(product);
        remoteController.turnOn();
        remoteController.up();
        assertEquals(product.getTemperature(), 10);
    }

    @Test
    void 에어컨_내리기() {
        AirConditioner product = new SamsungAirConditioner();
        RemoteController<AirConditioner> remoteController = new RemoteController<>(product);
        remoteController.turnOn();
        remoteController.down();
        assertEquals(product.getTemperature(), -10);
    }

}
