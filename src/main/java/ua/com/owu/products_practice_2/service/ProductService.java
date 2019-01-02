package ua.com.owu.products_practice_2.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ua.com.owu.products_practice_2.dao.ProductDAO;
import ua.com.owu.products_practice_2.models.Product;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Product> allProducts(){
        return productDAO.findAll();
    }

    public List<Product> moreExpensiveThen1000(){
        return productDAO.moreExpensiveThenX(1000);

    }
    public List<Product> moreExpensiveThen2000(){
        return productDAO.moreExpensiveThenX(2000);

    }

    public List<Product> showLast10(){
        return productDAO.showLast10().stream().limit(10).collect(Collectors.toList());
    }
}
