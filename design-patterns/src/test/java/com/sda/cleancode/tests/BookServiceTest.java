package com.sda.cleancode.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

	@Mock
	private BookRepository bookRepository;

	@Mock
	private BookMapper bookMapper;

	@InjectMocks
	private BookService bookService;

	@Test
	void givenInvalidId_whenFindById_thenThrowException() {
		// define test scenario
		// identify what needs to be mocked
		// objects with methods that are being called

		// given
		// mock objects
		// mock return objects

		// when
		// call method under test

		// then
		// assert
	}

	@Test
	void givenBookRequest_whenSave_thenReturnBookResponse() {
		// given
		BookRequest request = new BookRequest();

		Book mockBook = new Book();

		BookResponse expected = new BookResponse();

		when(bookRepository.save(any(Book.class)))
				.thenReturn(mockBook);

		// when
		BookResponse actual = bookService.save(request);

		// then
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void givenExistingBook_whenSave_thenThrowException() {
		// given
		BookRequest bookRequest = new BookRequest();

		BookResponse expected = new BookResponse();

		// then
		Assertions.assertThrows(RuntimeException.class,
				// when
				() -> bookService.save(bookRequest));
	}
}