package fr.peaks.my_e_market.repository;

import fr.peaks.my_e_market.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

    boolean existsByEmail(String email);
}
