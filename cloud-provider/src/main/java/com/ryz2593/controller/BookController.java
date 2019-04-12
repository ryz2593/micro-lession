package com.ryz2593.controller;

import com.ryz2593.domain.BookInfo;
import com.ryz2593.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ryz2593
 * @date 2019/4/12
 * @desc
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("book/{bookId}")
    public BookInfo getBook(@PathVariable("bookId") Integer bookId) {
        return bookService.getBook(bookId);
    }
}
