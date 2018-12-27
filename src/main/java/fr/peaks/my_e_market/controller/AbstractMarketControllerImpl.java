package fr.peaks.my_e_market.controller;

import fr.peaks.my_e_market.service.AbstractMarketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class AbstractMarketControllerImpl<T, ID> implements MarketController<T, ID> {

    @Autowired
    AbstractMarketServiceImpl<T, ID> abstractMarketService;

    @Override
    @PostMapping(value = "/create")
    public T post(@RequestBody T obj) {
        if (obj != null){
            return this.abstractMarketService.add(obj);
        }
        return null;
    }

    @Override
    public void delete(ID id) {
    }

    @Override
    @GetMapping(value = "/{id}")
    public T get(@PathVariable("id") ID id) {
        return this.abstractMarketService.findById(id);
    }

    @Override
    public Iterable<T> getAll() {
        return null;
    }
}
