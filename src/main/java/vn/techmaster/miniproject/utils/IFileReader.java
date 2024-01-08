package vn.techmaster.miniproject.utils;

import vn.techmaster.miniproject.model.Product;

import java.util.List;

public interface IFileReader {
    List<Product> readFile(String fileName);
}
