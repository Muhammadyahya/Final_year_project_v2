/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrahpicalUserInterface.MainGUI;

import Data.User.*;
import Logic.UserInterface.*;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author my301
 */
public class CustomIntGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form CustomIntGUI
     */
    private int length;
    private CollectTestData collectTestDataObj;
    
    public CustomIntGUI() {
        initComponents();
        //comboBoxColumn(jTable1.getColumnModel().getColumn(2));
        //addRowsTable(0);
        /* delete this below lines after testing  and un commit above lines*/
        
        this.length = 4;
        
        comboBoxColumn(inputTable.getColumnModel().getColumn(1));
        comboBoxColumn(inputTable.getColumnModel().getColumn(2));
        comboBoxColumn(inputTable.getColumnModel().getColumn(3));
        addRowsTable(length);
        
        
        /* delete finished */
        
    }
    
    public CustomIntGUI(CollectTestData obj, int length) {
        initComponents();
        this.length = length+1;
        comboBoxColumn(inputTable.getColumnModel().getColumn(1));
        comboBoxColumn(inputTable.getColumnModel().getColumn(2));
        comboBoxColumn(inputTable.getColumnModel().getColumn(3));
        addRowsTable(this.length);
        this.collectTestDataObj= obj;
        pramLabel.setText("Parameter Name : "+ collectTestDataObj.getStoreWsdlData().getElementName().get(collectTestDataObj.getCount()));
        pramTypeLabel.setText("Parameter Type : "+ collectTestDataObj.getStoreWsdlData().getElementType().get(collectTestDataObj.getCount()));
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
        pramLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        mainButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputTable = new javax.swing.JTable();
        lengthComboBox = new javax.swing.JComboBox();
        pramTypeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLabel.setText("TEST DATA GENERATOR");

        pramLabel.setText("Parameter Name :");

        jLabel2.setText("E.g length 5 (12345 or 32143 etc).");

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        mainButton.setText("Back");
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

        inputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Digit", "Specific", "Value one", "Value two", "Random"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inputTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(inputTable);

        lengthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        lengthComboBox.setToolTipText("");
        lengthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthComboBoxActionPerformed(evt);
            }
        });

        pramTypeLabel.setText("Parameter Type :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lengthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(mainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pramLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pramTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(headerLabel)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pramLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pramTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(closeButton)
                    .addComponent(mainButton))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        
        LogicCustomInt logicCustomIntObj = new LogicCustomInt();
        
        if(logicCustomIntObj.checkAllFeilds(inputTable.getModel()))
        {
            collectTestDataObj.addTestCaseInfo(logicCustomIntObj.getCustomArrayListData());
            this.dispose();
            collectTestDataObj.increaseCount();
            collectTestDataObj.CollectTestCaseData(collectTestDataObj);
        }
        else{
            JOptionPane.showMessageDialog(null,"Error on line "+logicCustomIntObj.getErrorLine()+" .");
        }
        
    }//GEN-LAST:event_nextButtonActionPerformed
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Close the program?")==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed
    
    private void lengthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthComboBoxActionPerformed
        // TODO add your handling code here:
        int tempLength = lengthComboBox.getSelectedIndex();
        this.dispose();
        CustomIntGUI customIntGuiFrame = new CustomIntGUI(collectTestDataObj,tempLength);
        customIntGuiFrame.setSize(550,550);
        customIntGuiFrame.setLocationRelativeTo(null);
        customIntGuiFrame.setDefaultCloseOperation(IntegerGUI.DISPOSE_ON_CLOSE);
        customIntGuiFrame.setVisible(true);
        customIntGuiFrame.revalidate();
        
    }//GEN-LAST:event_lengthComboBoxActionPerformed
    
    private void mainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainButtonActionPerformed
        
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to go back")==0)
        {
            this.dispose();
            IntegerGUI intGenGUIFrame = new IntegerGUI(collectTestDataObj);
            intGenGUIFrame.setSize(450,600);
            intGenGUIFrame.setLocationRelativeTo(null);
            intGenGUIFrame.setDefaultCloseOperation(IntegerGUI.DISPOSE_ON_CLOSE);
            intGenGUIFrame.setVisible(true);
            intGenGUIFrame.revalidate();
        }
    }//GEN-LAST:event_mainButtonActionPerformed
    
    
    public void addRowsTable(int length) {
        DefaultTableModel model = (DefaultTableModel) inputTable.getModel();
        inputTable = new JTable(model);
        for(int i = 0; i<length; i++)
        {
            model.addRow(new Object[]{i+1, "",
                "", "", new Boolean(false)});
        }
    }
    
    public void comboBoxColumn(TableColumn columnNum) {
        
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("1");
        comboBox.addItem("2");
        comboBox.addItem("3");
        comboBox.addItem("4");
        comboBox.addItem("5");
        comboBox.addItem("6");
        comboBox.addItem("7");
        comboBox.addItem("8");
        comboBox.addItem("9");
        comboBox.addItem("0");
        columnNum.setCellEditor(new DefaultCellEditor(comboBox));        
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
            java.util.logging.Logger.getLogger(CustomIntGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomIntGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomIntGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomIntGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomIntGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JTable inputTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox lengthComboBox;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel pramLabel;
    private javax.swing.JLabel pramTypeLabel;
    // End of variables declaration//GEN-END:variables
}
