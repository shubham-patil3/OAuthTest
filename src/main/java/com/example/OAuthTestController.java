package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;


    @RestController
    public class OAuthTestController {

        @GetMapping("/testOAuth")
        public String testOAuth() {
            RestTemplate restTemplate = new RestTemplate();
            String resourceUrl = "https://api.example.com/protected-resource";
            String accessToken = "your_access_token"; // Replace with your actual access token

            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + accessToken);

            HttpEntity<String> entity = new HttpEntity<>(headers);

            ResponseEntity<String> response = restTemplate.exchange(resourceUrl, HttpMethod.GET, entity, String.class);

            return response.getBody();
        }
    }
