package String;

import java.util.Arrays;

public class Main {

    public static void main(String[] arg) {
        MyArrayListImpl list = new MyArrayListImpl();
        list.add("Щеглюк");
        System.out.println(Arrays.toString(list.array));

        list.add("Богдан");
        System.out.println(Arrays.toString(list.array));

        list.add("Петрович");
        System.out.println(Arrays.toString(list.array));

        list.add("любить", 3);
        System.out.println(Arrays.toString(list.array));

        System.out.println(list.size());

        list.add("Богдан", 4);
        System.out.println(Arrays.toString(list.array));

        list.remove("Богдан");
        System.out.println(Arrays.toString(list.array));

        list.remove(1);
        System.out.println(Arrays.toString(list.array));

        list.add("пити");
        System.out.println(Arrays.toString(list.array));
        list.add("каву");
        System.out.println(Arrays.toString(list.array));

        list.set("чай", 3);
        System.out.println(Arrays.toString(list.array));

        System.out.println(list.indexOf("любит"));

        System.out.println(list.get(2));

        System.out.println(list.toStringa(list.array));

        list.clear();
        System.out.println(Arrays.toString(list.array));
    }
}