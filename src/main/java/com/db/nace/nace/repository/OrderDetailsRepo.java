package com.db.nace.nace.repository;

import com.db.nace.nace.model.OrderDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderDetailsRepo extends MongoRepository<OrderDetails, String > {

}
