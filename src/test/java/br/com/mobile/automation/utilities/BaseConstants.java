package br.com.mobile.automation.utilities;

import java.time.Duration;

import br.com.mobile.automation.utilities.enums.OS;

public class BaseConstants {

	public static OS executionOS;

	public static final String BASE_ACTIVITY = "br.estacio.mobile.MainActivity";
	
	public static Duration DEFAULT_DURATION = Duration.ofSeconds(15);
	
	public static final int DEFAULT_MAX_SCROLLS_TO_FIND_ELEMENT = 5;

}
