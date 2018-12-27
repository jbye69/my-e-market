package fr.peaks.my_e_market.controller;


import fr.peaks.my_e_market.business.AttributesCheckRule;
import fr.peaks.my_e_market.business.IRule;
import fr.peaks.my_e_market.model.User;
import fr.peaks.my_e_market.business.UserRule;
import fr.peaks.my_e_market.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController extends AbstractMarketControllerImpl<User, Long>{

    @Autowired
    private UserServiceImpl serviceImpl;

    @Override
    List<IRule<User>> configureUpdateRules() {
        IRule<User> ruleAttribute = new AttributesCheckRule<>();
        return Arrays.asList(ruleAttribute);
    }

    @Override
    List<IRule<User>> configureInsertRules() {
        IRule<User> rule = new UserRule(serviceImpl);
        return Arrays.asList(rule);
    }
}