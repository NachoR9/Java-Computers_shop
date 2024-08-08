package dev.nacho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ShopTest {

    @Test
    void testAddComputer() {
        Computer computer = new Computer("HP", 8, "V7", "Windows 10", 1200);
        Shop shop = new Shop("Informatic systems", "Henry Cavil", "35635273A");
        shop.addComputer(computer);
        assertTrue(shop.getComputers().contains(computer));
    }

    @Test
    void testDeleteByBrand() {
        Computer computer = new Computer("HP", 8, "V7", "Windows 10", 1200);
        Shop shop = new Shop("Informatic systems", "Henry Cavil", "35635273A");
        shop.addComputer(computer);
        shop.deleteByBrand(computer.getBrand());
        assertFalse(shop.getComputers().contains(computer));

    }

    @Test
    void testListAllComputers() {
        Computer computer = new Computer("HP", 8, "V7", "Windows 10", 1200);
        Shop shop = new Shop("Informatic systems", "Henry Cavil", "35635273A");
        shop.addComputer(computer);
        List<String> result = shop.listAllComputers();
        assertEquals(1, result.size());
    }

    @Test
    void testSearchByBrand() {
        Computer computer = new Computer("HP", 8, "V7", "Windows 10", 1200);
        Computer computer2 = new Computer("Lenovo", 8, "V7", "Windows 10", 1100);
        Shop shop = new Shop("Informatic systems", "Henry Cavil", "35635273A");
        shop.addComputer(computer);
        shop.addComputer(computer2);
        List<Computer> result = shop.searchByBrand("Lenovo");
        assertTrue(result.contains(computer2));
        assertFalse(result.contains(computer));

    }

    @Test
    void testGetterAndSetter() {
        Shop shop = new Shop("Informatic systems", "Henry Cavil", "35635273A");
        shop.setName("Mediamarkt");
        shop.setOwner("Cate Blanchett");
        shop.setTin("23749832F");
        assertEquals("Mediamarkt", shop.getName());
        assertEquals("Cate Blanchett", shop.getOwner());
        assertEquals("23749832F", shop.getTin());
    }
}
