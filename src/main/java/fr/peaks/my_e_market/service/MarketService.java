package fr.peaks.my_e_market.service;

import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public interface MarketService<T,ID> {

    T findById (ID id);
    Iterator<T> findAll ();
    void remove (ID id);
    T update (T obj);
    T add (T obj);
    boolean exists (ID id);

}
