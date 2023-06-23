package com.codigorupestre.spacetravels.service;

import com.codigorupestre.spacetravels.request.SpaceTravelRequest;
import com.codigorupestre.spacetravels.response.SpaceTravelResponse;

public interface SpaceTravelService {

	public SpaceTravelResponse createSpaceTravel(SpaceTravelRequest spaceTravelRequest);

}
