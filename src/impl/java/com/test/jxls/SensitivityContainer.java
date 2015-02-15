package com.test.jxls;

import java.util.Arrays;
import java.util.List;

public class SensitivityContainer {
	
	private final String containerId;
	
	private final double delta;
	
	private final double vega;
	
	private final List<Sensitivity> sensitivities;

	public SensitivityContainer(String id) {
		this.containerId = "Container of "+id;
		this.delta = 1254.369;
		this.vega = 9658.25;
		this.sensitivities = Arrays.asList(new Sensitivity("C1"),
										new Sensitivity("C2"),
										new Sensitivity("C3"),
										new Sensitivity("C4"),
										new Sensitivity("C5"),
										new Sensitivity("C6"),
										new Sensitivity("C7"),
										new Sensitivity("C8"));
	}

	public String getContainerId() {
		return containerId;
	}

	public double getDelta() {
		return delta;
	}

	public double getVega() {
		return vega;
	}

	public List<Sensitivity> getSensitivities() {
		return sensitivities;
	}

	
	
}
