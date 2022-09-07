package com.productos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productos.entitys.Productos;
import com.productos.services.IProductosService;

@RestController
@RequestMapping("productos")
public class ProductosRestController {
	
	@Autowired
	private IProductosService iProductosService;
	
	@Autowired
	private Environment environment;
	
	@GetMapping
	public String Listar(){
		System.out.println("****************************************************************");
		System.out.println(environment.getProperty("local.server.port").toString());
		//return this.iProductosService.FindAll();
		return environment.getProperty("local.server.port").toString();
	}
	
	@GetMapping("/{id}")
	public Optional<Productos> ListarId(@PathVariable long id){
		return this.iProductosService.FindById(id);
	}

}
