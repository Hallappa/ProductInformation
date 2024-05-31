package com.productInformation.productInformation.controller;

import com.productInformation.productInformation.doa.ProductInfo;
import com.productInformation.productInformation.services.ProductServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/pinfo")
public class ProductInfoController {

    @Autowired
    private ProductServis productServis;

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("productInfo", new ProductInfo());
        return "Home";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute ProductInfo productInfo, Model model) {
        productServis.create(productInfo);
        model.addAttribute("message", "Product created successfully");
        return "Save";
    }

    @GetMapping("/getall")
    public String findAll(Model model) {
        List<ProductInfo> products = productServis.getAll();
        model.addAttribute("products", products);
        return "checkeproduct";
    }

    @GetMapping("/find")
    public String getById(@RequestParam String id, Model model) {
        Optional<ProductInfo> product = productServis.findById(Integer.parseInt(id));


            model.addAttribute("product", product);
            return "IDResult";

    }
    @GetMapping("/delete")
    public String deleteById(@RequestParam String id, Model model) {
        productServis.findAndDeletById(Integer.parseInt(id));
        model.addAttribute("message", "Deleted Successfully");
        return "Save";
    }

}
