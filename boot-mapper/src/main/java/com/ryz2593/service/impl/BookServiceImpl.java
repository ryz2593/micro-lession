package com.ryz2593.service.impl;

import com.ryz2593.domain.Book;
import com.ryz2593.exception.BookModuleException;
import com.ryz2593.mapper.BookMapper;
import com.ryz2593.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ryz2593
 * @date 2019/4/12
 * @desc
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;

    @Override
    public void add(Book book) {
       try {
           bookMapper.insert(book);
       } catch (Exception e) {
            throw new BookModuleException("添加图书信息出现错误：" + e.getMessage());
       }
    }

    @Override
    public void delete(Integer bookId) {
        try {
            bookMapper.deleteByPrimaryKey(bookId);
        } catch (Exception e) {
            throw new BookModuleException("删除图书信息出现错误：" + e.getMessage());
        }
    }

    @Override
    public void update(Book book) {
        try {
            bookMapper.updateByPrimaryKeySelective(book);
        } catch (Exception e) {
            throw new BookModuleException("修改图书信息出现错误：" + e.getMessage());
        }
    }

    @Override
    public Book getBookById(Integer bookId) {
        Book book = null;
        try {
            book = bookMapper.selectByPrimaryKey(bookId);
        } catch (Exception e) {
            throw new BookModuleException("修改图书信息出现错误：" + e.getMessage());
        }
        return book;
    }

    @Override
    public List<Book> listBook() {
        return bookMapper.selectAll();
    }
}
