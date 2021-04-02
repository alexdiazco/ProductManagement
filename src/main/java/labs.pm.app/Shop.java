package labs.pm.app;

import labs.pm.data.*;

import java.math.BigDecimal;
import java.util.Locale;

public class Shop {

    public static void main(String[] args) {
        ProductManager pm = new ProductManager(Locale.US);

        Product p1 = pm.CreateProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport(p1);
        p1 = pm.reviewProduct(p1,Rating.FOUR_STAR,"Nice hot cup of tea");
        p1 = pm.reviewProduct(p1,Rating.TWO_STAR,"oK");
        p1 = pm.reviewProduct(p1,Rating.FOUR_STAR,"hot cup of tea");
        p1 = pm.reviewProduct(p1,Rating.FOUR_STAR,"Nice hot");
        p1 = pm.reviewProduct(p1,Rating.THREE_STAR," of tea");
        p1 = pm.reviewProduct(p1,Rating.FIVE_STAR,"Nice hot cup ");
        pm.printProductReport(p1);

        Product p2 = pm.CreateProduct(102,"Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p2 = pm.reviewProduct(p2,Rating.THREE_STAR," Coffee ");
        p2 = pm.reviewProduct(p2,Rating.ONE_STAR," where is");
        p2 = pm.reviewProduct(p2,Rating.FIVE_STAR,"It's perfect ");
        pm.printProductReport(p2);

        Product p3 = pm.CreateProduct(102,"Cake", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p3 = pm.reviewProduct(p3,Rating.THREE_STAR," Cake ");
        p3 = pm.reviewProduct(p3,Rating.ONE_STAR," where is");
        p3 = pm.reviewProduct(p3,Rating.FIVE_STAR,"It's perfect ");
        pm.printProductReport(p3);

        Product p4 = pm.CreateProduct(102,"Cookie", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p4 = pm.reviewProduct(p4,Rating.THREE_STAR," Cookie ");
        p4 = pm.reviewProduct(p4,Rating.ONE_STAR," where is");
        p4 = pm.reviewProduct(p4,Rating.FIVE_STAR,"It's perfect ");
        pm.printProductReport(p4);

        Product p5 = pm.CreateProduct(102,"Hot Chocolate", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p5 = pm.reviewProduct(p5,Rating.THREE_STAR," Hot ch ");
        p5 = pm.reviewProduct(p5,Rating.ONE_STAR," where is");
        p5 = pm.reviewProduct(p5,Rating.FIVE_STAR,"It's perfect ");
        pm.printProductReport(p5);

        Product p6 = pm.CreateProduct(102,"Chocolate", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p6 = pm.reviewProduct(p6,Rating.THREE_STAR," Chocolate ");
        p6 = pm.reviewProduct(p6,Rating.ONE_STAR," where is");
        p6 = pm.reviewProduct(p6,Rating.FIVE_STAR,"It's perfect ");
        pm.printProductReport(p6);

     }
}
