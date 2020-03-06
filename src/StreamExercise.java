import java.util.*;
import java.util.stream.Collectors;

class User {
    private String firstName;
    private String lastName;
    private boolean isAdmin;

    public User(String firstName, String lastName, boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString() {
        return "User(" + firstName + " " + lastName + ", " + (isAdmin ? "admin" : "regular") +")";
    }
}

public class StreamExercise {




    static List<User> users = Arrays.asList(
            new User("Clara" , "Carlton", true),
            new User("John", "Doe", false),
            new User("Michael", "Murrey", true),
            new User("Julia", "Jackson", false)
    );

    public static void main(String[] args) {
        // Example
        List<Integer> list = Arrays.asList(4,2,7,4,5);

        List<Integer> newList = list
                .stream()
                .map(n -> n+5)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(newList);



        // Exercise 1: Get a list of all lastnames
        // use a stream, a map operation with a lambda and
        // a list collector (call collect on the stream)

        List<String> lastnames = users.stream().map((User u) -> u.getLastName()).collect(Collectors.toList());

        System.out.println(lastnames);



        // ----------------------------------------
        // Exercise 2: Get a list of all admins
        // use a stream, a filter operation with a lambda and
        // a list collector (call collect on the stream)

        List<User> onlyAdmins = users.stream().filter((User u) -> u.isAdmin()).collect(Collectors.toList());

        System.out.println(onlyAdmins);



        // -------------------------------------------
        // Exercise 3: Sort the users by firstname
        // use a stream and call sorted
        // sorted needs a function to compare two users by firstname
        // Example: (u1, u2) -> u1.getFirstName().compareTo(...)

        List<User> sortedByFirstName = users.stream().sorted((User u1, User u2) -> u1.getFirstName().compareTo(u2.getFirstName())).collect(Collectors.toList());

        System.out.println(sortedByFirstName);



        // --------------------------------------------
        // Exercise 4: Group the users into admins and regular users
        // use a stream, and lookup Collectors.groupingBy
        // you will again need a lambda for the grouping

        Map<Boolean, List<User>> groupedByAdmin = users.stream().collect(Collectors.groupingBy((User u) -> u.isAdmin()));

        System.out.println(groupedByAdmin);

    }

}
