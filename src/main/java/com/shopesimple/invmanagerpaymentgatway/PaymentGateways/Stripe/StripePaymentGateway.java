package com.shopesimple.invmanagerpaymentgatway.PaymentGateways.Stripe;
import com.shopesimple.invmanagerpaymentgatway.PaymentGateways.PaymentGatewayInterface;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLink;
import com.stripe.model.Price;
import com.stripe.model.Product;
import com.stripe.param.PaymentLinkCreateParams;
import com.stripe.param.PriceCreateParams;
import com.stripe.param.ProductCreateParams;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("stripePaymentGateway")
@Primary
public class StripePaymentGateway implements PaymentGatewayInterface {
    @Value("${stripe.secret_key_test}")
    private String stripeKeyTest;


    @Override
    public String PaymentLinkCreator(Long amount) throws StripeException {
// Set your secret key. Remember to switch to your live secret key in production.
// See your keys here: https://dashboard.stripe.com/apikeys
        Stripe.apiKey = stripeKeyTest;

        ProductCreateParams productParam =
                ProductCreateParams.builder().setName("Generic").build();
        Product product = Product.create(productParam);

        PriceCreateParams params =
                PriceCreateParams.builder()
                        .setCurrency("inr")
                        .setUnitAmount(amount)
                        .setProduct(product.getId())
                        .build();

        Price price = Price.create(params);

        PaymentLinkCreateParams productPriceParam =
                PaymentLinkCreateParams.builder()
                        .addLineItem(
                                PaymentLinkCreateParams.LineItem.builder()
                                        .setPrice(price.getId())
                                        .setQuantity(1L)
                                        .build()
                        )
                        .build();

        PaymentLink paymentLink = PaymentLink.create(productPriceParam);
        return paymentLink.getUrl();
    }
}
