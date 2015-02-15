package com.test.jxls;

import java.util.HashMap;
import java.util.Map;

import net.sf.jxls.transformer.XLSTransformer;

public class WriteToExcel {

	public static void main(String... strings) throws Exception{
		
		String template = "C:/Users/Soumyajyoti/Desktop/software/Eclipse/workspace/TestJXLS/JXLS_JARS/ClientPortfolio.xls";
		String output = "C:/Users/Soumyajyoti/Desktop/software/Eclipse/workspace/TestJXLS/JXLS_JARS/BBB125D587.xls";
		
		ClientPortfolio clientPortfolio = new ClientPortfolio();
		
		Map<String, ClientPortfolio> beans = new HashMap<>();
        beans.put("clientPortfolio", clientPortfolio);
        XLSTransformer transformer = new XLSTransformer();
        transformer.groupCollection("clientPortfolio.assetClasses");
        transformer.transformXLS(template, beans, output);
	}
	
}
