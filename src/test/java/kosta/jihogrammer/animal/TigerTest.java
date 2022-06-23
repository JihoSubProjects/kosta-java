package kosta.jihogrammer.animal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TigerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void 호랑이_이름() {
        String name = "호랑이";
        Animal animal = new Tiger(name);
        assertEquals(animal.getName(), name);
    }

    @Test
    void 잠자는_사자_말고_호랑이() {
        String name = "호랑이";
        Animal animal = new Tiger(name);
        animal.sleep();
        assertEquals(name + " 잠들다.\n", outContent.toString());
    }

    @Test
    void 뛰는_호랑이() {
        String name = "호랑이";
        Animal animal = new Tiger(name);
        animal.move();
        assertEquals(name + " 뛰다.\n", outContent.toString());
    }

    @Test
    void 백호() {
        String name = "백호";
        String color = "white";
        Animal animal = new Tiger(name);
        animal.setColor(color);
        assertEquals(color, animal.getColor());
    }

    @Test
    void 호랑이_다리는_4개() {
        assertEquals(
                4,
                new Tiger("tiger", 4).getLeg()
        );
    }

    @Test
    void 그_호랑이는_결투_이후_다리_하나를_잃었다() {
        Tiger looser = new Tiger("tiger", 4);
        looser.setLeg(looser.getLeg() - 1);
        assertEquals(3, looser.getLeg());
    }

}
