package lesson4.hw;

import java.util.ArrayList;
/*
1.2. Из коллекции удаляется одно из значений
1.3. Выполняется проверка, что коллекция больше не содержит удаленный объект (результат проверки выводится в консоль)
1.4. Выполняется сортировка объектов коллекции (Collections class в помощь)
1.5. Выполняется поочередный вывод строк в консоль до сортировки и после (Iterator class в помощь)
2. Закоммитить изменения и добавить их в репозиторий на GitHub.
3. Прислать ссылку на репозиторий.
    */
public class Program {
    public static void main(String[] args) {
        WorkWithCollections work = new WorkWithCollections();
        ArrayList<String> list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("From");
        list.add("Our");
        list.add("team");
        list.add("and");
        list.add("Good");
        list.add("luck");

        System.out.println("Step1-------------------Create and print");
        work.printToConsole(list);
        System.out.println("Step2-------------------Remove item 'Hello' and print");
        work.removeItem("Hello",list);
        work.printToConsole(list);
        System.out.println("Step3-------------------Remove item by index '2' and print");
        work.removeItem(2,list);
        work.printToConsole(list);
        System.out.println("Step4-------------------Sort collection and print");
        work.sortCollection(list);
        work.printToConsole(list);
    }
}