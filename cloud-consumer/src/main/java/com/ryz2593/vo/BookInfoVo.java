package com.ryz2593.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class BookInfoVo {
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private BigDecimal bookPrice;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date bookDate;
}
