package fr.peaks.my_e_market.business;

public abstract class Rule<T> {

    public abstract void verify(T obj ) throws RuleException ;

}
