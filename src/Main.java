import lesson9.Author;
import lesson9.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Иванов", "Иван");
        Author author2 = new Author("Петров", "Петр");
        Book first = new Book("Весна", author1, 2022);
        Book second = new Book("Май",author2 , 2002);
        System.out.println("первая книга: " + first.getTitle());
        System.out.println("Автор: " + first.getAuthor());
        System.out.println("Год издания: " + first.getYearPublishing());
        System.out.println("вторая книга: " + second.getTitle());
        System.out.println("Автор: " + second.getAuthor());
        System.out.println("Год издания: " + second.getYearPublishing());
        first.setYearPublishing(1998);
        System.out.println("Год издания изменен:" + first.getYearPublishing());
        System.out.println(first.equals(second));
        System.out.println(first);
    }
}