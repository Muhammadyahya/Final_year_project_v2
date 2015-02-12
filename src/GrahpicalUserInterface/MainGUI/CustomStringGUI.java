/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrahpicalUserInterface.MainGUI;

import Data.User.*;
import Logic.Common.CommonMethodsOne;
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
public class CustomStringGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form CustomIntGui
     */
    private int length;
    private CollectTestData collectTestDataObj;
    
    public CustomStringGUI() {
        initComponents();
        this.length = 1;
        comboBoxColumn(inputTable.getColumnModel().getColumn(1),"valueTwo");
        comboBoxColumn(inputTable.getColumnModel().getColumn(2),"valueOne");
        comboBoxColumn(inputTable.getColumnModel().getColumn(3),"valueOne");
        addRowsTable(length);
    }
    
    public CustomStringGUI(CollectTestData obj, int length) {
        initComponents();
        this.length = length;
        comboBoxColumn(inputTable.getColumnModel().getColumn(1),"valueTwo");
        comboBoxColumn(inputTable.getColumnModel().getColumn(2),"valueOne");
        comboBoxColumn(inputTable.getColumnModel().getColumn(3),"valueOne");
        addRowsTable(this.length);
        this.collectTestDataObj= obj;
        pramLabel.setText("Parameter Name : "+ collectTestDataObj.getStoreWsdlData().getElmentName().get(collectTestDataObj.getCount()));
        pramTypeLabel.setText("Parameter Type : "+ collectTestDataObj.getStoreWsdlData().getElmentType().get(collectTestDataObj.getCount()));
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
        pramTypeLabel = new javax.swing.JLabel();
        lengthTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLabel.setText("TEST DATA GENERATOR");

        pramLabel.setText("Parameter Name :");

        jLabel2.setText("E.g length 5 (aceds or shdme etc).");

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
                "Digit", "Specific", "Value one", "Value two", "Random", "Random with Punctuation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
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
        inputTable.getColumnModel().getColumn(0).setMaxWidth(50);
        inputTable.getColumnModel().getColumn(1).setMaxWidth(55);
        inputTable.getColumnModel().getColumn(2).setMaxWidth(65);
        inputTable.getColumnModel().getColumn(3).setMaxWidth(65);
        inputTable.getColumnModel().getColumn(4).setMaxWidth(60);

        pramTypeLabel.setText("Parameter Type :");

        jButton1.setText("Go");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(headerLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(mainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pramTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pramLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))))
                .addContainerGap(34, Short.MAX_VALUE))
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(closeButton)
                    .addComponent(mainButton))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        
        
        LogicCustomString logicCustomStringObj = new LogicCustomString();
        if(logicCustomStringObj.checkAllFeilds(inputTable.getModel()))
        {
            collectTestDataObj.addTestCaseInfo(logicCustomStringObj.getCustomArrayListData());
            this.dispose();
            collectTestDataObj.increaseCount();
            collectTestDataObj.CollectTestCaseData(collectTestDataObj);
        }
        else{
            JOptionPane.showMessageDialog(null,"Error on line "+logicCustomStringObj.getErrorLine()+" .");
        }        
    }//GEN-LAST:event_nextButtonActionPerformed
    
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
            StringGUI stringGUIFrame = new StringGUI(collectTestDataObj);
            stringGUIFrame.setSize(500,600);
            stringGUIFrame.setLocationRelativeTo(null);
            stringGUIFrame.setDefaultCloseOperation(StringGUI.DISPOSE_ON_CLOSE);
            stringGUIFrame.setVisible(true);
            stringGUIFrame.revalidate();
        }
    }//GEN-LAST:event_mainButtonActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!lengthTextField.getText().equals("")&& CommonMethodsOne.isInt(lengthTextField.getText()))
        {
            int tempLength = Integer.parseInt(lengthTextField.getText());
            if(tempLength>0){
                this.dispose();
                CustomStringGUI customStringGuiFrame = new CustomStringGUI(collectTestDataObj,tempLength);
                customStringGuiFrame.setSize(550,550);
                customStringGuiFrame.setLocationRelativeTo(null);
                customStringGuiFrame.setDefaultCloseOperation(IntegerGUI.DISPOSE_ON_CLOSE);
                customStringGuiFrame.setVisible(true);
                customStringGuiFrame.revalidate();
            }
            else{
                JOptionPane.showMessageDialog(null,"Only accept integers greater than 0.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please enter length.\n\nOnly accept integers.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void addRowsTable(int length) {
        DefaultTableModel model = (DefaultTableModel) inputTable.getModel();
        inputTable = new JTable(model);
        for(int i = 0; i<length; i++)
        {
            model.addRow(new Object[]{i+1, "",
                "", "", new Boolean(false), new Boolean(false)});
        }
    }
    
    public void comboBoxColumn(TableColumn columnNum, String value) {
        
        LogicCustomString logicCustomStringObj = new LogicCustomString();
        columnNum.setCellEditor(new DefaultCellEditor(logicCustomStringObj.addValueToJComboBox(value)));
        
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
            java.util.logging.Logger.getLogger(CustomStringGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomStringGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomStringGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomStringGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomStringGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JTable inputTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lengthTextField;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel pramLabel;
    private javax.swing.JLabel pramTypeLabel;
    // End of variables declaration//GEN-END:variables
}
