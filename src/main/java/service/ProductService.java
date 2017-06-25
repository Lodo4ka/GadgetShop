package service;

import entity.Product;
import repository.ProductRepository;

import java.util.List;

/**
 * Created by lodo4ka on 08/06/2017.
 */
public class ProductService {

    ProductRepository productRepository = new ProductRepository();



    public List<Product> getAll() {


        return productRepository.getAll();
    }

    public void add(Product product) {
        productRepository.add(product);
    }

    public void remove(Product selectedItem) {
        productRepository.remove(selectedItem);
    }
}