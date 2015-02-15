package com.test.jxls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 * @author Leonid Vysochyn
 */
public class SingleListExport {
        private static String templateFileName = "C:/Users/Soumyajyoti/Desktop/AngularJs/department.xls";
        private static String destFileName = "C:/Users/Soumyajyoti/Desktop/software/Eclipse/workspace/TestJXLS/JXLS_JARS/employees_single_list_output.xls";

        public static void main(String[] args) throws IOException, ParsePropertyException, InvalidFormatException {

                List<Employee> staff = new ArrayList<>();
                staff.add(new Employee("Derek", 35, 3000d, 0.30));
                staff.add(new Employee("Elsa", 28, 1500d, 0.15));
                staff.add(new Employee("Elsa", 28, 1600d, 0.15));
                staff.add(new Employee("Elsa", 28, 1700d, 0.15));
                staff.add(new Employee("Oleg", 32, 2300d, 0.25));
                staff.add(new Employee("Neil", 34, 2500d, 0.00));
                staff.add(new Employee("Maria", 34, 1700d, 0.15));
                staff.add(new Employee("John", 35, 2800d, 0.20));
                
                Department department = new Department("IT");
                department.setStaff(staff);
				//...  initialization is skipped here
			        Map<String, Department> beans = new HashMap<>();
			        beans.put("department", department);
			        XLSTransformer transformer = new XLSTransformer();
			        // set grouping of rows for "department.staff" collection 
			        transformer.groupCollection("department.staff");
			        transformer.transformXLS(templateFileName, beans, destFileName);
        }

}