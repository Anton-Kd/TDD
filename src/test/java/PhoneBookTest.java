
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @ParameterizedTest
    @CsvSource({
            "Petya, 231245, 1",
            "Olga, 456789 , 2",
            "Anton, 123456, 3",
            "Olga, 456781 , 3",
            "Anton, 123456, 3"
    })
    void addTest(String name, int phoneNumber, int count) {
        int result = phoneBook.add(name, phoneNumber);
        Assertions.assertEquals(count, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Petya, 231245",
            "Olga, 456789",
            "Anton, 123456",
    })
    void findByNumberTest(String name, int number) {
        phoneBook.add(name, number);
        String result = phoneBook.findByNumber(number);
        System.out.println(result + " === " + number);
        Assertions.assertEquals(name, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Petya, 231245",
            "Olga, 456789",
            "Anton, 123456",
    })
    void findByNameTest(String name, int number) {
        phoneBook.add(name, number);
        int result = phoneBook.findByName(name);
        Assertions.assertEquals(number, result);
    }

    @Test
    void printAllNamesTest() {
        phoneBook.add("Petya", 231245);
        phoneBook.add("Olga", 456789);
        phoneBook.add("Anton", 123456);
        String[] actual = {"Anton", "Olga", "Petya" };
        String[] result = phoneBook.printAllNames();
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(actual, result);

    }
}