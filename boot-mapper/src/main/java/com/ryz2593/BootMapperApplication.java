package com.ryz2593;

import com.ryz2593.domain.Book;
import com.ryz2593.mapper.BookMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ryz2593
 */
@SpringBootApplication
@MapperScan("com.ryz2593.mapper")
public class BootMapperApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext
				context = SpringApplication.run(BootMapperApplication.class, args);

		BookMapper bookMapper = context.getBean(BookMapper.class);
		System.out.println(bookMapper);
		Book book = bookMapper.selectByPrimaryKey(1);
		System.out.println(book);
		context.close();
	}

}
