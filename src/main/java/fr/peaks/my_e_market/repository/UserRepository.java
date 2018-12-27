package fr.peaks.my_e_market.repository;

import fr.peaks.my_e_market.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
