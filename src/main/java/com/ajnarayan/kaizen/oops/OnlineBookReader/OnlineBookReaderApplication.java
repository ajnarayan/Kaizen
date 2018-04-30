package com.ajnarayan.kaizen.oops.OnlineBookReader;


import java.util.HashSet;
import java.util.Set;

/**
 * Online book reader system.
 */
public class OnlineBookReaderApplication {


    public static void main(String[] args){
        OnlineBookReader onlineBookReader = new OnlineBookReader();
        System.out.println("Online Book Reader Welcomes You! ");


        Book defaultBook1 = new Book();
        defaultBook1.setBookId(1);
        defaultBook1.setAuthor("Hanz Zimmer");
        defaultBook1.setBookName("Music Lessons");
        Book defaultBook2 = new Book();
        defaultBook2.setBookId(2);
        defaultBook2.setAuthor("Robin Sharma");
        defaultBook2.setBookName("The Monk Who Sold His Ferrari");


        User user1 = new User();
        user1.setUserId(1);
        user1.setUserName("TestAccount");
        user1.setActive(true);

        System.out.println("Assinging user: " + user1.getUserName() + " with default book1");
        onlineBookReader.borrowBook(user1, defaultBook1 );
        System.out.println( " User " + user1.getUserName() + " Catalog: \n" + onlineBookReader.toString());

        System.out.println("Assinging user: " + user1.getUserName() + " with default book2");
        onlineBookReader.borrowBook(user1, defaultBook2 );
        System.out.println( " User " + user1.getUserName() + " Catalog: \n" + onlineBookReader.toString());

        System.out.println("Returning book for user: " + user1.getUserName() );
        onlineBookReader.returnBook(user1, defaultBook1 );
        System.out.println( " User " + user1.getUserName() + " Catalog: \n" + onlineBookReader.toString());


    }

}
