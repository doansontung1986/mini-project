package vn.techmaster.miniproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import vn.techmaster.miniproject.model.Product;
import vn.techmaster.miniproject.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String getAllProduct(Model model, @RequestParam(required = false) String brandName) {
        List<Product> productList = new ArrayList<>();

        if (brandName != null) {
            productList = productService.getProductByBrand(brandName);
        }

        if (productList == null || productList.isEmpty()) {
            productList = productService.getAll();
        }

        model.addAttribute("productList", productList);
        return "index";
    }

    @GetMapping("/products/{id}")
    public String getAllProduct(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.getProductDetail(id));
        return "product-detail";
    }
}
