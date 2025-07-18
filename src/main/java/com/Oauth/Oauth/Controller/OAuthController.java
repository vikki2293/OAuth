package com.Oauth.Oauth.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthController {

    @GetMapping("/User")
    public String user(@AuthenticationPrincipal OAuth2User user)
    {
     return user.getAttribute("email");
    }
}
