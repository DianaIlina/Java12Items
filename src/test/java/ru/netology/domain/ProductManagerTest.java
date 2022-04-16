package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductManagerTest {
    Product book1 = new Book(1, "Мы", 500, "Е. Замятин");
    Product book2 = new Book(2, "1984", 600, "Дж. Оруелл");
    Product phone1 = new Smartphone(3, "Galaxy X", 2500, "Samsung");
    Product phone2 = new Smartphone(4, "IPhone XS", 2700, "Apple");

    ProductRepository repo = new ProductRepository();

    private void fillWithProducts(ProductRepository repo) {
        repo.save(book1);
        repo.save(book2);
        repo.save(phone1);
        repo.save(phone2);
    }

    @Test
    public void shouldAdd() {
        fillWithProducts(repo);
        ProductManager manager = new ProductManager(repo);

        Product book3 = new Book(3, "Основание", 800, "А. Азимов");

        manager.add(book3);

        Product[] expected = {book1, book2, phone1, phone2, book3};
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldSave() {
        fillWithProducts(repo);
        Product[] expected = {book1, book2, phone1, phone2};
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        fillWithProducts(repo);

        Product[] expected = {book1, phone1, phone2};
        Product[] actual = repo.removeById(2);

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldSearchBy() {
        fillWithProducts(repo);
        ProductManager manager = new ProductManager(repo);

        Product[] expected = {book2};
        Product[] actual = manager.searchBy("1984");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMatches() {
        ProductManager manager = new ProductManager();

        boolean expected = true;
        boolean actual = manager.matches(book2, "1984");

        assertEquals(expected, actual);
    }
}
