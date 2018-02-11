package ru.testing.cofeeshop.controller.impl;

import ru.testing.cofeeshop.config.ApplicationContext;
import ru.testing.cofeeshop.config.value.ApplicationInstanceType;
import ru.testing.cofeeshop.controller.ProductController;
import ru.testing.cofeeshop.controller.model.ProductDTO;
import ru.testing.cofeeshop.domain.service.ProductService;
import ru.testing.cofeeshop.productcatalog.resource.AvailableProduct;

public class ProductControllerImpl extends GenericController implements ProductController {

    @Override
    public ProductDTO addProductToBasket(AvailableProduct choosedProduct, Integer amount) {
        return ((ProductService) ApplicationContext.getGenericServiceMap().get(ApplicationInstanceType.PRODUCT)).addProductToBasket(choosedProduct, amount);
    }
}