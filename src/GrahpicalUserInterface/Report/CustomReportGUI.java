/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrahpicalUserInterface.Report;

import GrahpicalUserInterface.MainGUI.*;
import Data.User.*;
import Logic.CheckResult.*;
import Logic.Common.CommonMethodsOne;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author my301
 */
public class CustomReportGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form CustomReportGUI
     */
    private StoreReportData storeReportDataObj;
    
    public CustomReportGUI() {
        initComponents();
        setColumns();
        this.revalidate();
        
    }
    
    public CustomReportGUI(StoreReportData storeReportDataObj) {
        initComponents();
        this.storeReportDataObj = storeReportDataObj;
        setColumns();
        // setRows();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLabel = new javax.swing.JLabel();
        mainButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        detailLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLabel.setText("TEST DATA GENERATOR");

        mainButton.setText("Done");
        mainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        reportTable.getTableHeader().setReorderingAllowed(false);
        reportTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reportTable);

        detailLabel.setText("Detail");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(351, 351, 351)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)
                                .addComponent(mainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(headerLabel)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(detailLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(mainButton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Close the program?")==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed
    
    private void mainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainButtonActionPerformed
        
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to go back")==0)
        {
            this.dispose();
            IntegerGUI intGenGUIFrame = new IntegerGUI(storeReportDataObj.getCollectTestData());
            intGenGUIFrame.setSize(450,600);
            intGenGUIFrame.setLocationRelativeTo(null);
            intGenGUIFrame.setDefaultCloseOperation(IntegerGUI.DISPOSE_ON_CLOSE);
            intGenGUIFrame.setVisible(true);
            intGenGUIFrame.revalidate();
        }
    }//GEN-LAST:event_mainButtonActionPerformed
    
    
    private void reportTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTableMouseClicked
        // TODO add your handling code here:
        
        if(reportTable.isEnabled())
        {
            this.detailLabel.setText("Detail:  "+reportTable.getModel().getColumnName(reportTable.getSelectedColumn()));
            if(reportTable.getModel().getColumnCount()-4 == reportTable.getSelectedColumn() || reportTable.getModel().getColumnCount()-3 == reportTable.getSelectedColumn())
            {
                jTextArea1.setText(CommonMethodsOne.format(reportTable.getModel().getValueAt(reportTable.getSelectedRow(), reportTable.getSelectedColumn()).toString()));
            }
            else
            {
                jTextArea1.setText(reportTable.getModel().getValueAt(reportTable.getSelectedRow(), reportTable.getSelectedColumn()).toString());
            }
        }
    }//GEN-LAST:event_reportTableMouseClicked
    
    private void setColumns()
    {
        
        Object [] columnNames = new Object[storeReportDataObj.getCollectTestData().getStoreWsdlData().getElmentName().size()+5];
        columnNames[0] = "Test Case #";
        int i =0;
        for (; i < columnNames.length-5; i++) {
            columnNames[i+1] = storeReportDataObj.getCollectTestData().getStoreWsdlData().getElmentName().get(i);
        }
        i++;
        columnNames[i]="Input request";
        i++;
        columnNames[i]= "Output response";
        i++;i++;
        System.out.println("3333 "+ i);
        columnNames[i]= "Result";
        i--;
        System.out.println("4444 "+ i);
        columnNames[i]="Tag Value";
        Object [] [] rowData =  setRows();
        DefaultTableModel model = (DefaultTableModel) reportTable.getModel();
        
        model.setColumnIdentifiers(columnNames);
        model.setDataVector(rowData, columnNames);
        reportTable.setModel(model);
        
    }
    
    
    private Object [] [] setRows()
    {
        Object[][] data = new Object[this.storeReportDataObj.getInputData().size()][this.storeReportDataObj.getStoreGeneratedValue().get(0).getGeneratedValueList().size()+5];//[number of rows][number of colouums]
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
            i++;i++;
            System.out.println("11111 "+ i);
            ResultChecker resultCheckerObj = new ResultChecker(storeReportDataObj, x);
            data[x][i]= resultCheckerObj.checkResponse();
            i--;
            System.out.println("2222 "+ i);
            data[x][i]= this.storeReportDataObj.getActualTagValue().get(x);
            DefaultTableModel model = (DefaultTableModel) reportTable.getModel();
            model.addRow(data[x]);
        }        
        return data;        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomReportGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mainButton;
    private javax.swing.JTable reportTable;
    // End of variables declaration//GEN-END:variables
}
