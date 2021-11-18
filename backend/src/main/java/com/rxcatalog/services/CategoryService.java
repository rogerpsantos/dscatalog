package com.rxcatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rxcatalog.entities.Category;
import com.rxcatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
	
//	@SuppressWarnings("unused")
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}

}