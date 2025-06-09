import java.util.*;

public class PhoneBook {

    private static final Map<String, Integer> book = new TreeMap<>();

    public int add(String name, int number) {
        if (book.containsKey(name)) {
            System.out.println("Абонент с таким именем уже есть.");
        } else {
            book.put(name, number);
            System.out.println("Колличество абонетов: " + book.size());
        }
        return book.size();
    }

    public String findByNumber(int number) {
        for (Map.Entry<String, Integer> entry : book.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return "Абонента с номером: " + number + " нет."; // Если значение не найдено
    }

    public int findByName(String name) {
        if (!book.containsKey(name)) {
            System.out.printf("Абонента под именем %s нет.", name);
        }
        return book.get(name);
    }

    public String[] printAllNames() {
        Set<String> keys = book.keySet(); // Получаем Set ключей
        return keys.toArray(new String[0]);
    }
}
