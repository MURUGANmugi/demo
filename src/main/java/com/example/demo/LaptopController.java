package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
	@Autowired
	LaptopService ls;

	@PostMapping("/save")
	public String saveDetails(@RequestBody LaptopEntity le) {
		return ls.saveDetails(le);
	}
	@PutMapping(value = "/update")
	public String uptadeInfo(@RequestBody LaptopEntity le) {
		return ls.updateInfo(le);

	}
}
