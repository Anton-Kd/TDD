import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private static final Map<String, Integer> phoneBook = new HashMap<>();

    public int add(String name, int number) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Абонент с таким именем уже есть.");
        } else {
            phoneBook.put(name, number);
            System.out.println("Колличество абонетов: " + phoneBook.size());
        }
        return phoneBook.size();
    }

    public String findByNumber(int number) {
        return null;
    }
}
