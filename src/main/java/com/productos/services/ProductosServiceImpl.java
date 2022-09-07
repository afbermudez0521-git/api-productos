package com.productos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productos.entitys.Productos;
import com.productos.repositorys.IProductosRepository;

@Service
public class ProductosServiceImpl implements IProductosService{

	@Autowired
	private IProductosRepository iProductosRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Productos> FindAll() {
		return (List<Productos>) this.iProductosRepository.findAll();
	}

	@Override
	public Optional<Productos> FindById(long id) {
		return this.iProductosRepository.findById(id);
	}

}
