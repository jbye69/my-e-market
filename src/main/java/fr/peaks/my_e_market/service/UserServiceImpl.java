package fr.peaks.my_e_market.service;

import fr.peaks.my_e_market.model.User;
import fr.peaks.my_e_market.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractMarketServiceImpl<User,Long> {

    @Autowired
    UserRepository userRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    public boolean existsByEmail(String email) {
        LOGGER.info(email);
        return userRepository.existsByEmail(email);
    }
}
