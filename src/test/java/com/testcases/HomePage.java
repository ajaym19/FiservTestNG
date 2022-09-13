package com.testcases;

import org.testng.annotations.Test;

public class HomePage {

	@Test(groups = "sanity", invocationCount = 3)
	public void tc1() {
		System.out.println("Started at "+java.time.LocalDateTime.now());
	}
	@Test(groups = "sanity")
	public void tc2() {
		System.out.println("Started at "+java.time.LocalDateTime.now());
	}
	@Test(groups = "regression")
	public void tc3() {
		System.out.println("Started at "+java.time.LocalDateTime.now());
	}
}
