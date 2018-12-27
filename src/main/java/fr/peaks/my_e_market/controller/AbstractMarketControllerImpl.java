package fr.peaks.my_e_market.controller;

import fr.peaks.my_e_market.business.IRule;
import fr.peaks.my_e_market.business.Rule;
import fr.peaks.my_e_market.business.RuleException;
import fr.peaks.my_e_market.model.ReturnStatus;
import fr.peaks.my_e_market.service.AbstractMarketServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractMarketControllerImpl<T, ID> implements MarketController<T, ID> {

    @Autowired
    private AbstractMarketServiceImpl<T, ID> abstractMarketServiceImpl;

    private static final Logger LOGGER = LoggerFactory.getLogger(Rule.class);

    private List<IRule<T>> createRuleList = null;
    private List<IRule<T>> updateRuleList = null;


    abstract List<IRule<T>> configureUpdateRules() ;
    abstract List<IRule<T>> configureInsertRules() ;


    @Override
    @PutMapping
    public T put(@RequestBody T obj) throws RuleException {
        createRuleList = configureInsertRules();
        checkRules(obj,createRuleList);
        return this.abstractMarketServiceImpl.add(obj);
    }

    @Override
    @PostMapping
    public T post(@RequestBody T obj) throws RuleException{
        updateRuleList = configureUpdateRules();
        checkRules(obj, updateRuleList);
        return this.abstractMarketServiceImpl.update(obj);
    }

    private void checkRules(T obj, List<IRule<T>> listRule) throws RuleException{
        ReturnStatus returnStatus = new ReturnStatus();
        if (obj != null) {
            if (listRule != null) {
                for (IRule<T> r : listRule) {
                    String errorMessage = r.verify(obj);
                    if(errorMessage!=null){
                        returnStatus.addMessage(errorMessage);
                    }
                }
                if(returnStatus.size()>0){
                    RuleException ruleException = new RuleException();
                    returnStatus.setErrorCode(1);
                    ruleException.setReturnStatus(returnStatus);

                    throw ruleException;
                }
            }
        }
    }

    //TODO
    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") ID id) {
        this.abstractMarketServiceImpl.remove(id);
    }

    //TODO
    @Override
    @GetMapping(value = "/{id}")
    public T get(@PathVariable("id") ID id) {
        return this.abstractMarketServiceImpl.findById(id);
    }

    //TODO
    @Override
    @GetMapping
    public Iterator<T> getAll() {
        return this.abstractMarketServiceImpl.findAll();
    }

}