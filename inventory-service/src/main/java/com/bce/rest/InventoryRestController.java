package com.bce.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryRestController {

	@GetMapping
	public String checkStatus() {
		return "Inventory Service UP!";
	}

}
