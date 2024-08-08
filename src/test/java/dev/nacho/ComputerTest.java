package dev.nacho;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComputerTest {

    @Test
    void testGetterAndSetter() {
        Computer computer = new Computer("HP", 8, "V7", "Windows 10", 1200);
        computer.setBrand("Mac");
        computer.setMemory(16);
        computer.setProcessor("M2");
        computer.setOs("apple");
        computer.setPrice(3500.34);
        assertEquals("Mac", computer.getBrand());
        assertEquals(16, computer.getMemory());
        assertEquals("M2", computer.getProcessor());
        assertEquals("apple", computer.getOs());
        assertEquals(3500.34, computer.getPrice());
        
    }
}
