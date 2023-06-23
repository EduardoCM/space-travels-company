package com.codigorupestre.spacetravels.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/version")
public class VersionAPI {
	
	@Value("${info.app.version}")
	private String version;
	
	@GetMapping
	public String getVersion() {
		log.info("Versionn: {} ", version);
		return version;
	}

}
