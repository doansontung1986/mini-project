package vn.techmaster.miniproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.techmaster.miniproject.dao.ProductRepositoryImpl;
import vn.techmaster.miniproject.model.Product;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepositoryImpl productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Product getProductDetail(int id) {
        return productRepository.getProductDetail(id);
    }

    public List<Product> getProductByBrand(String brandName) {
        return productRepository.getProductByBrand(brandName);
    }
}
