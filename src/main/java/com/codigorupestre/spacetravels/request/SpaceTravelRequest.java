package com.codigorupestre.spacetravels.request;

import java.io.Serializable;
import java.math.BigDecimal;

import com.codigorupestre.spacetravels.entity.Company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpaceTravelRequest implements Serializable {
	
	private static final long serialVersionUID = 9068837494001778519L;

	private String origin;

	private String destination;

	private Company company;

	private BigDecimal price;

}
