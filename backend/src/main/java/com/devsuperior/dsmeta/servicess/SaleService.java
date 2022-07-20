package com.devsuperior.dsmeta.servicess;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	// return uma lista de obj do tipo Sale
	
	@Autowired
	private SaleRepository saleRepository;
	
	public List<Sale> findSales() {
		return saleRepository.findAll();
	}
}
