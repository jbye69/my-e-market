package fr.peaks.my_e_market.controller;

public interface MarketController<T, ID> {

    T post(T obj);

    void delete (ID id);

    T get (ID id);

    Iterable<T> getAll ();

}
