package com.ryz2593.mapper;

import com.ryz2593.domain.BookInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author ryz2593
 * @date 2019/4/12
 * @desc
 */
@Repository
public interface BookInfoMapper {
    @Select("select book_id, book_name, book_author, book_price, book_date from tb_book where book_id = #{bookId}")
    BookInfo getBookById(@Param("bookId") Integer bookId);
}
