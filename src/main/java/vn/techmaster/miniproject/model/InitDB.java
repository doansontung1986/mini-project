package vn.techmaster.miniproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import vn.techmaster.miniproject.database.ProductDB;
import vn.techmaster.miniproject.utils.IFileReader;

import java.util.List;

@Configuration
public class InitDB implements CommandLineRunner {
    private static final String PRODUCT_FILE = "src/main/resources/product.json";

    @Autowired
    private IFileReader fileReader;


    @Override
    public void run(String... args) {
        ProductDB.productList = loadDatabase();

        for (Product product: ProductDB.productList) {
            System.out.println(product);
        }
    }

    private List<Product> loadDatabase() {
        System.out.println("Read data from JSON file");
        return fileReader.readFile(PRODUCT_FILE);
    }
}
