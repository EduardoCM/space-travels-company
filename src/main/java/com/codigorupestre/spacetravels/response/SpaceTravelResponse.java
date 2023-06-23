package com.codigorupestre.spacetravels.response;

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
public class SpaceTravelResponse implements Serializable {

	private static final long serialVersionUID = -5676547228959372142L;

	private Long id;

	private String origin;

	private String destination;

	private Company company;

	private BigDecimal price;

}
