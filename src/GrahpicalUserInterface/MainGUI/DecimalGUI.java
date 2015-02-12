/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package GrahpicalUserInterface.MainGUI;

import Data.User.CollectTestData;
import Logic.Common.CommonMethodsOne;
import javax.swing.JOptionPane;
import Logic.GenerateTestData.*;
import Logic.UserInterface.*;

/**
 *
 * @author my301
 */
public class DecimalGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form IntegerGUI
     */
    private CollectTestData collectTestDataObj;
    
    public DecimalGUI() {
        initComponents();
        this.radioButton();
    }
    
    public DecimalGUI(CollectTestData obj) {
        initComponents();
        this.collectTestDataObj = obj;
        this.radioButton();
        pramLabel.setText("Parameter Name : "+ collectTestDataObj.getStoreWsdlData().getElmentName().get(collectTestDataObj.getCount()));
        pramTypeLabel.setText("Parameter Type : "+ collectTestDataObj.getStoreWsdlData().getElmentType().get(collectTestDataObj.getCount()));
    }
    
    /*
    * adding the radio button in group so only one is selected
    */
    public void radioButton()
    {
        groupRadioButton.add(randomRadioButton);
        groupRadioButton.add(specificRadioButton);
        groupRadioButton.add(randomBetweenRadioButton);
        groupRadioButton.add(customRadioButton);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRadioButton = new javax.swing.ButtonGroup();
        headerLabel = new javax.swing.JLabel();
        pramLabel = new javax.swing.JLabel();
        randomRadioButton = new javax.swing.JRadioButton();
        specificRadioButton = new javax.swing.JRadioButton();
        randomBetweenRadioButton = new javax.swing.JRadioButton();
        valueOneTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        valueTwoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        noteLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        mainButton = new javax.swing.JButton();
        customRadioButton = new javax.swing.JRadioButton();
        specificTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lengthComboBox = new javax.swing.JComboBox();
        pramTypeLabel = new javax.swing.JLabel();
        decimalComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLabel.setText("TEST DATA GENERATOR");

        pramLabel.setText("Parameter Name :");

        randomRadioButton.setText("Random Number");

        specificRadioButton.setText("Specific Number");

        randomBetweenRadioButton.setText("Random Number between two numbers");

        jLabel1.setText("Value One");

        jLabel2.setText("Value Two");

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        noteLabel.setText("Note");

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        mainButton.setText("Main Menu");
        mainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainButtonActionPerformed(evt);
            }
        });

        customRadioButton.setText("Custom ( More Options )");

        jLabel3.setText("E.g length 5 (12345 or 32143 etc).");

        lengthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        pramTypeLabel.setText("Parameter Type :");

        decimalComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jLabel4.setText("Decimal Point Position");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(randomBetweenRadioButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(specificRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(specificTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(noteLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(valueOneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(valueTwoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(decimalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pramTypeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pramLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                            .addComponent(customRadioButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(mainButton)
                                    .addGap(39, 39, 39)
                                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(randomRadioButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(lengthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(headerLabel)
                        .addGap(0, 211, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(headerLabel)
                .addGap(27, 27, 27)
                .addComponent(pramLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(pramTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(randomRadioButton)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specificRadioButton)
                    .addComponent(specificTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(randomBetweenRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueOneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(valueTwoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decimalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(noteLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(closeButton)
                    .addComponent(mainButton))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
        if(randomRadioButton.isSelected()||specificRadioButton.isSelected()||randomBetweenRadioButton.isSelected()||customRadioButton.isSelected()){
            
            if(customRadioButton.isSelected())
            {
                // go the custom int GUI
                this.dispose();
                CustomDecimalGUI customDecimalGuiFrame = new CustomDecimalGUI(collectTestDataObj,1);
                customDecimalGuiFrame.setSize(550,550);
                customDecimalGuiFrame.setLocationRelativeTo(null);
                customDecimalGuiFrame.setDefaultCloseOperation(DecimalGUI.DISPOSE_ON_CLOSE);
                customDecimalGuiFrame.setVisible(true);
                customDecimalGuiFrame.revalidate();
            }
            else if(specificRadioButton.isSelected())
            {
                if(!specificTextField.getText().equals("")&& CommonMethodsOne.isDouble(specificTextField.getText()))
                {
                    EncryptArrayList encrytArrayListObj = new EncryptArrayList();
                    collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("Decimal", "Specific", specificTextField.getText()));
                    this.dispose();
                    collectTestDataObj.increaseCount();
                    collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please enter a decimal number in the specific text field.");
                }
            }
            
            else if(randomBetweenRadioButton.isSelected())
            {
                
                if(!valueOneTextField.getText().equals("")&&!valueTwoTextField.getText().equals(""))
                {
                    if(CommonMethodsOne.isDouble(valueOneTextField.getText())&& CommonMethodsOne.isDouble(valueTwoTextField.getText()))
                    {
                        EncryptArrayList encrytArrayListObj = new EncryptArrayList();
                        LogicCustomDecimal logicCustomDecimalObj = new LogicCustomDecimal();
                        logicCustomDecimalObj.smallerAndBigger(valueOneTextField.getText(),valueTwoTextField.getText());
                        collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("Decimal", "BetweenTwoValue",logicCustomDecimalObj.getSmalerValue()+"-"+logicCustomDecimalObj.getBiggerValue()));
                        this.dispose();
                        collectTestDataObj.increaseCount();
                        collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Please select a decimal number in value one and two feild.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please enter a decimal number in value one and two feild.");
                }
            }
            else if(randomRadioButton.isSelected())
            {
                if(Integer.parseInt(decimalComboBox.getSelectedItem().toString())<= Integer.parseInt(lengthComboBox.getSelectedItem().toString()))
                {
                    EncryptArrayList encrytArrayListObj = new EncryptArrayList();        
                    collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("Decimal", "Random",lengthComboBox.getSelectedItem()+"-"+decimalComboBox.getSelectedItem()));
                    this.dispose();
                    collectTestDataObj.increaseCount();
                    collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Decimal point has to be less than or equal to length.");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select one of the option. Thanks");
        }
    }//GEN-LAST:event_nextButtonActionPerformed
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Close the program?")==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void mainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainButtonActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to go to main menu?")==0)
        {
            this.setVisible(false);
            ShowMethods showMethodPanel = new ShowMethods(collectTestDataObj.getParsingWsdl());
            showMethodPanel.setSize(500,500);
            showMethodPanel.setLocationRelativeTo(null);
            showMethodPanel.setDefaultCloseOperation(ShowMethods.DISPOSE_ON_CLOSE);
            showMethodPanel.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_mainButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(DecimalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DecimalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DecimalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DecimalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DecimalGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JRadioButton customRadioButton;
    private javax.swing.JComboBox decimalComboBox;
    private javax.swing.ButtonGroup groupRadioButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox lengthComboBox;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel pramLabel;
    private javax.swing.JLabel pramTypeLabel;
    private javax.swing.JRadioButton randomBetweenRadioButton;
    private javax.swing.JRadioButton randomRadioButton;
    private javax.swing.JRadioButton specificRadioButton;
    private javax.swing.JTextField specificTextField;
    private javax.swing.JTextField valueOneTextField;
    private javax.swing.JTextField valueTwoTextField;
    // End of variables declaration//GEN-END:variables
}
