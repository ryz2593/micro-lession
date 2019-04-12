package com.ryz2593.service;

import com.ryz2593.domain.BookInfo;

/**
 * @author ryz2593
 * @date 2019/4/12
 * @desc
 */
public interface BookService {
    BookInfo getBook(Integer bookId);
}
