package com.ryz2593.service;

import com.ryz2593.domain.Book;

import java.util.List;

/**
 * @author ryz2593
 * @date 2019/4/12
 * @desc
 */
public interface BookService {
    void add(Book book);
    void delete(Integer bookId);
    void update(Book book);
    Book getBookById(Integer bookId);
    List<Book> listBook();
}
