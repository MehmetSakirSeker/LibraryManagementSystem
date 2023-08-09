import java.util.ArrayList;

public class Person implements Receiver {

    private String name;
    private static int countOfBarrowedBooks=0;
    private ArrayList<Book> barrowedBooks;

    public Person(String name) {
        this.name = name;
        barrowedBooks = new ArrayList<>();
    }

    @Override
    public void barrowBook(Book... books) {
        if (books.length+barrowedBooks.size() > 5) {
            System.out.println("CAREFUL !!!! You do not allow to barrow more than 5 books.");
        } else {
            for (Book b : books) {
                barrowedBooks.add(b);
                countOfBarrowedBooks++;
            }

        }
    }
    @Override
    public void returnBook(Book... books) {
        System.out.println("Thank you for receiving book(s).");
        for (Book b :books){
            barrowedBooks.remove(b);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" has barrowed the fallowing books : ");

        for(Book book : barrowedBooks){
            sb.append("\n -").append(book.getName()).append(" by ").append(book.getAuthor());

        }
        return sb.toString();
    }
}
