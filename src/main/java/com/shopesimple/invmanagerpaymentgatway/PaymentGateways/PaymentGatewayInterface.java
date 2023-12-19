package com.shopesimple.invmanagerpaymentgatway.PaymentGateways;

import com.stripe.exception.StripeException;

public interface PaymentGatewayInterface {
    public String PaymentLinkCreator(Long amount) throws StripeException;
}
