package com.shopesimple.invmanagerpaymentgatway.Controller;

import com.stripe.model.Event;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebHook {
    @PostMapping("/stripe")
    public void webHookRequest(@RequestBody Event webHook){


    }
}
