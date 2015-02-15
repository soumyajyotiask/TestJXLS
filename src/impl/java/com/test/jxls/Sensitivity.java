package com.test.jxls;

public class Sensitivity {
	
	private String sourceId;
	
	private final double delta;
	private final double vega;
	
	
	
	public Sensitivity(String id) {
		this.sourceId = id;
		this.delta = 254.236;
		this.vega = 0.254;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public double getDelta() {
		return delta;
	}
	public double getVega() {
		return vega;
	}
	
	

}
