/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aDeleteME;

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
       Object [] obj = new Object[storeReportDataObj.getCollectTestData().getStoreWsdlData().getElmentName().size()+1];
       
       
       
        System.out.println("obj size "+ obj.length);
        obj[0] = "Test Case #";
        for (int i = 0; i < obj.length-1; i++) {
            
            
             obj[i+1] = storeReportDataObj.getCollectTestData().getStoreWsdlData().getElmentName().get(i);
             
             
        }
        for (int i = 0; i <  obj.length; i++) {
            System.out.println("obj  : "+ obj[i]);
        }
        return obj;
    }
    
    public static void main(String [] agrs)
    {
        //jtableTesting j = new jtableTesting();
        
    }
    
}
