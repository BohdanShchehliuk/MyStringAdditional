package String;

import javax.print.attribute.standard.RequestingUserName;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayListImpl implements MyList {
 private String[] array;
  private String[] arrayNew;


  public void show (){
      System.out.println(Arrays.toString(array));
  }
    @Override
    public void add(String string) {
        if (array == null) {
            array = new String[1];
            array[0] = string;
        } else {
            String[] arrayNew = new String[array.length + 1];
            arrayNew[array.length] = string;
            System.arraycopy(array,0,arrayNew,0,(arrayNew.length-1));
            array = arrayNew;
        }
    }

    @Override
    public void add(String string, int positon) {
        if (array == null) {
            System.out.println("Ви створили перший запис у масиві даних. До цього цього не було");
            array = new String[1];
            array[0] = string;
            array = array;
        } else if (positon <= array.length && positon>=0 ) {
            String[] arrayNew = new String[array.length + 1];
            System.arraycopy(array,0,arrayNew,0,(positon));
            arrayNew[positon] = string;
            System.arraycopy(array,positon,arrayNew,positon+1,(array.length-positon));
            array = arrayNew;
        } else {
            System.out.println("Ви ввели не вірний індекс");
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void remove(String string) {
        if (array == null) {
            System.out.println("Ваша стрічка пуста");
        } else {
            String[] arrayNew = new String[array.length];
            int numberOfequaels = 0;
            for (int i = 0; i < (arrayNew.length); i++) {
                if (array[i].equals(string)==false) {
                    arrayNew[numberOfequaels] = array[i];
                    numberOfequaels++;
                }
            }
            String[] arrayAdd = new String[numberOfequaels];
            System.arraycopy(arrayNew,0,arrayAdd,0,(numberOfequaels));
            array = arrayAdd;
        }
    }

    @Override
    public void remove(int positon) {
        if (array == null) {
            System.out.println("Ваша стрічка пуста");
        } else if (positon <= array.length &&positon>=0) {
            String[] arrayNew = new String[array.length - 1];
            int numberNew = 0;
            for (int i = 0; i < (array.length); i++) {
                if (i != positon) {
                    arrayNew[numberNew] = array[i];
                    numberNew++;
                }
            }
           array = arrayNew;
        } else {
            System.out.println("Ви ввели невірний індекс");
        }
    }

    @Override
    public void clear() {
        array = null;
    }

    @Override
    public void set(String string, int position) {
        if (position >= array.length) {
            System.out.println("Ви ввели невірний індекс");
        } else {
            array[position] = string;
        }
    }

    @Override
    public int indexOf(String string) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(string)) {
                return i;
            }
        }
        System.out.print("Ви ввели невірний рядок. Код ");
        return -1;
    }

    @Override
    public String get(int position) {
        if (position >= array.length) {
            return "Ви ввели невірний рядок";
        } else {
            return array[position];
        }
    }
    public void setArray(String[] array) {
        this.array = array;
    }
}
