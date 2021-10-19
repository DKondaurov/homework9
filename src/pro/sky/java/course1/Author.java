package pro.sky.java.course1;

import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {

        return surname;
    }

    public String toString() {
        return name + " " + surname;
    }


    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
            return name.equals(author.name) && surname.equals(author.surname);
    }


    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
