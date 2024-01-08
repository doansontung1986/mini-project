package vn.techmaster.miniproject.dao;

import vn.techmaster.miniproject.model.Product;

import java.util.List;

public interface ProductRepositoryInterface {
    List<Product> getAll();
    Product getProductDetail(int id);
    List<Product> getProductByBrand(String brandName);
}
