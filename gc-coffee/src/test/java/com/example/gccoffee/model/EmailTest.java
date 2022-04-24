package com.example.gccoffee.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void testInvalidEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email("acccc"));
    }

    @Test
    public void testEmail() {
        Email email = new Email("hello@gmail.com");
        assertTrue(email.getAddress() == "hello@gmail.com");
    }

    @Test
    public void testEqEmail() {
        Email email = new Email("hello@gmail.com");
        Email email2 = new Email("hello@gmail.com");
        assertThat(email).isEqualTo(email2);
        assertEquals(email, email2);
    }
}