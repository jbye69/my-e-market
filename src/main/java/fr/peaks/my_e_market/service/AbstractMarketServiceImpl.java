package fr.peaks.my_e_market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Iterator;
@Service
public abstract class AbstractMarketServiceImpl<T,ID> implements MarketService<T, ID> {

    @Autowired
    private CrudRepository<T,ID> crudRepository;

    @Override
    public T findById(ID id) {
        return this.crudRepository.findById(id).get();
    }

    @Override
    public Iterator<T> findAll() {
        return this.crudRepository.findAll().iterator();
    }

    @Override
    public void remove(ID id) {
        this.crudRepository.delete(this.findById(id));
    }

    @Override
    public T update(T obj) {
        return this.crudRepository.save(obj);
    }

    @Override
    public T add(T obj) {
        return this.crudRepository.save(obj);
    }

    @Override
    public boolean exists(ID id) {
        return this.crudRepository.existsById(id);
    }


}
