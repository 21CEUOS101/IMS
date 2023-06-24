package com.ddit.IMS.Services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddit.IMS.Models.Order;
import com.ddit.IMS.Models.Product;
import com.ddit.IMS.Models.WareHouse;
import com.ddit.IMS.Repository.AdminRepo;
import com.ddit.IMS.Repository.LoginInfoRepo;
import com.ddit.IMS.Repository.OrderRepo;
import com.ddit.IMS.Repository.ProductRepo;
import com.ddit.IMS.Repository.WareHouseRepo;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private WareHouseRepo wareHouseRepo;

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private LoginInfoRepo loginInfoRepo;

    @Override
    public Product createProduct(String name, String description, String category, String brand, String color,
            String size, String price, String quantity, List<WareHouse> wareHouses, List<Order> orders) {

        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setCategory(category);
        product.setBrand(brand);
        product.setColor(color);
        product.setSize(size);
        product.setPrice(price);
        product.setQuantity(quantity);
        product.setWareHouses(wareHouses);
        product.setOrders(orders);
        productRepo.save(product);

        return product;
    }

    @Override
    public void deleteProduct(Integer productId) {

        Product product = productRepo.findById(productId).orElse(null);

        if (product != null) {
            // TODO: throw exception
        }
        productRepo.deleteById(product.getId());
    }

    @Override
    public Product getProduct(Integer productId) {

        Product product = productRepo.findById(productId).orElse(null);

        if (product != null) {
            // TODO: throw exception
        }
        return product;
    }

    @Override
    public List<Product> getProducts() {

        return productRepo.findAll();
    }

    @Override
    public Product updateProduct(Product product, String name, String description, String category, String brand,
            String color, String size, String price, String quantity, List<WareHouse> wareHouses, List<Order> orders) {

        Product oldproduct = productRepo.findById(product.getId()).orElse(null);

        if (oldproduct != null) {
            // TODO: throw exception
        }
        oldproduct.setName(name);
        oldproduct.setDescription(description);
        oldproduct.setCategory(category);
        oldproduct.setBrand(brand);
        oldproduct.setColor(color);
        oldproduct.setSize(size);
        oldproduct.setPrice(price);
        oldproduct.setQuantity(quantity);
        oldproduct.setWareHouses(wareHouses);
        oldproduct.setOrders(orders);
        productRepo.save(oldproduct);

        return null;
    }

    @Override
    public WareHouse createWareHouse(String name, String address, String city, String state, String zipCode,
            List<Product> products, Order order) {

        WareHouse wareHouse = new WareHouse();
        wareHouse.setName(name);
        wareHouse.setAddress(address);
        wareHouse.setCity(city);
        wareHouse.setState(state);
        wareHouse.setZip(zipCode);
        wareHouse.setProducts(products);
        wareHouse.setOrder(order);
        wareHouseRepo.save(wareHouse);

        return wareHouse;
    }

    @Override
    public WareHouse updateWareHouse(WareHouse wareHouse, String name, String address, String city, String state,
            String zipCode, List<Product> products, Order order) {

        WareHouse oldwareHouse = wareHouseRepo.findById(wareHouse.getId()).orElse(null);
        if (oldwareHouse != null) {
            // TODO: throw exception
        }

        oldwareHouse.setName(name);
        oldwareHouse.setAddress(address);
        oldwareHouse.setCity(city);
        oldwareHouse.setState(state);
        oldwareHouse.setZip(zipCode);
        oldwareHouse.setProducts(products);
        oldwareHouse.setOrder(order);
        wareHouseRepo.save(oldwareHouse);
        return null;
    }

    @Override
    public void deleteWareHouse(Integer wareHouseId) {
        WareHouse wareHouse = wareHouseRepo.findById(wareHouseId).orElse(null);
        if (wareHouse != null) {
            // TODO: throw exception
        }
        wareHouseRepo.deleteById(wareHouse.getId());
    }

    @Override
    public WareHouse getWareHouse(Integer wareHouseId) {
        WareHouse wareHouse = wareHouseRepo.findById(wareHouseId).orElse(null);
        if (wareHouse != null) {
            // TODO: throw exception
        }
        return wareHouse;
    }

    @Override
    public List<WareHouse> getWareHouses() {
        return wareHouseRepo.findAll();
    }

    @Override
    public Order createOrder(String status, List<Product> products, WareHouse wareHouse) {

        Order order = new Order();
        LocalDate localDate = LocalDate.now();
        Date date = java.sql.Date.valueOf(localDate);
        order.setDate(date.toString());
        order.setStatus(status);
        order.setProducts(products);
        order.setWareHouse(wareHouse);
        orderRepo.save(order);

        return null;
    }

    @Override
    public Order updateOrder(Order order, String status, List<Product> products, WareHouse wareHouse) {

        Order oldorder = orderRepo.findById(order.getId()).orElse(null);
        if (oldorder != null) {
            // TODO: throw exception
        }

        oldorder.setStatus(status);
        oldorder.setProducts(products);
        oldorder.setWareHouse(wareHouse);
        orderRepo.save(oldorder);
        return null;
    }

    @Override
    public void deleteOrder(Integer orderId) {

        Order order = orderRepo.findById(orderId).orElse(null);
        if (order != null) {
            // TODO: throw exception
        }
        orderRepo.deleteById(order.getId());
    }

    @Override
    public Order getOrder(Integer orderId) {

        Order order = orderRepo.findById(orderId).orElse(null);
        return order;
    }

    @Override
    public List<Order> getOrders() {

        return orderRepo.findAll();
    }
}
