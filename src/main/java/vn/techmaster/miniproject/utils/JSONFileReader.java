package vn.techmaster.miniproject.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import vn.techmaster.miniproject.model.Product;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Component
public class JSONFileReader implements IFileReader {

    @Override
    public List<Product> readFile(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), new TypeReference<>() {
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }
}
