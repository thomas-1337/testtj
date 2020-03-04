public class HelloWorld {
    public static void main(String[] args) {
        Person p = new Person("Thomas","Jungmann");

        System.out.println(p.getFullName());

    }
}

class Person {
    private String lastName;
    private String firstName;

    public Person(String f, String l) {
        firstName = f;
        lastName = l;
    }

    String getFullName(){
        return firstName + " " + lastName;
    }
}
