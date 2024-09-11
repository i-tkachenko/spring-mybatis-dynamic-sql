package com.itkachenko.springmybatisdynamicsql;

import com.itkachenko.springmybatisdynamicsql.models.Book;
import com.itkachenko.springmybatisdynamicsql.models.BookFilter;
import com.itkachenko.springmybatisdynamicsql.repositories.BooksRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class SpringMybatisDynamicSqlApplicationTests {
	@Autowired
	BooksRepository repository;

	@Test
	void testGetBooks() {
		// Act: get books from database
		List<Book> books = repository.getBooks(new BookFilter(), 0L, 100L);
		// Assert: Verify the results
		assertFalse(books.isEmpty(), "Books should not be empty");
	}
}
