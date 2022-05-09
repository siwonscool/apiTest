package com.test.apiTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;

@Slf4j
@SpringBootApplication
public class ApiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiTestApplication.class, args);

		for (int i = 0; i < 10; i++) {
			log.info(i+"");
			log.debug(i+"");
			log.error(i+"");
			log.warn(i+"");
		}
	}

	public Object getItemsFromTodayHouseApi(String regId, String time, String pageNum) throws UnsupportedEncodingException {

		String url = "https://ohou.se/store/category.json?v=2&order=popular&page="+pageNum+"&per=24";
		String serviceKey = "서비스키";
		String decodeServiceKey = URLDecoder.decode(serviceKey, "UTF-8");

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application","json", Charset.forName("UTF-8")));    //Response Header to UTF-8

		UriComponents builder = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("serviceKey", decodeServiceKey)
				.queryParam("regId", regId)
				.queryParam("tmFc", time)
				.queryParam("_type", "json")
				.build(false);    //자동으로 encode해주는 것을 막기 위해 false

		Object response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, new HttpEntity<String>(headers), String.class);
		return response;
	}

}
