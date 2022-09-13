package com.testcases;

import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void m1() {
		//System.out.println("M1 Method");
		System.out.println("Started at "+java.time.LocalDateTime.now());
	}
	
	@Test
	public void m2() {
		//System.out.println("M2 Method");
		System.out.println("Started at "+java.time.LocalDateTime.now());
	}
}
