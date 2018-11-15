package com.thoughtmechanix.licenses.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("licensingservice")
public class ServiceConfig {

	/*
	 * @Value("${example.property}") private String exampleProperty;
	 * 
	 * public String getExampleProperty() { return exampleProperty; }
	 * 
	 * public void setExampleProperty(String exampleProperty) { this.exampleProperty
	 * = exampleProperty; }
	 */

	private String example;

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

}
