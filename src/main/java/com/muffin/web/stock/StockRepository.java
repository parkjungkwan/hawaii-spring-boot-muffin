package com.muffin.web.stock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StockRepository extends JpaRepository<Stock, Long>, IStockRepository {

    Stock findByStockName(String stockName);
}


