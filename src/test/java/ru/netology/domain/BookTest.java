package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BookTest {

    @Test
    public void shouldUseEqualsBook() {
        Book book3 = new Book(5, "Основание", 800, "А. Азимов");
        Book book4 = new Book(5, "Основание", 800, "А. Азимов");

        assertEquals(book3, book4);
    }

    @Test
    public void shouldUseNoEqualsBook() {
        Book book3 = new Book(5, "Основание", 800, "А. Азимов");
        Book book4 = new Book(5, "Основание", 900, "А. Азимов");

        assertNotEquals(book3, book4);
    }

    @Test
    public void shouldUseEqualsBookSame() {
        Book book3 = new Book(5, "Основание", 800, "А. Азимов");
        Book book4 = book3;

        assertEquals(book3, book4);
    }

    @Test
    public void shouldUseNoEqualsBookNull() {
        Book book3 = new Book(5, "Основание", 800, "А. Азимов");
        Book book4 = null;

        assertNotEquals(book3, book4);
    }

    @Test
    public void shouldUseNoEqualsBookClass() {
        Book book3 = new Book(5, "Основание", 800, "А. Азимов");
        String book4 = "One interesting book";

        assertNotEquals(book3, book4);
    }

    @Test
    public void shouldUseHashCodeBook() {
        Book book3 = new Book(5, "Основание", 800, "А. Азимов");
        Book book4 = new Book(5, "Основание", 800, "А. Азимов");

        assertEquals(book3.hashCode(), book4.hashCode());
    }

    @Test
    public void shouldSetBookAuthor() {
        Book book = new Book();
        book.setAuthor("Бродский");

        String expected = "Бродский";
        String actual = book.getAuthor();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldToStringBook() {
        Book book = new Book(8, "Стихи", 500, "И. Бродский");
        String expected = "Book{id=8, name='Стихи', price=500, author='И. Бродский'}";

        assertEquals(expected, book.toString());
    }
}
