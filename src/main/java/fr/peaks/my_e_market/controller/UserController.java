package fr.peaks.my_e_market.controller;


import fr.peaks.my_e_market.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController extends AbstractMarketControllerImpl<User, Long>{}