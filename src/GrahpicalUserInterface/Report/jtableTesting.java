/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrahpicalUserInterface.Report;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Data.User.*;
import aDeleteME.TestFrame;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author my301
 */
public final class jtableTesting {
    
    private static DefaultTableModel tableModel;
    private StoreReportData storeReportDataObj;
    
    
    public jtableTesting(StoreReportData storeReportDataObj)
    {
        this.storeReportDataObj = storeReportDataObj;
        tableModel = new DefaultTableModel(setColumns(), 0);
        setRows();
        JTable table = new JTable(tableModel);
        
        JOptionPane.showMessageDialog(null, "Unknow dataType... Class: TestDataGen!");
        ReportGUI testFrame = new ReportGUI(table);
        testFrame.setSize(1000,1000);
        testFrame.setLocationRelativeTo(null);
        testFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
        testFrame.setVisible(true);
        testFrame.revalidate();
        
        
        /*
         * JFrame frame = new JFrame("Report Generated");
         * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         * frame.setBounds(100, 100, 1000, 1000);
         * frame.add(new JScrollPane(table));
         * frame.setVisible(true);
         */
    }
    
    private Object [] setColumns()
    {
        Object [] obj = new Object[storeReportDataObj.getCollectTestData().getStoreWsdlData().getElmentName().size()+4];
        obj[0] = "Test Case #";
        int i =0;
        for (; i < obj.length-4; i++) {
            obj[i+1] = storeReportDataObj.getCollectTestData().getStoreWsdlData().getElmentName().get(i);
        }
        i++;
        obj[i]="Input request";
        i++;
        obj[i]= "Output response";
        i++;
        obj[i]= "Result";
        return obj;
    }
    
    public Object[][] setRows()
    {
        Object[][] data = new Object[this.storeReportDataObj.getInputData().size()][this.storeReportDataObj.getStoreGeneratedValue().get(0).getGeneratedValueList().size()+4];//[number of rows][number of colouums]
        
        for(int x = 0; x< this.storeReportDataObj.getInputData().size(); x++)
        {
            ArrayList<String> generatedValue =  this.storeReportDataObj.getStoreGeneratedValue().get(x).getGeneratedValueList();
            data[x][0] = x+1;
            int i = 0;
            for (; i < generatedValue.size(); i++) {
                data[x][i+1]=generatedValue.get(i);
            }
            i++;
            data[x][i]=this.storeReportDataObj.getInputData().get(x);
            i++;
            data[x][i]=this.storeReportDataObj.getOutPutResponse().get(x);
            i++;
            data[x][i]="Passed";
            tableModel.addRow( data[x]);
        }
        
        
        for(int x = 0; x< this.storeReportDataObj.getInputData().size(); x++)
        {
            ArrayList<String> generatedValue =  this.storeReportDataObj.getStoreGeneratedValue().get(x).getGeneratedValueList();
            int i = 0;
            for (; i < generatedValue.size()+1; i++ ){
                System.out.print(data[x][i]);
            }
            
            System.out.println("");
        }
        
        
        
        
        Object[][] data2 = {
            {"Kathy", "Smith",
                "Snowboarding", new Integer(5), new Boolean(false)},
            {"John", "Doe",
                "Rowing", new Integer(3), new Boolean(true)},
            {"Sue", "Black",
                "", new Integer(2), new Boolean(false)},
            {"Jane", "White",
                "Speed reading", new Integer(20), new Boolean(true)},
            {"Joe", "Brown",
                "Pool", new Integer(10), new Boolean(false)}
        };
        
        
        return data;
        
    }
    
    public static void main(String [] agrs)
    {
        //jtableTesting j = new jtableTesting();
        
        //insertData();
        
    }
    
}
