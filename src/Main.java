import lesson9.Author;
import lesson9.Book;

public class Main {
    public static void main(String[] args) {
        Book first = new Book("Весна", new Author("Иванов", "Иван"), 2022);
        Book second = new Book("Май", new Author("Петров", "Петр"), 2002);
        System.out.println("первая книга: " + first.getTitle());
        System.out.println("Автор: " + first.getAuthor());
        System.out.println("Год издания: " + first.getYearPublishing());
        System.out.println("вторая книга: " + second.getTitle());
        System.out.println("Автор: " + second.getAuthor());
        System.out.println("Год издания: " + second.getYearPublishing());
        first.setYearPublishing(1998);
        System.out.println("Год издания изменен:" + first.getYearPublishing());
    }
}