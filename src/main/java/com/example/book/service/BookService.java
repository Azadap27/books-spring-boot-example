package com.example.book.service;

import com.example.book.repository.entity.Book;
import com.example.book.service.dto.BookDTO;

import java.util.List;

public interface BookService {
    // POST
    BookDTO createBook(Book book);

    // GET
    List<BookDTO> retrieveBooks();
    BookDTO retrieveBookByISBN(String isbn);
    List<BookDTO> retrieveBooksByAuthor(String author);

    // PUT
    void updateBookByISBN(String isbn, Book book);

    // DELETE
    void deleteBooks();
    void deleteBookByISBN(String isbn);
}
