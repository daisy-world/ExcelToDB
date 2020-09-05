package com.salesxl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveCurrencyDataToDb  extends CrudRepository<CurrencyExchange, String> {

}
