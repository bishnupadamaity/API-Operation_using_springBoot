package com.api.book.bootrestbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Component
public class BookServices {

    @Autowired
    private BookRepository bookRepository;
    // private static  List<Book> list = new ArrayList<>();

    // static{
    //     list.add(new Book(12,"Java Complete Reference","xyz"));
    //     list.add(new Book(36,"Java half Reference","xyyz"));
    //     list.add(new Book(45,"Java full Reference","xyyzz"));
    // }

    // get all books
    public List<Book> getAllBooks(){
       List<Book>list=(List<Book>) this.bookRepository.findAll();
       return list;
    }

    // get single book by id
    public Book getBookById(int id){
        Book book = null;
        try{
       // book = list.stream().filter(e->e.getId()==id).findFirst().get();
      book= this.bookRepository.findById(id);

        }catch(Exception e){
            e.printStackTrace();
        }
        return book;
    }

    public Book addBook(Book b){
        Book result=bookRepository.save(b);
        return result;
    }

    public void deleteBook(int id){

        bookRepository.deleteById(id);
    }

    public void updateBook(Book book , int id){
        // list=list.stream().map(b->{
        //     if(b.getId()==id){
        //         b.setTitle(book.getTitle());
        //         b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());

            book.setId(id);

        bookRepository.save(book);
    }
    
}
