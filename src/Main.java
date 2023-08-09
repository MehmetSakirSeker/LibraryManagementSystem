
public class Main {
    public static void main(String[] args) {

        Book a = new Book("1984","George Orwell");
        Book b = new Book("Beloved","Toni Morrison");
        Book c = new Book("Great Expectations","Charles Dickens");
        Book d = new Book("Don Quixote","Miguel de Cervantes");
        Book e = new Book("Lord of the Rings","J.R.R. Tolkien Orwell");
        Book f = new Book("Alice's Adventures in Wonderland","By Lewis Carroll");
        Person person = new Person("Charles");

        person.barrowBook(a,b,c,d,e);
        System.out.println(person);
        person.barrowBook(f);




    }
}
