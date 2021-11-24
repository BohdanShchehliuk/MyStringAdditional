package String;

public interface MyList {

    void add(String e);
    void add(String e, int pos);
    int size();
    void remove(String e);
    void remove(int pos);
    void clear();
    void set(String e, int pos);
    int indexOf(String e);
    String get(int pos);
}
