package com.codigorupestre.spacetravels.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigorupestre.spacetravels.repository.SpaceTravelRepository;
import com.codigorupestre.spacetravels.request.SpaceTravelRequest;
import com.codigorupestre.spacetravels.response.SpaceTravelResponse;
import com.codigorupestre.spacetravels.service.SpaceTravelService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/spacetravel")
public class SpaceTravelAPI {

	@Autowired
	private SpaceTravelService service;
	
	@Autowired
	private SpaceTravelRepository repository;
	
	@PostMapping
	public ResponseEntity<?> createSpaceTravel(Authentication autentication, @RequestBody SpaceTravelRequest request){
		log.info("Create {} ", request);
		SpaceTravelResponse response = service.createSpaceTravel(request);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<?> getAllTravels(){
		return new ResponseEntity<>(repository.findAll(), HttpStatus.OK) ;
	}

}
