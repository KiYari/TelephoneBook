public class TelephoneBookTests {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.add("Kilirr", "8187171144");
        telephoneBook.add("Kilirr", "2424241114");
        telephoneBook.add("Papa", "81775927641728");
        telephoneBook.add("Pudge", "666666666666");
        telephoneBook.add("Mom", "777777777");
        telephoneBook.add("Basher", "8888888888");

        System.out.println(telephoneBook);

        telephoneBook.remove("Basher", "8888888888");
        System.out.println(telephoneBook);

        telephoneBook.update("Mom", "777777777", "122471");
        System.out.println(telephoneBook);

        System.out.println(telephoneBook.find("Kilirr"));

        System.out.println(telephoneBook.getPhoneBook());
    }
}
