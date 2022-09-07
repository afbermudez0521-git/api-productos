package com.productos.services;

import java.util.List;
import java.util.Optional;

import com.productos.entitys.Productos;

public interface IProductosService {

	public List<Productos> FindAll();
	
	public Optional<Productos> FindById(long id);
	
}
