import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> myPhoneBook = new HashMap<>();

    public boolean add (String name, String number){
        if(myPhoneBook.isEmpty()){
            myPhoneBook.put(name, number);
            System.out.println("В телефонную книгу добавлен 1 контакт");
            return true;
        }
        if(!myPhoneBook.containsKey(name)){
            myPhoneBook.put(name, number);
            System.out.println("Контакт добавлен" + "\nОбщее колличествоконтактов " +
                    myPhoneBook.size());
            return true;
        } else {
            System.out.println("Контакт с таким именем уже есть" + "\nОбщее колличествоконтактов " +
                    myPhoneBook.size());
            return false;
        }
        //add - добавить имя с номером. Метод должен возвращать количество
        // контактов после добавления, при этом гарантируется, что не будут добавляться повторяющиеся имена;

    }
}
