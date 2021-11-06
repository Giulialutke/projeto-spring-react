package com.giulialutke.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giulialutke.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
