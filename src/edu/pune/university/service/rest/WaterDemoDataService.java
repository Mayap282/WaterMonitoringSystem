package edu.pune.university.service.rest;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import edu.pune.university.business.WaterDataBusiness;
import edu.pune.university.business.WaterDemoDataBusiness;
import edu.pune.university.exception.ApplicationException;

/**
 * WaterDataService class is responsible for holding the REST APIS for water
 * data. This class will interact with {@link WaterDataBusiness} for any
 * operations.
 * 
 * @author <a href="mailto:mayap282@gmail.com">Maya Pilania</a>
 *
 */
@Path("/waterDemo")
public class WaterDemoDataService {

	/**
	 * Instance variable declaration for {@link WaterDataBusiness}.
	 */
	private WaterDemoDataBusiness waterDemoDataBusiness = null;

	/**
	 * Create an instance of {@link WaterDataBusiness}.
	 */
	public WaterDemoDataService() {
		waterDemoDataBusiness = new WaterDemoDataBusiness();
	}

	/**
	 * Get all the water data as Json.
	 * 
	 * @return all water data as Json
	 * @throws ApplicationException
	 */
	@GET
	@Path("/datas")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllWaterData() throws ApplicationException {
		return (new Gson().toJson(waterDemoDataBusiness.getAllWaterDemoDataTOs()));
	}

}
