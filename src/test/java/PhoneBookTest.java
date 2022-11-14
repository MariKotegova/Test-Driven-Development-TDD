import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    PhoneBook sut;

    @BeforeAll
    public static void started(){
        System.out.println("tests started");
    }

    @BeforeEach
    public void init(){
        System.out.println("test started");
        sut = new PhoneBook();
    }

    @AfterEach
    public void finished(){
        System.out.println("test compled");
        sut = null;
    }

    @AfterAll
    public static void finishedTest(){
        System.out.println("tests compled");
    }

    @Test
    public void testAdd (){
        String name = "Petya";
        String number = "+7 777 777 7777";
        boolean expected = true;
        boolean resylt = sut.add(name, number);

        assertEquals(expected, resylt);
    }

    @Test
    public void testAddFalse (){
        String name = "Petya";
        String number = "+7 777 777 7777";
        boolean expected = false;
        sut.add(name, number);
        boolean resylt = sut.add(name, number);

        assertEquals(expected, resylt);
    }

    @Test
    public void testAddNewContect (){
        String name = "Petya";
        String number = "+7 777 777 7777";
        String name2 = "Tanya";
        String number2 = "+7 888 888 8888";
        boolean expected = true;
        sut.add(name, number);
        boolean resylt = sut.add(name2, number2);

        assertEquals(expected, resylt);
    }
}
