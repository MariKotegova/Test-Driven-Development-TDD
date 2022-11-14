import java.util.*;
import java.util.stream.Collectors;

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
        if (myPhoneBook.isEmpty()) {
            return null;
        } else {
            for (Map.Entry<String, String> kv : myPhoneBook.entrySet()) {
                if (kv.getValue() == number) {
                    return kv.getKey();
                }
            }
            return null;
        }
    }

    public String findByName(String name) {
        if (myPhoneBook.isEmpty()) {
            return null;
        } else {
            return myPhoneBook.get(name);
        }
    }

    public String printAllNames() {
        if (myPhoneBook.isEmpty()) {
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(myPhoneBook.keySet().stream()
                    .sorted()
                    .collect(Collectors.toList()));
            String result = stringBuilder.toString().substring(1, stringBuilder.length() - 1);
            return result;
        }
    }
}
