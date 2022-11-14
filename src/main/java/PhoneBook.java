import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> myPhoneBook = new HashMap<>();

    public boolean add(String name, String number) {
        if (myPhoneBook.isEmpty()) {
            myPhoneBook.put(name, number);
            System.out.println("Добавлен первый контакт");
            return true;
        }
        if (!myPhoneBook.containsKey(name)) {
            myPhoneBook.put(name, number);
            System.out.println("Контакт добавлен" + "\nОбщее колличествоконтактов " +
                    myPhoneBook.size());
            return true;
        } else {
            System.out.println("Контакт с таким именем уже есть" + "\nОбщее колличествоконтактов " +
                    myPhoneBook.size());
            return false;
        }
    }

    public String findByNumber(String number) {
        return null;
    }
}
