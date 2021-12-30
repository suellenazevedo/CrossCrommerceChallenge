package com.etlchallengecrosscommerce.etlchallenge.controller;

import java.util.ArrayList;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;

import com.etlchallengecrosscommerce.etlchallenge.response.ChallengeResponse;

//dev: Suellen Azevedo

@RestController
 class ChallengeController {

	private WebClient client = WebClient.create("http://challenge.dienekes.com.br/api");
	
	@RequestMapping("/numbers")
    ArrayList<Double> home() {
		
		ResponseSpec uriSpec = client
				.get()
				.uri("/numbers?page=13")
				.retrieve();
		
		ChallengeResponse response = uriSpec.bodyToMono(ChallengeResponse.class).block();
		
		return response.sortNumbers();
    

	 	}
}
