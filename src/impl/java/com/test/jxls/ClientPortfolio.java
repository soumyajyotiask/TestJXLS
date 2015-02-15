package com.test.jxls;

import java.util.Arrays;
import java.util.List;

public class ClientPortfolio {
	
	private final String portfolioId;
	
	private final double initialMargin;
	
	private final double equityAssetClassIm;
	
	private final double rateAssetClassIm;

	private List<AssetClass> assetClasses;
	
	public ClientPortfolio(){
		this("BBB125D587",
				1257896.255,
				25869.45,
				125458.54);
	}
	
	public ClientPortfolio(String portfolioId, double initialMargin,
			double equityAssetClassIm, double rateAssetClassIm) {
		super();
		this.portfolioId = portfolioId;
		this.initialMargin = initialMargin;
		this.equityAssetClassIm = equityAssetClassIm;
		this.rateAssetClassIm = rateAssetClassIm;
		this.assetClasses = Arrays.asList(new AssetClass("EquityAssetClass"),new AssetClass("RateAssetClass"));
	}

	public String getPortfolioId() {
		return portfolioId;
	}

	public double getInitialMargin() {
		return initialMargin;
	}

	public double getEquityAssetClassIm() {
		return equityAssetClassIm;
	}

	public double getRateAssetClassIm() {
		return rateAssetClassIm;
	}

	public List<AssetClass> getAssetClasses() {
		return assetClasses;
	}
	
	public void setAssetClasses(List<AssetClass> assetClasses) {
		this.assetClasses = assetClasses;
	}

	public void addAssetClasses(AssetClass assetClass) {
		assetClasses.add(assetClass);
	}

	public class AssetClass {
		
		private final String id;
		
		private final double delta;
		
		private final double vega;
		
		private final List<Bucket> buckets;
		
		public AssetClass(String id) {
			this.id = id;
			this.delta = 2546.258;
			this.vega = 45872.583;
			this.buckets = Arrays.asList(
					new Bucket("ONE"),
					new Bucket("TWO"),
					new Bucket("THREE"),
					new Bucket("FORE"),
					new Bucket("FIVE"),
					new Bucket("SIX"),
					new Bucket("SEVEN"),
					new Bucket("EIGHT"),
					new Bucket("NINE"),
					new Bucket("TEN"),
					new Bucket("RESIDUAL"));
		}

		public String getId() {
			return id;
		}

		public double getDelta() {
			return delta;
		}

		public double getVega() {
			return vega;
		}

		public List<Bucket> getBuckets() {
			return buckets;
		}

	}
	
}
