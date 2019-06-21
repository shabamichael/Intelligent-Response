package com.intelligent.response.Test;

import static org.junit.Assert.*;

import com.intelligent.response.db.operations.AmbulanceConnectionOperations;


public class Test {

	@org.junit.Test
	public void test() {
		AmbulanceConnectionOperations amb = new AmbulanceConnectionOperations();
		amb.setAmbulanceDetails();
		
		
	}

}
