package com.bancolombia.app.datasource;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.bancolombia.app.entities.Item;


@Component
public class ItemRepository {
	
	private final List<Item> Lista=new ArrayList<>();
		
	public boolean insert(Item item) {
		return Lista.add(item);
	}
	public List<Item> getAll(){
		return Lista;
	}
}