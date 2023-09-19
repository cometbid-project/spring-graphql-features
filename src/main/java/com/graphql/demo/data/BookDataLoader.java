/**
 * 
 */
package com.graphql.demo.data;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.graphql.demo.book.Book;
import com.graphql.demo.book.BookRepository;
import com.graphql.demo.book.Review;

/**
 * @author Gbenga
 *
 */
@Component
public class BookDataLoader implements CommandLineRunner {

	private final BookRepository bookRepository;

	/**
	 * @param bookRepository
	 */
	public BookDataLoader(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Book reactiveSpring = new Book("Reactive Spring", 484, "Josh Long");
		Review review = new Review("Great book", "I really enjoyed this book");
		// bidirectional relationship
		review.setBook(reactiveSpring);
		reactiveSpring.setReviews(List.of(review));
		bookRepository.save(reactiveSpring);

		bookRepository.save(new Book("Spring Boot Up & Running", 328, "Mark Heckler"));
		bookRepository.save(new Book("Hacking with Spring Boot 2.3", 392, "Greg Turnquist"));
	}
}
