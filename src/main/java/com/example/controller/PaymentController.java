package com.example.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaymentController {

    @GetMapping("/process-payment")
    public String processPayment(@RequestParam double amount) {
        // Your logic to process the payment with the specified amount
        return "Payment processed for amount: $" + amount;
    }
}
