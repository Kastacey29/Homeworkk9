package lesson9;

public class Author {
    private final String surname, name;

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }
}