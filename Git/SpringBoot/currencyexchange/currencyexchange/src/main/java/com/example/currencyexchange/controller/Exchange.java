package com.example.currencyexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.json.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

@RestController
public class Exchange {
	
	@Autowired
	private RestTemplate restTemplate;
	
	//To run in development mode
	@GetMapping("/dev")
	public Long rateOfExchangeDev()
	{
		return (long)1.1;
	}
	
	//To run in prod mode
	@GetMapping("/prod")
	public Double rateOfExchangeProd() throws JsonMappingException, JsonProcessingException
	{
		ResponseEntity<String> response = restTemplate.getForEntity("http://www.floatrates.com/daily/EUR.json", String.class);
		ObjectMapper mapper = new JsonMapper();
		JsonNode node =  mapper.readTree(response.getBody().toString());
		return node.get("usd").get("rate").asDouble();
	}

}
