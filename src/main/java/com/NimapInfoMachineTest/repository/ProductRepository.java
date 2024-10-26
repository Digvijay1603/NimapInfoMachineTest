package com.NimapInfoMachineTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NimapInfoMachineTest.Model.Product;

public interface ProductRepository extends  JpaRepository<Product, Long> {

	
}
