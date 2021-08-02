package com.spring.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.core.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	public BookService getBookService() {
		return this.bookService;
	}

}
