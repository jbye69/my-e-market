package fr.peaks.my_e_market.controller;

import fr.peaks.my_e_market.business.RuleException;

import java.util.Iterator;

public interface MarketController<T, ID> {

    T post(T obj) throws RuleException;

    void delete (ID id);

    T get (ID id);

    Iterator<T> getAll ();

    T put(T obj) throws RuleException;

}
