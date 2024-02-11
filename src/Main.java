public class Main {
    public static void main(String[] args) {
        GenericStorage<Person> gs = new GenericStorage<>();
        gs.addItem(new Student("asd", 1));
        gs.addItem(new Student("asd", 1));
        gs.addItem(new Student("asd", 1));
        gs.addItem(new Teacher("asd", 1));
        gs.addItem(new Teacher("asd", 1));

        gs.removeItem(5);

        gs.addItem(new Student("asd", 1));

        System.out.println(gs.searchItem(4));

        System.out.println("---------------------------------");

        gs.displayAllItems();
    }
}