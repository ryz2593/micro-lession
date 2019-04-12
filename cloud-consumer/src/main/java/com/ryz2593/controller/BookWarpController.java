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

    //服务发现组件
    //eureka (Spring Cloud 量身定制) 2.0版本之后，闭源
    //consul
    //zookeeper(推荐)
    //负载均衡
    //客户端负载均衡(ribbon), 服务端负载均衡(nginx)

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("warp/book/{bookId}")
    public BookInfoVo getBookVo(@PathVariable Integer bookId) {
        return restTemplate.getForObject("http://localhost:8082/book/" + bookId, BookInfoVo.class);
    }
}
