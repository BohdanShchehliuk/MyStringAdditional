package String;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        MyArrayListImpl list = new MyArrayListImpl();

        list.add("Щеглюк");
        list.show();

        list.add("Богдан");
        list.show();

        list.add("Петрович");
        list.show();

        list.add("любить", 3);
        list.show();

        System.out.println("Розмір масиву:" + list.size());

        list.add("Богдан", 4);
        list.show();

        list.removeAll("Богдан");
        list.show();

        list.add("Богдан", 3);
        list.show();

        list.remove("Богдан");
        list.show();

        list.remove(2);
        list.show();

        list.add("обожнює", 2);
        list.show();


        list.add("пити");
        list.show();

        list.add("каву");
        list.show();

        System.out.println("Розмір масиву:" + list.size());

        list.set("чай", 4);
        list.show();

        System.out.println(list.indexOf("любит"));

        System.out.println(list.get(2));

        list.show();

        list.set("Богдан", 1);
        list.show();

        list.remove(2);
        list.show();

        list.remove(3);
        list.show();

        list.clear();
        list.show();

        list.add("Дякую за увагу");
        list.show();
    }
}
