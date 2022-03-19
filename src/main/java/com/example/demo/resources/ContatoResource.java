package com.example.demo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ContatoService;
import com.example.demo.travels.Contato;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/contatos")
@CrossOrigin(origins = "*")
public class ContatoResource {
	
	@Autowired
	private ContatoService service;
	
	
	@GetMapping
	public List<Contato> findAll(){
		return service.findAll();
		
	}
	
	@PostMapping
	public Contato save (@RequestBody Contato obj)  {
		return service.save(obj);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody Contato obj) {
		service.save(obj);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Contato findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
	
	
