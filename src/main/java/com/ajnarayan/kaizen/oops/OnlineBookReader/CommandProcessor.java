package com.ajnarayan.kaizen.oops.OnlineBookReader;

/**
 * Defines operations on a book/user
 */
public interface CommandProcessor {

    /**
     * Associates user with book
     * @param user
     * @param book
     * @return
     */
    boolean borrowBook(User user, Book book);

    /**
     * un-associates user with book
     * @param user
     * @param book
     */
    void returnBook(User user, Book book);

}
