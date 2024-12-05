package com.bancolombia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.app.entities.Item;
import com.bancolombia.app.services.IService;

@RestController
@RequestMapping("/item") //http://ip:port/item

public class MicroController {
		
	@Autowired	
	private IService servicio;
	
	@PostMapping 	
	public ResponseEntity<String> insert (@RequestBody Item item){
		
		if(servicio.insert(item))
			return new ResponseEntity<String>("se ha insertado", HttpStatus.CREATED);
	
		return new ResponseEntity<String>("No se ha insertado", HttpStatus.BAD_REQUEST);
	}
	@GetMapping
	public ResponseEntity<List<Item>> get(){
		return new ResponseEntity<List<Item>>(servicio.getAll(), HttpStatus.OK);
	}
}
