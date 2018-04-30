package com.ajnarayan.kaizen.oops.OnlineBookReader;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class OnlineBookReader implements CommandProcessor {

    private HashMap<User, Set<Book>> userBooksHashMap;

    OnlineBookReader(){
        this.userBooksHashMap = new HashMap<>();
    }

    @Override
    public boolean borrowBook(User user, Book book) {
        boolean operationStatus = false;
        if(userBooksHashMap.containsKey(user)){
            System.out.println(" Welcome User! updating your book catalog with " +book.getBookName() +"! ");
            Set<Book> existingBooks = userBooksHashMap.get(user);
            existingBooks.add(book);
        }else{
            System.out.println("Welcome new User! Inserting " + book.getBookName() +" in records!");
            Set<Book> newUserBook = new HashSet<>();
            newUserBook.add(book);
            userBooksHashMap.put(user, newUserBook);
        }
        operationStatus = true;
        return operationStatus;
    }

    @Override
    public void returnBook(User user, Book book) {
        if(userBooksHashMap.containsKey(user)){
            Set<Book> existingBooks = userBooksHashMap.get(user);
            System.out.println("Removing book " + book.getBookName() + " from users catalog");
            existingBooks.remove(book);
        }else{
            System.out.println("The user does not have " + book.getBookName() + " in records. Try again later!");
        }
    }

    @Override
    public String toString() {
        return "OnlineBookReader{" +
                "userBooksHashMap=" + userBooksHashMap +
                '}';
    }
}
