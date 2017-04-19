/**
 * Created by Nico on 4/19/17 17:20.
 */
public class Test {
    private Book book;

    public void setBook() {
        book = new Book("test");
    }

    public static void main(String[] args) {
        Test test = new Test();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            test.setBook();
        }
    }
}

class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
