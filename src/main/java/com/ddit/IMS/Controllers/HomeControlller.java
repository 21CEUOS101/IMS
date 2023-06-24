package com.ddit.IMS.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ddit.IMS.Models.Order;
import com.ddit.IMS.Models.Product;
import com.ddit.IMS.Models.WareHouse;
import com.ddit.IMS.Services.HomeServiceImpl;

@RestController
@RequestMapping("/inventory")
@CrossOrigin(origins = "http://localhost:3000")
public class HomeControlller {

    @Autowired
    private HomeServiceImpl homeServiceImpl;

    @PostMapping("/createProduct")
    public Product createProduct(@RequestParam("name") String name, @RequestParam("description") String description,
            @RequestParam("category") String category, @RequestParam("brand") String brand,
            @RequestParam("color") String color, @RequestParam("size") String size,
            @RequestParam("price") String price, @RequestParam("quantity") String quantity,
            @RequestParam("wareHouseId") Integer wareHouseId) {

        return homeServiceImpl.createProduct(name, description, category, brand, color, size, price, quantity,
                wareHouseId);
    }

    @PostMapping("/deleteProduct")
    public void deleteProduct(@RequestParam("productId") Integer productId) {

        homeServiceImpl.deleteProduct(productId);
    }

    @PostMapping("/updateProduct")
    public Product updateProduct(@RequestParam("productId") Integer productId, @RequestParam("name") String name,
            @RequestParam("description") String description, @RequestParam("category") String category,
            @RequestParam("brand") String brand, @RequestParam("color") String color,
            @RequestParam("size") String size, @RequestParam("price") String price,
            @RequestParam("quantity") String quantity, @RequestParam("wareHouseId") Integer wareHouseId) {

        Product product = homeServiceImpl.getProduct(productId);

        if (product == null) {
            // throw new Exception("Product not found");
        }

        return homeServiceImpl.updateProduct(product, name, description, category, brand, color, size, price,
                quantity, wareHouseId);
    }
    
    @PostMapping("/createOrder")
    public Order createOrder(@RequestParam("status") String status, @RequestParam("products") List<Product> products,
            @RequestParam("wareHouse") WareHouse wareHouse) {

        return homeServiceImpl.createOrder(status, products, wareHouse);
    }
    
    @PostMapping("/deleteOrder")
    public void deleteOrder(@RequestParam("orderId") Integer orderId) {

        homeServiceImpl.deleteOrder(orderId);
    }

    @PostMapping("/updateOrder")
    public Order updateOrder(@RequestParam("orderId") Integer orderId, @RequestParam("status") String status,
            @RequestParam("products") List<Product> products, @RequestParam("wareHouse") WareHouse wareHouse) {

        Order order = homeServiceImpl.getOrder(orderId);

        if (order == null) {
            // throw new Exception("Order not found");
        }

        return homeServiceImpl.updateOrder(order, status, products, wareHouse);
    }

    @PostMapping("/createWareHouse")
    public WareHouse createWareHouse(@RequestParam("name") String name, @RequestParam("address") String address,
            @RequestParam("city") String city, @RequestParam("state") String state,
            @RequestParam("zipCode") String zipCode) {

        return homeServiceImpl.createWareHouse(name, address, city, state, zipCode);
    }

    @PostMapping("/deleteWareHouse")
    public void deleteWareHouse(@RequestParam("wareHouseId") Integer wareHouseId) {

        homeServiceImpl.deleteWareHouse(wareHouseId);
    }

    @PostMapping("/updateWareHouse")
    public WareHouse updateWareHouse(@RequestParam("wareHouseId") Integer wareHouseId,
            @RequestParam("name") String name, @RequestParam("address") String address,
            @RequestParam("city") String city, @RequestParam("state") String state,
            @RequestParam("zipCode") String zipCode) {

        WareHouse wareHouse = homeServiceImpl.getWareHouse(wareHouseId);

        if (wareHouse == null) {
            // throw new Exception("WareHouse not found");
        }

        return homeServiceImpl.updateWareHouse(wareHouse, name, address, city, state, zipCode);
    }

    @PostMapping("/getProduct")
    public Product getProduct(@RequestParam("productId") Integer productId) {

        return homeServiceImpl.getProduct(productId);
    }

    @PostMapping("/getOrder")
    public Order getOrder(@RequestParam("orderId") Integer orderId) {

        return homeServiceImpl.getOrder(orderId);
    }

    @PostMapping("/getWareHouse")
    public WareHouse getWareHouse(@RequestParam("wareHouseId") Integer wareHouseId) {

        return homeServiceImpl.getWareHouse(wareHouseId);
    }

    @PostMapping("/getAllProducts")
    public List<Product> getAllProducts() {

        return homeServiceImpl.getProducts();
    }

    @PostMapping("/getAllOrders")
    public List<Order> getAllOrders() {

        return homeServiceImpl.getOrders();
    }

    @PostMapping("/getAllWareHouses")
    public List<WareHouse> getAllWareHouses() {

        return homeServiceImpl.getWareHouses();
    }



}
