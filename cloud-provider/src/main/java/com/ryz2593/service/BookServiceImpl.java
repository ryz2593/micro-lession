package com.ryz2593.service;

import com.ryz2593.domain.BookInfo;
import com.ryz2593.mapper.BookInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ryz2593
 * @date 2019/4/12
 * @desc
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Override
    public BookInfo getBook(Integer bookId) {
        return bookInfoMapper.getBookById(bookId);
    }
}
