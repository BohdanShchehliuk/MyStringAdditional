package String;

public class MyArrayListImpl implements MyList {
    private final int INITIAL_SIZE = 10;
    private String[] array;
    int counter;

    public MyArrayListImpl() {
        array = new String[INITIAL_SIZE];
    }


    private String[] resize() {
        String[] arrayNew = new String[array.length * 2];
        System.arraycopy(array, 0, arrayNew, 0, (array.length));
        array = arrayNew;
        return array;
    }

    public boolean cheakingAdd(int positon) {
        if (positon > counter || positon < 0) {
            System.out.printf("Ви ввели невірну позицію %d. Вона не може бути меншою за 0 та більшою за %d\n", positon, counter);
            return false;
        }
        return true;
    }

    public boolean cheaking() {
        if (array == null) {
            System.out.println("Ваша стрічка пуста");
            return false;
        }
        return true;
    }

    public boolean cheakingRemove(int position) {
        if (position >= counter || !cheaking() || position < 0) {
            System.out.println("Ви ввели невірний індекс або масив пустий. Код:\n -1");
            return false;
        }
        return true;
    }

    public void show() {
        for (int i = 0; i < counter; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.println(" ");
    }

    @Override
    public void add(String string) {
        add(string, counter);
    }

    @Override
    public void add(String string, int positon) {
        if (!cheakingAdd(positon)) {
            return;
        } else if (counter == array.length - 1) {
            resize();
        }
        String[] arrayNew = new String[counter + 1];
        System.arraycopy(array, 0, arrayNew, 0, (positon));
        arrayNew[positon] = string;
        System.arraycopy(array, positon, arrayNew, positon + 1, (counter - positon));
        array = arrayNew;
        counter++;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void removeAll(String string) {
        if (cheaking() || string == null) {
            return;
        } else {
            String[] arrayNew = new String[array.length];
            int numberOfdifference = 0;
            for (int i = 0; i < counter; i++) {
                if (string != null && array[i] != null && !array[i].equals(string)) {
                    arrayNew[numberOfdifference++] = array[i];
                }
            }
            System.out.printf("Слово _%s_ зустрічається кількість разів: %d. \n", string, counter - numberOfdifference);
            String[] arrayAdd = new String[numberOfdifference];
            System.arraycopy(arrayNew, 0, arrayAdd, 0, (numberOfdifference));
            array = arrayAdd;
            counter = numberOfdifference;
        }
    }

    @Override
    public void remove(String string) {
        int position = indexOf(string);
        if (position == -1) {
            System.out.println("-1");
            return;
        } else {
            remove(position);
        }
    }

    @Override
    public void remove(int position) {
        if (!cheakingRemove(position)) {
            return;
        } else {
            System.arraycopy(array, position + 1, array, position, (counter - (position + 1)));
            counter--;
        }
    }

    @Override
    public void clear() {
        counter = 0;
        array = new String[INITIAL_SIZE];
    }

    @Override
    public void set(String string, int position) {
        if (!cheakingRemove(position)) {
            return;
        } else {
            array[position] = string;
        }
    }

    @Override
    public int indexOf(String string) {
        for (int i = 0; i < counter; i++) {
            if (string == null && array[i] == null) {
                return i;
            } else if (array[i] != null && array[i].equals(string)) {
                return i;
            }
        }
        System.out.println("Ви ввели невірний рядок. Код ");
        return -1;
    }


    @Override
    public String get(int position) {
        if (!cheakingRemove(position)) {
            return null;
        } else {
            return array[position];
        }
    }
}
