package com.deepak.ruleengine;

import com.deepak.ruleengine.product.Book;

public class Client {
    public static void main(String[] args) {
        Book book = new Book("Atomic Habits", "productivity", "James Clear");
        OrderProcessing orderProcessing = new OrderProcessing();
        orderProcessing.process(book);
    }
}
