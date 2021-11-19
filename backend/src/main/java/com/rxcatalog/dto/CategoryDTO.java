package com.rxcatalog.dto;

import java.io.Serializable;

import com.rxcatalog.entities.Category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public CategoryDTO() {
	}
	
	public CategoryDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
	
	

}
