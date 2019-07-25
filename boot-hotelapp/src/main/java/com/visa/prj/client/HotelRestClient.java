package com.visa.prj.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.visa.prj.entity.Hotel;

public class HotelRestClient {
 

	public static void main(String[] args) {
		String url = "http://localhost:8080/hotels";
		RestTemplate template = new RestTemplate();
	 	methodOne(template, url);
		methodTwo(template, url);
		//methodThree(template, url);
	}

	
	/*
	 * private static void methodThree(RestTemplate template, String url) {
	 * 
	 * HttpHeaders headers = new HttpHeaders();
	 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	 * headers.setContentType(MediaType.APPLICATION_JSON); //Hotel h = new Hotel(0,
	 * "Nike Shoes", "shoes", 8900.00, 100); HttpEntity<Hotel> requestEntity = new
	 * HttpEntity<Hotel>(h, headers); //Converts product into JSON and JSON goesto
	 * the server
	 * 
	 * ResponseEntity<Hotel> result = template.postForEntity(url, requestEntity,
	 * Hotel.class); System.out.println(result.getStatusCode()); // 201
	 * System.out.println(result.getBody().getId()); }
	 */
	 
	
	//Use getForObject or postForObject when posting or getting a single object
	private static void methodOne(RestTemplate template, String url) {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		String json = template.getForObject(url, String.class);
		System.out.println(json);

	}
	
	//Use exchange when posting or getting a collection
	private static void methodTwo(RestTemplate template, String url) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		ResponseEntity<List<Hotel>> response = 
				template.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Hotel>>() {});

		System.out.println(response.getStatusCode());
		List<Hotel> hotels = response.getBody();
		for (Hotel h : hotels) {
			System.out.println(h.getName() + "," + h.getCity());
		}
	}
}
