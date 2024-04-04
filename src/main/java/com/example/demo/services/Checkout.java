package com.example.demo.services;
import com.example.demo.services.PurchaseResponse;
import com.example.demo.services.Purchase;


public interface Checkout {
    PurchaseResponse placeOrder(Purchase purchase);
}
