package com.shopesimple.invmanagerpaymentgatway.Service;

import com.shopesimple.invmanagerpaymentgatway.PaymentGateways.PaymentGatewayInterface;
import com.shopesimple.invmanagerpaymentgatway.PaymentGateways.Stripe.StripePaymentGateway;
import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayService {
private final PaymentGatewayInterface paymentGatewayInterface;
    public PaymentGatewayService(PaymentGatewayInterface paymentGatewayInterface) {
        this.paymentGatewayInterface = paymentGatewayInterface;
    }

    public String PaymentLinkCreator(Long orderId) throws StripeException {
        return paymentGatewayInterface.PaymentLinkCreator(10000L);
    }
}
