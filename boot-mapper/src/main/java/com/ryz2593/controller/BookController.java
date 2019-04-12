package com.ryz2593.controller;

import com.ryz2593.exception.BookModuleException;
import com.ryz2593.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
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

    //业务异常处理
    @ExceptionHandler
    public String handlerEx(Exception e, Model model) {
        model.addAttribute("ex", e);
        return "error/biz";
    }

    public String add() {
        if (true) {
            throw new BookModuleException("添加信息已经存在");
        }
        return "";
    }
}
