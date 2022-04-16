package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SmartphoneTest {
    @Test
    public void shouldUseEqualsPhone() {
        Smartphone phone3 = new Smartphone(6, "Redmi", 3000, "Xiaomi");
        Smartphone phone4 = new Smartphone(6, "Redmi", 3000, "Xiaomi");

        assertEquals(phone3, phone4);
    }

    @Test
    public void shouldUseNoEqualsPhone() {
        Smartphone phone3 = new Smartphone(6, "Redmi", 3000, "Xiaomi");
        Smartphone phone4 = new Smartphone(6, "Rejmi", 3000, "Xiaomi");

        assertNotEquals(phone3, phone4);
    }

    @Test
    public void shouldUseEqualsPhoneSame() {
        Smartphone phone3 = new Smartphone(6, "Redmi", 3000, "Xiaomi");
        Smartphone phone4 = phone3;

        assertEquals(phone3, phone4);
    }

    @Test
    public void shouldUseNoEqualsPhoneNull() {
        Smartphone phone3 = new Smartphone(6, "Redmi", 3000, "Xiaomi");
        Smartphone phone4 = null;

        assertNotEquals(phone3, phone4);
    }

    @Test
    public void shouldUseNoEqualsPhoneClass() {
        Smartphone phone3 = new Smartphone(6, "Redmi", 3000, "Xiaomi");
        String phone4 = "One expensive smartphone";

        assertNotEquals(phone3, phone4);
    }

    @Test
    public void shouldUseHashCodePhone() {
        Smartphone phone3 = new Smartphone(6, "Redmi", 3000, "Xiaomi");
        Smartphone phone4 = new Smartphone(6, "Redmi", 3000, "Xiaomi");

        assertEquals(phone3.hashCode(), phone4.hashCode());
    }

    @Test
    public void shouldSetPhoneProducer() {
        Smartphone phone = new Smartphone();
        phone.setProducer("Nokia");

        String expected = "Nokia";
        String actual = phone.getProducer();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldToStringPhone() {
        Smartphone phone = new Smartphone(7, "Redmi", 3000, "Xiaomi");
        String expected = "Smartphone{id=7, name='Redmi', price=3000, producer='Xiaomi'}";

        assertEquals(expected, phone.toString());
    }
}
