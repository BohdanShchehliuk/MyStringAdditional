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

        System.out.println(list.size());

        list.add("Богдан", 4);
        list.show();

        list.remove("Богдан");
        list.show();

        list.remove(1);
        list.show();

        list.add("пити");
        list.show();
        list.add("каву");
        list.show();

        list.set("чай", 3);
        list.show();

        System.out.println(list.indexOf("любит"));

        System.out.println(list.get(2));

        list.show();

        list.clear();

        list.show();
    }
}
