package String;

import javax.print.attribute.standard.RequestingUserName;
import java.lang.reflect.Array;

public class MyArrayListImpl implements MyList {
    String[] array = null;
    String[] arrayNew;

    @Override
    public void add(String string) {
        if (array == null) {
            array = new String[1];
            array[0] = string;
            this.array = array;
        } else {
            String[] arrayNew = new String[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                arrayNew[i] = array[i];
            }
            arrayNew[array.length] = string;
            this.array = arrayNew;
        }
    }

    @Override
    public void add(String string, int position) {
        if (array == null) {
            array = new String[1];
            array[0] = string;
            this.array = array;
        } else if (position < array.length + 1) {
            String[] arrayNew = new String[array.length + 1];
            for (int i = 0; i < array.length + 1; i++) {
                if (i < position) {
                    arrayNew[i] = array[i];
                } else if (i == position) {
                    arrayNew[i] = string;
                } else if (i > position) {
                    arrayNew[i] = array[i - 1];
                }
            }
            this.array = arrayNew;
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
                if (array[i] != string) {
                    arrayNew[numberOfequaels] = array[i];
                    numberOfequaels++;
                }
            }
            String[] arrayAdd = new String[numberOfequaels];
            for (int i = 0; i < arrayAdd.length; i++) {
                arrayAdd[i] = arrayNew[i];
            }
            this.array = arrayAdd;
        }
    }


    @Override
    public void remove(int positon) {
        if (array == null) {
            System.out.println("Ваша стрічка пуста");
        } else {
            String[] arrayNew = new String[array.length - 1];
            int numberNew = 0;
            for (int i = 0; i < (array.length); i++) {
                if (i != positon) {
                    arrayNew[numberNew] = array[i];
                    numberNew++;
                }
            }
            String[] arrayAdd = new String[arrayNew.length];
            for (int i = 0; i < arrayAdd.length; i++) {
                arrayAdd[i] = arrayNew[i];
            }
            this.array = arrayNew;
        }
    }

    @Override
    public void clear() {
        this.array = null;
    }

    @Override
    public void set(String string, int position) {
        if (position >= array.length) {
            System.out.println("Ви ввели невірний індекс");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == position) {
                    array[i] = string;
                }
            }
        }
    }

    @Override
    public int indexOf(String string) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == string) {
                return i;
            }
        }
        System.out.print("Ви ввели невірний рядок. Код ");
        return -1;
    }

    @Override
    public String get(int position) {
        for (int i = 0; i < array.length; i++) {
            if (i == position) {
                return array[i];
            }
        }
        return "Ви ввели невірний рядок";
    }

    public String toStringa(String[] array) {
        String sentence = "";
        for (int i = 0; i < array.length; i++) {
            sentence = sentence + array[i] + " ";
        }
        return sentence;
    }
}
