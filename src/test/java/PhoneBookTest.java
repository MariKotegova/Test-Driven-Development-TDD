import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PhoneBookTest {

    PhoneBook sut;

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new PhoneBook();
    }

    @AfterEach
    public void finished() {
        System.out.println("test compled");
        sut = null;
    }

    @AfterAll
    public static void finishedTest() {
        System.out.println("tests compled");
    }

    @Test
    public void testAdd() {
        String name = "Petya";
        String number = "+7 777 777 7777";
        boolean expected = true;
        boolean result = sut.add(name, number);

        assertEquals(expected, result);
    }

    @Test
    public void testAddFalse() {
        String name = "Petya";
        String number = "+7 777 777 7777";
        boolean expected = false;
        sut.add(name, number);
        boolean result = sut.add(name, number);

        assertEquals(expected, result);
    }

    @Test
    public void testAddNewContect() {
        String name = "Petya";
        String number = "+7 777 777 7777";
        String name2 = "Tanya";
        String number2 = "+7 888 888 8888";
        boolean expected = true;
        sut.add(name, number);
        boolean result = sut.add(name2, number2);

        assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber() {
        String name = "Petya";
        String number = "+7 777 777 7777";
        String name2 = "Tanya";
        String number2 = "+7 888 888 8888";
        sut.add(name, number);
        sut.add(name2, number2);
        String expected = "Petya";

        String result = sut.findByNumber(number);

        assertEquals(expected, result);
    }

    @Test
    public void testFindByNumberNull() {

        String result = sut.findByNumber("+7 666 666 6666");

        assertNull(result);
    }

    @Test
    public void testFindByName() {
        String name = "Petya";
        String number = "+7 777 777 7777";
        String name2 = "Tanya";
        String number2 = "+7 888 888 8888";
        sut.add(name, number);
        sut.add(name2, number2);
        String expected = "+7 888 888 8888";

        String result = sut.findByName(name2);

        assertEquals(expected, result);
    }

    @Test
    public void testFindByNameNull2() {
        String name = "Petya";
        String number = "+7 777 777 7777";
        String name2 = "Tanya";
        sut.add(name, number);

        String result = sut.findByName(name2);

        assertNull(result);

    }

    @Test
    public void testFindByNameNull() {

        String result = sut.findByName("Tanya");

        assertNull(result);
    }
}
