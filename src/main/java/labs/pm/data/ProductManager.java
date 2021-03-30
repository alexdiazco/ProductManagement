package labs.pm.data;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Create Factory Method Pattern
 */
public class ProductManager {

    private Locale locale;
    private ResourceBundle resources;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;

    private Product product;
    private Review review;

    public ProductManager(Locale locale) {
        this.locale = locale;
        resources = ResourceBundle.getBundle("resources",locale);
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);
    }

    public Product CreateProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore){
      product = new Food(id, name, price, rating, bestBefore);
        return product ;
    }
    public Product CreateProduct(int id, String name, BigDecimal price, Rating rating){
        product = new Drink(id,name,price,rating);
        return product;
    }

    public Product reviewProduct(Product product, Rating rating, String comment){
        review = new Review(rating,comment);
        this.product = product.applyRating(rating);
        return this.product;
    }
    public void printProductReport(){
        StringBuilder txt = new StringBuilder();
        txt.append(MessageFormat.format(resources.getString("product"),
                product.getName(),
                moneyFormat.format(product.getPrice()),
                product.getRating().getStars(),
                dateFormat.format(product.getBestBefore())));
        txt.append('\n');
        if(review != null){
            txt.append(MessageFormat.format(
                    resources.getString("review"),
                    review.getRating().getStars(),
                    review.getComments()));
        }else{
            txt.append(resources.getString("no.reviews"));
        }
        txt.append('\n');
        System.out.println(txt);
    }
}
