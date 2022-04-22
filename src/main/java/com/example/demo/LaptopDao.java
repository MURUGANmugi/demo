package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopDao {
@Autowired
LaptopRepository lr;
	public String SaveDetails(LaptopEntity le) {
		lr.save(le);
		return "saved successfully";
	}
	public String updateInfo(LaptopEntity le) {
		lr.save(le).getId();
		
		return "data Updated";
	}

}
	
