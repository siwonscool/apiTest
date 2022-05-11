package com.test.apiTest.service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.apiTest.dto.ResponseDto;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.test.apiTest.dto.PopularItemDto;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class CallApiService {

    private static RestTemplate restTemplate = new RestTemplate();
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Object getPopularItemsFromTodayHouseApi(String pageNum) throws UnsupportedEncodingException {
        String url = "https://ohou.se/store/category.json?v=2&order=popular&page=" + pageNum + "&per=24";
        ResponseEntity<ResponseDto> response = restTemplate.exchange(url, HttpMethod.GET, null, ResponseDto.class);

        response.getBody().getSelected_products().stream().collect(Collectors.toList());
        return response;
    }
}