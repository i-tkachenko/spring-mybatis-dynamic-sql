package com.itkachenko.springmybatisdynamicsql.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Book {
	private Long id;
	private String title;
	private String author;
	private Integer publicationYear;
}
