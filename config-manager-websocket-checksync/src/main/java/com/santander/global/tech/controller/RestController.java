package com.santander.global.tech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	
@GetMapping("/mensaje")
public String getMensaje(){
	
	return "hola mundo";
	
}

}
