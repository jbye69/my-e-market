package fr.peaks.my_e_market.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public class AttributesCheckRule<T> implements IRule<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(Rule.class);

    public String verify(T obj)  {
        LOGGER.info("Données reçues : " + obj.toString());
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                if (field.get(obj) == "" || field.get(obj).equals("")) {
                    String message = "Le champs : " + field.getName() + " n'a pas été renseigné";
                    LOGGER.error(message);
                    return message;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return "Erreur inconnue " + e.getMessage();
            }
        }
        return null;
    }
}
