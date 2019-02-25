package lesson2;

public class Person2 {
    public static void main(String[] args) {

        WorkWithString test = new WorkWithString();
        String t = test.eachNth("fufjufnfifn", 2);

        System.out.println();
        System.out.println(t);

        System.out.println(WorkWithString.eachNth("Mirace",2));
        System.out.println(WorkWithString.eachNth("abcdefg",2));
        System.out.println(WorkWithString.eachNth("abcdefg",3));

    }
}