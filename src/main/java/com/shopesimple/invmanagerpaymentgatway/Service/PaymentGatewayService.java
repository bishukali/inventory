package com.shopesimple.invmanagerpaymentgatway.Service;
import com.shopesimple.invmanagerpaymentgatway.PaymentGateways.PaymentGatewayInterface;
import com.shopesimple.invmanagerpaymentgatway.PaymentGateways.Stripe.StripePaymentGateway;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayService {
private final PaymentGatewayInterface paymentGatewayInterface;
//    private final StripePaymentGateway stripePaymentGateway;
    public PaymentGatewayService(@Qualifier("stripePaymentGateway") PaymentGatewayInterface paymentGatewayInterface) {
        this.paymentGatewayInterface = paymentGatewayInterface;
//        this.stripePaymentGateway = stripePaymentGateway;
    }

    public String PaymentLinkCreator(Long orderId) throws StripeException {
        return paymentGatewayInterface.PaymentLinkCreator(10000L);
    }
}

