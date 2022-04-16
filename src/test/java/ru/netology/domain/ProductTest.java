package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void shouldUseEqualsProduct() {
        Product product1 = new Product(7, "Продукт", 5000);
        Product product2 = new Product(7, "Продукт", 5000);

        assertEquals(product1, product2);
    }

    @Test
    public void shouldUseNoEqualsProduct1() {
        Product product1 = new Product(8, "Продукт", 6000);
        Product product2 = new Product(7, "Продукт", 6000);


        assertNotEquals(product1, product2);
    }

    @Test
    public void shouldUseNoEqualsProduct2() {
        Product product1 = new Product(7, "Продукт", 6000);
        Product product2 = new Product(7, "Продукт2", 6000);


        assertNotEquals(product1, product2);
    }

    @Test
    public void shouldUseNoEqualsProduct3() {
        Product product1 = new Product(7, "Продукт", 6000);
        Product product2 = new Product(7, "Продукт", 5000);


        assertNotEquals(product1, product2);
    }

    @Test
    public void shouldUseEqualsProductSame() {
        Product product1 = new Product(7, "Продукт", 6000);
        Product product2 = product1;
        assertEquals(product1, product2);
    }

    @Test
    public void shouldUseNoEqualsProductNull() {
        Product product1 = new Product(7, "Продукт", 6000);
        Product product2 = null;
        assertNotEquals(product1, product2);
    }

    @Test
    public void shouldUseEqualsProductObject() {
        Product product1 = new Product(7, "Продукт", 6000);

    }

    @Test
    public void shouldUseNoEqualsProductClass() {
        Product product1 = new Product(7, "Продукт", 6000);
        String product2 = "One new product";

        assertNotEquals(product1, product2);
    }

    @Test
    public void shouldUseHashCodeProduct() {
        Product product1 = new Product(7, "Продукт", 5000);
        Product product2 = new Product(7, "Продукт", 5000);


        assertEquals(product1.hashCode(), product2.hashCode());
    }

    @Test
    public void shouldSetProductId() {
        Product product = new Product();
        product.setId(8);

        int expected = 8;
        int actual = product.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetProductName() {
        Product product = new Product();
        product.setName("Продукт");

        String expected = "Продукт";
        String actual = product.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetProductPrice() {
        Product product = new Product();
        product.setPrice(200);

        int expected = 200;
        int actual = product.getPrice();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldToStringProduct() {
        Product product = new Product(4, "Компьютер", 5400);
        String expected = "Product{id=4, name='Компьютер', price=5400}";

        assertEquals(expected, product.toString());
    }
}
