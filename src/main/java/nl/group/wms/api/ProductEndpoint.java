package nl.group.wms.api;

import nl.group.wms.controller.ProductService;
import nl.group.wms.domein.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductEndpoint {

    @Autowired
    ProductService ps;

    @GetMapping("/allproducts")
    public Iterable<Product> getAllProducts() {
        Iterable<Product> producten = ps.getAllProducts();
        return producten;
    }
}
