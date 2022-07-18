import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");
        strings.forEach(Main::staticMethod);
        Main m = new Main();
        strings.forEach(m::method);

        List<User> users = new LinkedList<>();
        users.add(new User("Вася"));
        users.add(new User("Коля"));
        users.add(new User("Петя"));

        users.forEach(User::print);
    }

    public void method(String s) {

    }

    public static void staticMethod(String s) {

    }
}