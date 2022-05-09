package com.test.apiTest.service;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallApiService {

    private static RestTemplate restTemplate = new RestTemplate();
    private static HttpHeaders headers = new HttpHeaders();

    public static Object getPopularItemsFromTodayHouseApi(String pageNum) throws UnsupportedEncodingException {
        String url = "https://ohou.se/store/category.json?v=2&order=popular&page=" + pageNum + "&per=24";
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        Object response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<String>(headers), String.class);
        return response;
    }
}