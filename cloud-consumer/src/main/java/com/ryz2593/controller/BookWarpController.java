package com.ryz2593.controller;

import com.ryz2593.vo.BookInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ryz2593
 * @date 2019/4/12
 * @desc
 */
@RestController
public class BookWarpController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("warp/book/{bookId}")
    public BookInfoVo getBookVo(@PathVariable Integer bookId) {
        return restTemplate.getForObject("http://localhost:8082/book/" + bookId, BookInfoVo.class);
    }
}
