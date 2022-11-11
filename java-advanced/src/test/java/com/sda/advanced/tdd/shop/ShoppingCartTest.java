package com.sda.advanced.tdd.shop;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class ShoppingCartTest {

    @Test
    void givenBook_whenAdd_thenReturnBook() {
        // given
        ShoppingCart shoppingCart = new ShoppingCart();
        Book book = new Book("game of thrones", "george martin", 20);

        // when
        shoppingCart.addBook(book);

        // then
        assertThat(shoppingCart.findAll().size()).isEqualTo(1);
    }

    @Test
    void given2Books_whenFindAll_thenReturnBooks() {
        // given
        ShoppingCart shoppingCart = new ShoppingCart();
        Book book1 = new Book("game of thrones 1", "george martin", 20);
        Book book2 = new Book("game of thrones 2", "george martin", 30);
        shoppingCart.addBook(book1);
        shoppingCart.addBook(book2);

        // when
        List<Book> actualBooks = shoppingCart.findAll();

        // then
        assertThat(actualBooks.size()).isEqualTo(2);
    }

    @Test
    void givenBook_whenClear_thenBasketShouldBeEmpty() {
        // given
        ShoppingCart shoppingCart = new ShoppingCart();
        Book book = new Book("game of thrones", "george martin", 20);
        shoppingCart.addBook(book);

        // when
        shoppingCart.clear();

        // then
        assertThat(shoppingCart.findAll().size()).isZero();
    }

    @Test
    void given2Books_whenSumPrices_thenReturnCorrectTotalPrice() {
        // given
        ShoppingCart shoppingCart = new ShoppingCart();
        Book book1 = new Book("game of thrones 1", "george martin", 20);
        Book book2 = new Book("game of thrones 2", "george martin", 30);
        shoppingCart.addBook(book1);
        shoppingCart.addBook(book2);

        // when
        int actualPrice = shoppingCart.sumPrices();

        // then
        assertThat(actualPrice).isEqualTo(50);
    }
}
