/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrahpicalUserInterface.Report;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.ColumnBuilder;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.component.Components;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.exception.DRException;

/**
 *
 * @author my301
 */
public class testingGenReport {
    
    public static void main(String[] args) {

// http://www.mkyong.com/java/reporting-in-java-using-dynamicreports-and-jasperreports/

        
        working on this.....
 
	JasperReportBuilder report = DynamicReports.report();//a new report
	report
	  .columns(
	      Columns.column("Customer Id", "id", DataTypes.integerType()),
	      Columns.column("First Name", "first_name", DataTypes.stringType()),
	      Columns.column("Last Name", "last_name", DataTypes.stringType()),
	      Columns.column("Date", "date", DataTypes.dateType()))
	  .title(//title of the report
	      Components.text("SimpleReportExample")
		  .setHorizontalAlignment(HorizontalAlignment.CENTER))
		  .pageFooter(Components.pageXofY())//show page number on the page footer
		  .setDataSource("SELECT id, first_name, last_name, date FROM customers", 
                                  null);
 
	try {
                //show the report
		report.show();
 
                //export the report to a pdf file
		report.toPdf(new FileOutputStream("/homes/my301/year3/Project/Netbeans/Final_year_project_v1/GeneratedReports/report.pdf"));
	} catch (DRException e) {
		e.printStackTrace();
	} catch (FileNotFoundException ex) { 
            Logger.getLogger(testingGenReport.class.getName()).log(Level.SEVERE, null, ex);
        } 
  }
    
}
