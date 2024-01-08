package vn.techmaster.miniproject.dao;

import org.springframework.stereotype.Repository;
import vn.techmaster.miniproject.database.ProductDB;
import vn.techmaster.miniproject.model.Product;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepositoryImpl implements ProductRepositoryInterface {
    @Override
    public List<Product> getAll() {
        return ProductDB.productList.stream().toList();
    }

    @Override
    public Product getProductDetail(int id) {
        return ProductDB.productList.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Product> getProductByBrand(String brandName) {
        return ProductDB.productList.stream().filter(product -> product.getName().equals(brandName)).collect(Collectors.toList());
    }
}
