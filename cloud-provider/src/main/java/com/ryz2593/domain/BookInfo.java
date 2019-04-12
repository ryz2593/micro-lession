package com.ryz2593.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ryz2593
 * @date 2019/4/12
 * @desc
 */
@Getter
@Setter
public class BookInfo {
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private BigDecimal bookPrice;
    private Date bookDate;

}
