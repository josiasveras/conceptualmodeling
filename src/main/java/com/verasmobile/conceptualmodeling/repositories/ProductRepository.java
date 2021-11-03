package com.verasmobile.conceptualmodeling.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verasmobile.conceptualmodeling.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
