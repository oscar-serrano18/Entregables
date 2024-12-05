package com.bancolombia.app.datasource;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.bancolombia.app.entities.Worker;

@Component
public class WorkerRepository {
	
	private final List<Worker> Lista=new ArrayList<>();
		
	public boolean insert(Worker worker) {
		return Lista.add(worker);
	}
	public List<Worker> getAll(){
		return Lista;
	}
}