package ua.com.owu.products_practice_2.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ua.com.owu.products_practice_2.models.Product;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

    @Query("select c from Product c where c.price > :x")
    List<Product> moreExpensiveThenX(@Param("x") int num);

    @Query("select c from Product c order by c.id desc")
    List<Product> showLast10();
}
