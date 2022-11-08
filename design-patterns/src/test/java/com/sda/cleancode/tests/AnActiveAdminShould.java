package com.sda.cleancode.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

// given
class AnActiveAdminShould {

	@Mock
	private BookRepository bookRepository;

	@Mock
	private BookMapper bookMapper;

	@InjectMocks
	private BookService bookService;

	@Test
	void getABookResponse_whenHeSaves() {
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
	void getDuplicateException_whenSavingAnExistingBook() {
		// given
		BookRequest bookRequest = new BookRequest();

		BookResponse expected = new BookResponse();

		// then
		assertThrows(RuntimeException.class,
				// when
				() -> bookService.save(bookRequest));
	}
}