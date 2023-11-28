package com.areyes1.junitreport.service;

import static org.junit.Assert.*;

import org.junit.Test;
public class JUnitReportServiceExampleTest {


	private JUnitReportServiceExample junitAssertEqualsServiceSample  = new JUnitReportServiceExample();

	@Test
	public void setData() {
		ServiceObject serviceObject = new ServiceObject();
		junitAssertEqualsServiceSample.initiateMetaData(serviceObject);
		assertEquals(serviceObject.getStatus(),"New");
	}

	@Test
	public void testAssertEqualsFalse() {
		//	processed the item
		ServiceObject newServiceObject = new ServiceObject();
		junitAssertEqualsServiceSample.initiateMetaData(newServiceObject);
		junitAssertEqualsServiceSample.processObject(newServiceObject);
		assertEquals(newServiceObject.getStatus(),"Processed");
	}

	@Test
	public void testAssertEqualsFalsePostProcessing() {
		//	processed the item
		ServiceObject newServiceObject = new ServiceObject();
		junitAssertEqualsServiceSample.initiateMetaData(newServiceObject);
		junitAssertEqualsServiceSample.postProcessing(newServiceObject);
		assertEquals(newServiceObject.getStatus(),"Incomplete");
	}

	@Test
	public void testPostProcessing() {
		ServiceObject object = new ServiceObject();
		object.setStatus("Processed");
		
		ServiceObject result = junitAssertEqualsServiceSample.postProcessing(object);
		
		assertEquals("Incomplete", result.getStatus());
	}

	
	


}
