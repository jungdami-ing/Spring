package com.spring.core;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.core.controller.BookController;
import com.spring.core.service.BookService;

@SpringBootTest
class CoreApplicationTests {

	@Autowired
	BookController bookController;

	@Autowired
	BookService bookService;

	@Test
	void testScope() {
		//1.given
		BookService bookService1 = bookController.getBookService();
		BookService bookService2 = new BookService();

		//2.when


		//3.then
		Assertions.assertThat(bookService1).isEqualTo(this.bookService);
		Assertions.assertThat(bookService2).isNotEqualTo(this.bookService);

	}

}
