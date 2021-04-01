package labs.pm.app;

import labs.pm.data.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;


public class Shop {

    public static void main(String[] args) {
        ProductManager pm = new ProductManager(Locale.US);

        Product p1 = pm.CreateProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport();
        p1 = pm.reviewProduct(p1,Rating.FOUR_STAR,"Nice hot cup of tea");
        p1 = pm.reviewProduct(p1,Rating.TWO_STAR,"oK");
        p1 = pm.reviewProduct(p1,Rating.FOUR_STAR,"hot cup of tea");
        p1 = pm.reviewProduct(p1,Rating.FOUR_STAR,"Nice hot");
        p1 = pm.reviewProduct(p1,Rating.THREE_STAR," of tea");
        p1 = pm.reviewProduct(p1,Rating.FIVE_STAR,"Nice hot cup ");
        pm.printProductReport();
     }
}
