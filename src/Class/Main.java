package Class;

import java.util.Arrays;

public class Main extends One {

    public static void main (String [] arg) {
       One one = new One();
        one.add("Щеглюк");

        System.out.println(Arrays.toString(one.array));

    }
}
