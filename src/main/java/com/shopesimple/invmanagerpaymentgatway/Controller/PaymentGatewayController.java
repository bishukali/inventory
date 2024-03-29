package com.shopesimple.invmanagerpaymentgatway.Controller;

import com.shopesimple.invmanagerpaymentgatway.Dto.PaymentGatewayRequestDto;
import com.shopesimple.invmanagerpaymentgatway.Service.PaymentGatewayService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment-gateway")
public class PaymentGatewayController {
    private final PaymentGatewayService paymentGatewayService;


    @Autowired
    public PaymentGatewayController(PaymentGatewayService paymentGatewayService) {
        this.paymentGatewayService = paymentGatewayService;
    }

    @PostMapping("/payment-link-creator")
    public String PaymentLinkCreator(@RequestBody PaymentGatewayRequestDto request) throws StripeException {
        return paymentGatewayService.PaymentLinkCreator(request.getOrderId());
    }
}
