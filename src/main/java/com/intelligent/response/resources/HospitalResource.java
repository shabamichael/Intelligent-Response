package com.intelligent.response.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.intelligent.response.Bean.POJO.HospitalBean;
import com.intelligent.response.bean.pojo.db.operations.HospitalConnection;

@Path("hospital")
public class HospitalResource {
	HospitalConnectionOperations hospital = new HospitalConnectionOperations();
	
	List<HospitalBean> hospitals;
	
	@GET
	@Path("{id}")
	public HospitalBean getHospital(@PathParam("id") long hospitalId) {
		
		HospitalBean hospital= null;	
		
		for (HospitalBean hb: hospitals)
		{
			if (hb.getHospitalID() ==hospitalId) {
				hb = hospital;
				System.out.println(hospital);
			
			}			
		}
		return hospital;
	}

}
