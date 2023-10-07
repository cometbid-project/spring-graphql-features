/**
 * 
 */
package com.graphql.demo.session;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Gbenga
 *
 */
@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	public Tag() {
	}

	/**
	 * @param id
	 * @param name
	 */
	public Tag(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Tag(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tag{" +
		//
				"id=" + id +
				//
				", name='" + name + '\'' +
				//
				'}';
	}
}
