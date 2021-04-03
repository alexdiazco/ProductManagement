package labs.pm.app;

import labs.pm.data.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Locale;

public class Shop {

    public static void main(String[] args) {
        ProductManager pm = new ProductManager("en-GB");

        pm.CreateProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        //pm.printProductReport(101);
        pm.reviewProduct(101,Rating.FOUR_STAR,"Nice hot cup of tea");
        pm.reviewProduct(101,Rating.TWO_STAR,"oK");
        pm.reviewProduct(101,Rating.FOUR_STAR,"hot cup of tea");
        pm.reviewProduct(101,Rating.FOUR_STAR,"Nice hot");
        pm.reviewProduct(101,Rating.THREE_STAR," of tea");
        pm.reviewProduct(101,Rating.FIVE_STAR,"Nice hot cup ");
        //pm.printProductReport(101);

        pm.changeLocale("es-ES");
        pm.CreateProduct(102,"Coffee", BigDecimal.valueOf(2.99), Rating.NOT_RATED);
        pm.reviewProduct(102,Rating.THREE_STAR," Coffee ");
        pm.reviewProduct(102,Rating.ONE_STAR," where is");
        pm.reviewProduct(102,Rating.FIVE_STAR,"It's perfect ");
        //pm.printProductReport(102);

        pm.CreateProduct(103,"Cake", BigDecimal.valueOf(3.99), Rating.NOT_RATED);
        pm.reviewProduct(103,Rating.THREE_STAR," Cake ");
        pm.reviewProduct(103,Rating.ONE_STAR," where is");
        pm.reviewProduct(103,Rating.FIVE_STAR,"It's perfect ");
        //pm.printProductReport(103);

        pm.CreateProduct(104,"Cookie", BigDecimal.valueOf(4.99), Rating.NOT_RATED);
        pm.reviewProduct(104,Rating.THREE_STAR," Cookie ");
        pm.reviewProduct(104,Rating.ONE_STAR," where is");
        pm.reviewProduct(104,Rating.FIVE_STAR,"It's perfect ");
        //pm.printProductReport(104);

        pm.CreateProduct(105,"Hot Chocolate", BigDecimal.valueOf(5.99), Rating.NOT_RATED);
        pm.reviewProduct(105,Rating.THREE_STAR," Hot ch ");
        pm.reviewProduct(105,Rating.ONE_STAR," where is");
        pm.reviewProduct(105,Rating.FIVE_STAR,"It's perfect ");
        //pm.printProductReport(105);

        pm.CreateProduct(106,"Chocolate", BigDecimal.valueOf(6.99), Rating.NOT_RATED, LocalDate.now().plusDays(3));
        pm.reviewProduct(106,Rating.THREE_STAR," Chocolate ");
        pm.reviewProduct(106,Rating.ONE_STAR," where is");
        pm.reviewProduct(106,Rating.FIVE_STAR,"It's perfect ");
        //pm.printProductReport(106);

        Comparator<Product> ratingSorter = (p1,p2) -> p2.getRating().ordinal() - p1.getRating().ordinal();
        Comparator<Product> priceSorter = (p1,p2) -> p2.getPrice().compareTo(p1.getPrice());

        pm.printProducts(ratingSorter.thenComparing(priceSorter));

        pm.printProducts(priceSorter.thenComparing(priceSorter).reversed());

        pm.printProducts(priceSorter.reversed().thenComparing(priceSorter).reversed());

        pm.printProducts(priceSorter.reversed());



     }
}
