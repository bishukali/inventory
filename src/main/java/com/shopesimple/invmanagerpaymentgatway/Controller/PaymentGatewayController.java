package com.shopesimple.invmanagerpaymentgatway.Controller;

import com.shopesimple.invmanagerpaymentgatway.Dto.PaymentGatewayRequestDto;
import com.shopesimple.invmanagerpaymentgatway.Service.PaymentGatewayService;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PaymentGatewayController {
    private final PaymentGatewayService paymentGatewayService;

    public PaymentGatewayController(PaymentGatewayService paymentGatewayService) {
        this.paymentGatewayService = paymentGatewayService;
    }

    @PostMapping("/")
    public String PaymentLinkCreator(@RequestBody PaymentGatewayRequestDto request) throws StripeException {
        return paymentGatewayService.PaymentLinkCreator(request.getOrderId());
    }
}
