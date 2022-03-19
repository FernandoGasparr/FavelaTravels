package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.ContatoRepository;
import com.example.demo.travels.Contato;

@Service
public class ContatoService {
		
	@Autowired
	private ContatoRepository repository;
	
	public Contato save(Contato obj) {
		return repository.save(obj);	
	}
	
	public List<Contato> findAll() {
		return repository.findAll();
	}
	
	public void updade(Contato obj) {
		 repository.save(obj);	
	}
	

	public void deleteById(Long id) {
		repository.deleteById(id);
			
	}
	
	public Contato findById(Long id) {
		return repository.findById(id).get();
	}
}
