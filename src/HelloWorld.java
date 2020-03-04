public class HelloWorld {
    public static void main(String[] args) {
        Person p = new Person();

        p.name = "Max";
        p.nr   = 123;
        p.printPerson();

        Person.test();
    }
}

class Person {
    String name;
    int nr;

    public void printPerson () {
        System.out.println("My name is: " + name);
        System.out.println("My number is: " + nr);
    }

    public static void test() {
        System.out.println("I'm static");
    }

}
