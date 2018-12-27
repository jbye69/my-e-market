package fr.peaks.my_e_market.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractRepository<T,ID> implements CrudRepository<T,ID> {

}
