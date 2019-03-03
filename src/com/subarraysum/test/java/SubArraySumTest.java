package com.subarraysum.test.java;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.subarraysum.dto.java.OutputDto;
import com.subarraysum.impl.java.FindMaxSubArrayImpl;
import com.subarraysum.impl.java.IFindMaxSubArraySum;

public class SubArraySumTest {

	 OutputDto expectedDto = new OutputDto();
	    OutputDto unExpectedDto = new OutputDto();
		IFindMaxSubArraySum fmss = null ;
		@BeforeClass
	    public static void setup() {
	        System.out.println("Startig up..");
	    }
		
		@Before
	    public void initialize() {
	        System.out.println("Startig up..in Before");
	    	fmss = new FindMaxSubArrayImpl();

		    expectedDto.setMaxSum(6);
		    expectedDto.setStartingIndex(3);
		    expectedDto.setEndingIndex(6);
		    expectedDto.setLength(4);
		    Integer subArr[] = {4, -1, 2, 1};
		    expectedDto.setElements(subArr);
		    
		    unExpectedDto.setMaxSum(2);
		    unExpectedDto.setStartingIndex(4);
		    unExpectedDto.setEndingIndex(6);
		    unExpectedDto.setLength(3);
		    Integer subArr1[] = {-1, 2, 1};
		    unExpectedDto.setElements(subArr1);
	    }
	 
	    @Test
	    public void testMaxSum() {
	    	Integer arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	    	OutputDto actualDto = new OutputDto();
	    	actualDto = fmss.findMaxSubArraySum(arr);
	        assertEquals(expectedDto.getMaxSum(), actualDto.getMaxSum());
	    }
	    
	    @Test
	    public void testSatrtingIndex() {
	    	Integer arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	    	OutputDto actualDto = new OutputDto();
	    	actualDto = fmss.findMaxSubArraySum(arr);
	        assertEquals(expectedDto.getStartingIndex(), actualDto.getStartingIndex());
	    }
	    
	    @Test
	    public void testEndingIndex() {
	    	Integer arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	    	OutputDto actualDto = new OutputDto();
	    	actualDto = fmss.findMaxSubArraySum(arr);
	        assertEquals(expectedDto.getEndingIndex(), actualDto.getEndingIndex());
	    }
	    
	    @Test
	    public void testSubArrayElements() {
	    	Integer arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	    	OutputDto actualDto = new OutputDto();
	    	actualDto = fmss.findMaxSubArraySum(arr);
	        assertArrayEquals(expectedDto.getElements(), actualDto.getElements());
	    }
	    
	    @Test
	    public void testMaxSumNotNull() {
	    	Integer arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	    	OutputDto actualDto = new OutputDto();
	    	actualDto = fmss.findMaxSubArraySum(arr);
	    	assertNotNull(actualDto);
	    }
	    
	    @Test
	    public void testMaxSumNotEqual() {
	    	Integer arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	    	OutputDto actualDto = new OutputDto();
	    	actualDto = fmss.findMaxSubArraySum(arr);
	        assertNotEquals(unExpectedDto.getMaxSum(), actualDto.getMaxSum());
	    }
	    
	    @Test
	    public void testMaxSumWithAssertThat() {
	    	Integer arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        assertThat(fmss.findMaxSubArraySum(arr).getMaxSum(), is(fmss.findMaxSubArraySum(arr).getMaxSum()));
	    }
	    
	    @Test(expected = Exception.class)
	    public void testMaxSumWithExceptionWhenArrayIsNull() {
	    	OutputDto actualDto = new OutputDto();
	    	actualDto = fmss.findMaxSubArraySum(null);
	        assertNotEquals(unExpectedDto.getMaxSum(), actualDto.getMaxSum());
	    }
	    
	    
	    @After
	    public void finalize() {
	        System.out.println("Startig up..in After");
	    }
	    
	    @AfterClass
	    public static void tearDown() {
	        System.out.println("Ending..");
	    }

}
