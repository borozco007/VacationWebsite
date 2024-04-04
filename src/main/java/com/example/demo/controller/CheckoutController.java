package com.example.demo.controller;

import com.example.demo.services.Purchase;
import com.example.demo.services.PurchaseResponse;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.Checkout;

//RestController checkout mapping
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private Checkout checkout;
    public CheckoutController(Checkout checkout) {
        this.checkout = checkout;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = checkout.placeOrder(purchase);
        return purchaseResponse;
    }
}