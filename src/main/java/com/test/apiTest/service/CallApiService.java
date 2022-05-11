package com.test.apiTest.service;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.test.apiTest.dto.PopularItemDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class CallApiService {

    private static RestTemplate restTemplate = new RestTemplate();
    private static HttpHeaders headers = new HttpHeaders();

    public static Object getPopularItemsFromTodayHouseApi(String pageNum) throws UnsupportedEncodingException {
        String url = "https://ohou.se/store/category.json?v=2&order=popular&page=" + pageNum + "&per=24";
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<String>(headers), Map.class);
        //List<PopularItemDto> list = (List<PopularItemDto>) response.getBody().get("selected_products");

        //Object obj = response.getBody();
        //ArrayList<PopularItemDto> item = (ArrayList<PopularItemDto>) response.getBody().get("selected_products");

        //log.info(list.get(0).getId()+"");
        return response;
    }
}