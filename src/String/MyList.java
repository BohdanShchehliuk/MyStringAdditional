package String;

public interface MyList {

    void add(String string);

    void add(String string, int positon);

    int size();

    void remove(String string);

    void removeAll(String string);

    void remove(int positon);

    void clear();

    void set(String string, int positon);

    int indexOf(String string);

    String get(int positon);
}
