/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrahpicalUserInterface.Report;

/**
 *
 * @author my301
 */
import Data.User.StoreReportData;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GenReport extends JPanel{
     /*
    
    Object rowData[][] = {};
        Object columnNames[] = { "Video_Name", "Size (Kb)"};
        DefaultTableModel model = new DefaultTableModel(rowData, columnNames);
        JTable table = new JTable(model);
        private JScrollPane sp = new JScrollPane(table);
        
        */
        
    private DefaultTableModel tableModel = new DefaultTableModel(0, 4);
    private StoreReportData storeReportDataObj;
    JTable table = new JTable(tableModel);
    private JScrollPane sp = new JScrollPane(table);
    
    private JEditorPane ep = new JEditorPane();
    private JEditorPane ep2 = new JEditorPane();
    private JScrollPane sp2 = new JScrollPane(ep);
    private JScrollPane sp3 = new JScrollPane(ep2);
    
    private JPanel butHold = new JPanel();
    private JPanel tableHold = new JPanel();
    private JPanel scrollHold = new JPanel();
    private GridBagConstraints gbc = new GridBagConstraints();
    private JButton b1 = new JButton("Button1"), b2 = new JButton("Button2"), b3 = new JButton("Button3");
    private JPanel space1 = new JPanel();
    private JPanel space2 = new JPanel();
    private JPanel space3 = new JPanel();
    
    private JPanel inter = new JPanel();
    
    public GenReport(StoreReportData storeReportDataObj){
        
        /*
       
        */
        this.storeReportDataObj = storeReportDataObj;
        tableModel = new DefaultTableModel(setColumns(), 0);
        setRows();
        this.table = new JTable(tableModel);
        

        
        space1.setPreferredSize(new Dimension(50,50));
        space2.setPreferredSize(new Dimension(50,50));
        this.setLayout(new BorderLayout());
        
        this.add(space3, BorderLayout.PAGE_START);
        space3.setPreferredSize(new Dimension(50,20));
        this.add(tableHold, BorderLayout.CENTER);
        this.add(inter, BorderLayout.PAGE_END);
        
        tableHold.setLayout(new BorderLayout());
        tableHold.add(sp, BorderLayout.CENTER);
        tableHold.add(space1, BorderLayout.LINE_START);
        tableHold.add(space2, BorderLayout.LINE_END);
        
        BorderLayout bl = new BorderLayout();
        bl.setVgap(5);
        inter.setLayout(bl);
        inter.add(scrollHold, BorderLayout.CENTER);
        scrollHold.setLayout(new BorderLayout());
        
        JPanel actualScrolls = new JPanel();
        actualScrolls.setLayout(new BorderLayout());
        JPanel spc1 = new JPanel();
        JPanel spc2 = new JPanel();
        spc1.setPreferredSize(new Dimension(50,50));
        spc2.setPreferredSize(new Dimension(50,50));
        scrollHold.add(spc1, BorderLayout.LINE_START);
        scrollHold.add(actualScrolls, BorderLayout.CENTER);
        scrollHold.add(spc2, BorderLayout.LINE_END);
        
        //scrollHold.add(sp3, BorderLayout.LINE_END);
        sp2.setPreferredSize(new Dimension(350,150));
        
        actualScrolls.add(sp2, BorderLayout.LINE_START);
        actualScrolls.add(sp3, BorderLayout.CENTER);
        
        JPanel butHoldHold = new JPanel();
        JPanel space99 = new JPanel();
        space99.setPreferredSize(new Dimension(50,20));
        butHoldHold.setLayout(new BorderLayout());
        butHoldHold.add(butHold, BorderLayout.CENTER);
        butHoldHold.add(space99, BorderLayout.PAGE_END);
        inter.add(butHoldHold, BorderLayout.PAGE_END);
        butHold.setLayout(new GridBagLayout());
        
        gbc.gridx=0;
        gbc.gridy=0;
        butHold.add(b1, gbc);
        gbc.gridx=1;
        gbc.gridy=0;
        butHold.add(b2, gbc);
        gbc.gridx=2;
        gbc.gridy=0;
        butHold.add(b3, gbc);
        
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
    
    
    public static void main(String[] args){
        
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(850,580);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout());
        //f.add(new GenReport());
        f.revalidate();
        
    }
}
