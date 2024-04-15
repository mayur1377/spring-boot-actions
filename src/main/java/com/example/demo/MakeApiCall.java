package com.example.demo;

import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MakeApiCall {

    public String makeApiCall() {
        RestTemplate restTemplate = new RestTemplate();
        String url="https://v2.jokeapi.dev/joke/Any";
        @SuppressWarnings("unchecked")
        Map<String, Object> response = restTemplate.getForObject(url, Map.class);
        StringBuilder result = new StringBuilder();
        for(Map.Entry<String, Object> entry : response.entrySet()) {
            result.append(entry.getKey());
            result.append(entry.getValue());
            result.append("<br>");
        }
        return result.toString();
    }
    
}