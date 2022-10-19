package com.nestdigital.receipebackend.doa;

import com.nestdigital.receipebackend.model.ReceipeModel;
import org.springframework.data.repository.CrudRepository;

public interface ReceipeDoa extends CrudRepository<ReceipeModel,Integer> {
}
