package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
@Autowired
LaptopDao ld;
	public String saveDetails(LaptopEntity le) {		
		return ld.SaveDetails(le);
	}
	public String updateInfo(LaptopEntity le) {
		return ld.updateInfo(le);
	}

}

