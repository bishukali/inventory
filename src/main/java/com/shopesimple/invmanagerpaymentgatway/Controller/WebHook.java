package com.shopesimple.invmanagerpaymentgatway.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class WebHook {
    @GetMapping("/stripe")
    public void webHookRequest(WebHook webHook){


    }
}
