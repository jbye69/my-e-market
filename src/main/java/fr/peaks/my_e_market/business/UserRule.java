package fr.peaks.my_e_market.business;

import fr.peaks.my_e_market.model.User;
import fr.peaks.my_e_market.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRule implements IRule<User> {

    private final UserServiceImpl service;

    @Autowired
    public UserRule(UserServiceImpl service) {
        this.service = service;
    }

    @Override
    public String verify(User obj)  {
        if (this.service.existsByEmail(obj.getEmail())) {
           return "L'email existe déjà";
        }
        else
            return null;
    }
}
