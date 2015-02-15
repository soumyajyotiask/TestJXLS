package com.test.jxls;

import java.util.Arrays;
import java.util.List;

public class Bucket {
	
	private final String bucketId;
	
	private final double delta;
	
	private final double vega;
	
	private final List<SensitivityContainer> containers;

	public Bucket(String id) {
		this.bucketId = id;
		this.delta = 8954.78d;
		this.vega = 589.621d;
		this.containers = Arrays.asList(new SensitivityContainer("122"),
										new SensitivityContainer("45"),
										new SensitivityContainer("485"));
	}

	public String getBucketId() {
		return bucketId;
	}

	public double getDelta() {
		return delta;
	}

	public double getVega() {
		return vega;
	}

	public List<SensitivityContainer> getContainers() {
		return containers;
	}

	
	
}