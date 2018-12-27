package fr.peaks.my_e_market.business;


public interface IRule<T> {
    String verify(T obj )  ;
}
