package com.productos.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.productos.entitys.Productos;

@Repository
public interface IProductosRepository extends CrudRepository<Productos, Long>{

}
