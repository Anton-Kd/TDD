import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashMap;
import java.util.Map;

class PhoneBookTest {



@ParameterizedTest
@CsvSource({
        "Petya, 231245, 1",
        "Olga, 456789 , 2",
        "Anton, 123456, 3"
})

    void addTest(String name, int phoneNumber, int count) {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add(name,phoneNumber);
    Assertions.assertEquals(count,result);

    }
}