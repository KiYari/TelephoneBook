import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String phoneNum) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>() {{add(phoneNum);}});
            return;
        }

        ArrayList<String> temp = phoneBook.get(name);

        if (!temp.contains(phoneNum) && phoneNum != null) {
            temp.add(phoneNum);
        } else {
            System.out.println("Nothing to add");
        }


        phoneBook.put(name, temp);
    }

    public void remove(String name, String phoneNum) {
        if (phoneBook.containsKey(name) && phoneNum != null) {
            phoneBook.get(name).remove(phoneNum);
        } else {
            System.out.println("Nothing to remove");
        }
    }

    public void update(String name, String oldNumber, String newNumber) {
        ArrayList<String> numbers = phoneBook.get(name);
        if (numbers != null && oldNumber != null && newNumber != null) {
            numbers.remove(oldNumber);
            numbers.add(newNumber);
        } else {
            System.out.println("Nothing to update");
        }
    }

    public ArrayList<String> find(String name) {
        if (!phoneBook.containsKey(name)) {
            return new ArrayList<>();
        }
        return phoneBook.get(name);

    }

    public HashMap<String, ArrayList<String>> getPhoneBook() {
        return phoneBook;
    }

    @Override
    public String toString() {
        return "TelephoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
