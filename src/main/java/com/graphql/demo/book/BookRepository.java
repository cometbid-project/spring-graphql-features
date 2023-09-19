/**
 * 
 */
package com.graphql.demo.book;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gbenga
 *
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
}
