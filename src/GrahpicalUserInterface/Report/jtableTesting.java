/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrahpicalUserInterface.Report;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Data.User.*;

/**
 *
 * @author my301
 */
public class jtableTesting {
    
    private static DefaultTableModel tableModel;
    private static int columnNumber = 1;
    
    private StoreReportData storeReportDataObj;
    
    
    public jtableTesting(StoreReportData storeReportDataObj)
    {
        this.storeReportDataObj = storeReportDataObj;
        
           tableModel = new DefaultTableModel(createObject(), 5);
                JTable table = new JTable(tableModel);
                JFrame frame = new JFrame("Table Column Add");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBounds(100, 100, 600, 300);
                frame.add(new JScrollPane(table));
                frame.setVisible(true);
    }
    
    private Object [] createObject()
    {
       Object [] obj = new Object[storeReportDataObj.getCollectTestData().getStoreWsdlData().getElmentName().size()+4];
        //System.out.println("obj size "+ obj.length);
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
    
    
    public static void insertData()
    {
        int a = 1;
        int b =1000;
        Object[][] data = new Object[10][5];//[number of rows][number of colouums]
        for(int x = 0; x< 10; x++)
        {
            for (int i = 0; i < 5; i++) {
                data[x][i] = a++;
            }        
        }
        
        for(int x = 0; x< 10; x++)
        {
            for (int i = 0; i < 5; i++) {
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
 
    }
    
    public static void main(String [] agrs)
    {
        //jtableTesting j = new jtableTesting();
        
        insertData();
        
    }
    
}
