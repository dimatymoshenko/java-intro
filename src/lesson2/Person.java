package lesson2;

class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    Person(){}

    Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;
    }


    void doSomething() {
        String end = "is doing something";

        System.out.println(firstName + " " + secondName + end);
    }

    static {
        System.out.println("First class loading.");

    }

    {
        System.out.println(count + " class loading.");
    }
}