/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrahpicalUserInterface.Report;

import java.io.FileNotFoundException;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.exception.DRException;


/**
 *
 * @author my301
 */
public class testingGenReport {
    
    public static void main(String [] agrs) throws DRException, FileNotFoundException{
        
       // dynamic report
		JasperReportBuilder report = DynamicReports.report();

		

        report.show();
        
        
    }
    
}
