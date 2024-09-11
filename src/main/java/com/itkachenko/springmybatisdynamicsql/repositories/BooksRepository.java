package com.itkachenko.springmybatisdynamicsql.repositories;

import com.itkachenko.springmybatisdynamicsql.models.Book;
import com.itkachenko.springmybatisdynamicsql.models.BookFilter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

@Mapper
public interface BooksRepository {

	List<Book> findBooksByTitle(@Param("title") String title);

	List<Book> getSortedBooks(@Param("sortBy") String sortBy);

	List<Book> findBooksByFilter(@Param("bookFilter") BookFilter bookFilter);

	void updateBook(@Param("book") Book book);

	List<Book> findBooksByIds(@Param("ids") Set<Long> ids);

	List<Book> findBooksByMultiFilter(@Param("bookFilters") List<BookFilter> bookFilters);

	List<Book> getBooks(@Param("bookFilter") BookFilter bookFilter, @Param("offset") Long offset, @Param("limit") Long limit);

}