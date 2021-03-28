package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Create Factory Method Pattern
 */
public class ProductManager {

    public Product CreateProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore){
        return new Food(id, name, price, rating, bestBefore) ;
    }
    public Product CreateProduct(int id, String name, BigDecimal price, Rating rating){
        return new Drink(id,name,price,rating);
    }
}
