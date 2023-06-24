package com.ddit.IMS.Services;

import java.util.List;

import com.ddit.IMS.Models.Order;
import com.ddit.IMS.Models.Product;
import com.ddit.IMS.Models.WareHouse;

public interface HomeService {

    //create
	public Product createProduct(String name, String description, String category, String brand, String color,
			String size, String price, String quantity, List<WareHouse> wareHouses , List<Order> orders);
	
	//update
	public Product updateProduct(Product product,String name, String description, String category, String brand, String color,
			String size, String price, String quantity,List<WareHouse> wareHouses , List<Order> orders);
	
	//delete
	public void deleteProduct(Integer productId);
	
	//get - single category
	public Product getProduct(Integer productId);
	
	//get - All categories;
	public List<Product> getProducts();
	
	//create
	public WareHouse createWareHouse(String name, String address, String city, String state, String zipCode , List<Product> products , Order order);

	//update
	public WareHouse updateWareHouse(WareHouse wareHouse,String name, String address, String city, String state, String zipCode , List<Product> products , Order order);

	//delete
	public void deleteWareHouse(Integer wareHouseId);

	//get - single category
	public WareHouse getWareHouse(Integer wareHouseId);

	public List<WareHouse> getWareHouses();

	public Order createOrder(String status, List<Product> products, WareHouse wareHouse);

	public Order updateOrder(Order order,String status, List<Product> products, WareHouse wareHouse);

	public void deleteOrder(Integer orderId);

	public Order getOrder(Integer orderId);

	public List<Order> getOrders();

}

