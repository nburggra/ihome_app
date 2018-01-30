package com.example.demo.product;

import com.example.demo.product.model.Product;
import com.example.demo.product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    IProductRepository IProductRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String product(Model model){
        List<Product> l_Product = (List<Product>) IProductRepository.findAll();
        model.addAttribute("ProductList", l_Product);
        return "views/product/Product";
    }
}
