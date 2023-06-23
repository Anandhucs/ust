package com.ust.SpringReactive.Mango.repository;

import com.ust.SpringReactive.Mango.Model.Product;
import com.ust.SpringReactive.Mango.dto.ProductDto;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product,String> {
  Flux<ProductDto> findByPriceBetween(Range<Double> closed);
}
