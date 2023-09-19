/**
 * 
 */
package com.graphql.demo.speaker;

import org.springframework.data.repository.ListCrudRepository;

/**
 * @author Gbenga
 *
 */
public interface SpeakerRepository extends ListCrudRepository<Speaker,Integer> {}
