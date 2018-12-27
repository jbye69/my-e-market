package fr.peaks.my_e_market.controller;

import fr.peaks.my_e_market.business.AttributesCheckRule;
import fr.peaks.my_e_market.business.IRule;
import fr.peaks.my_e_market.business.ProductRule;
import fr.peaks.my_e_market.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController extends AbstractMarketControllerImpl<Product, Long>{

    @Override
    List<IRule<Product>> configureUpdateRules() {
        IRule<Product> rule = new ProductRule();
        AttributesCheckRule<Product> attributesCheckRule = new AttributesCheckRule<>();
        return Arrays.asList(rule,attributesCheckRule);
    }

    @Override
    List<IRule<Product>> configureInsertRules() {
        return null;
    }
}