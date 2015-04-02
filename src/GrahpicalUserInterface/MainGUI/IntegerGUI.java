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
public class IntegerGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form IntegerGUI
     */
    private CollectTestData collectTestDataObj;
    
    public IntegerGUI() {
        initComponents();
        this.radioButton();
    }
    
    public IntegerGUI(CollectTestData obj) {
        initComponents();
        this.collectTestDataObj = obj;
        this.radioButton();
        pramLabel.setText("Parameter Name : "+ collectTestDataObj.getStoreWsdlData().getElementName().get(collectTestDataObj.getCount()));
        pramTypeLabel.setText("Parameter Type : "+ collectTestDataObj.getStoreWsdlData().getElementType().get(collectTestDataObj.getCount()));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLabel.setText("TEST DATA GENERATOR");

        pramLabel.setText("Parameter Name :");

        randomRadioButton.setText("Random Number");
        randomRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomRadioButtonActionPerformed(evt);
            }
        });

        specificRadioButton.setText("Specific Number");
        specificRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specificRadioButtonActionPerformed(evt);
            }
        });

        randomBetweenRadioButton.setText("Random Number between two numbers");
        randomBetweenRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomBetweenRadioButtonActionPerformed(evt);
            }
        });

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

        lengthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        pramTypeLabel.setText("Parameter Type :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(randomBetweenRadioButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(randomRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(lengthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(specificRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(specificTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(customRadioButton)
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
                                        .addComponent(valueTwoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pramTypeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pramLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(mainButton)
                                .addGap(39, 39, 39)
                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(headerLabel)))
                        .addGap(0, 98, Short.MAX_VALUE)))
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
                .addComponent(customRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(noteLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(closeButton)
                    .addComponent(mainButton))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
        if(randomRadioButton.isSelected()||specificRadioButton.isSelected()||randomBetweenRadioButton.isSelected()||customRadioButton.isSelected()){
            
            if(specificRadioButton.isSelected())
            {
                if(!specificTextField.getText().equals("")&& specificTextField.getText().length() <10)
                {
                    // below line store and concatenate the String
                    if(CommonMethodsOne.isInt(specificTextField.getText()))
                    {
                        EncryptArrayList encrytArrayListObj = new EncryptArrayList();
                        // delete this once below line is working collectTestDataObj.addTestCaseInfo(CommonMethodsOne.addToArray(CommonMethodsOne.concatenateString(specificTextField.getText())));
                        collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("Int", "Specific", specificTextField.getText()));
                        
                        this.dispose();
                        collectTestDataObj.increaseCount();
                        collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Please enter a number in the specific text field.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please enter a number in the specific text field.\n\nNumber length has to be less than 10.");
                }
            }
            
            else if(customRadioButton.isSelected())
            {
                // go the custom int GUI
                this.dispose();
                CustomIntGUI customIntGuiFrame = new CustomIntGUI(collectTestDataObj,1);
                customIntGuiFrame.setSize(550,550);
                customIntGuiFrame.setLocationRelativeTo(null);
                customIntGuiFrame.setDefaultCloseOperation(IntegerGUI.DISPOSE_ON_CLOSE);
                customIntGuiFrame.setVisible(true);
                customIntGuiFrame.revalidate();
            }
            
            
            else if(randomBetweenRadioButton.isSelected())
            {
                
                if(!valueOneTextField.getText().equals("")&&!valueTwoTextField.getText().equals("")&& valueOneTextField.getText().length() <10 && valueTwoTextField.getText().length() <10)
                {
                    if(CommonMethodsOne.isInt(valueOneTextField.getText())&& CommonMethodsOne.isInt(valueTwoTextField.getText()))
                    {
                        EncryptArrayList encrytArrayListObj = new EncryptArrayList();
                        LogicCustomInt logicCustomIntObj = new LogicCustomInt();
                        logicCustomIntObj.smallerAndBigger(valueOneTextField.getText(),valueTwoTextField.getText());
                        collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("Int", "BetweenTwoValue",logicCustomIntObj.getSmalerValue()+"-"+logicCustomIntObj.getBiggerValue()));
                        this.dispose();
                        collectTestDataObj.increaseCount();
                        collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Please enter a number in value one and two field.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please enter a number in value one and two field.\n\nNumber length has to be less than 10.");
                }
            }            
            else if(randomRadioButton.isSelected())
            {
                EncryptArrayList encrytArrayListObj = new EncryptArrayList();
                collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("Int", "Random",lengthComboBox.getSelectedItem().toString()));
                this.dispose();
                collectTestDataObj.increaseCount();
                collectTestDataObj.CollectTestCaseData(collectTestDataObj);
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

    private void randomRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomRadioButtonActionPerformed
        // TODO add your handling code here:
        valueOneTextField.setText("");
        valueTwoTextField.setText("");
        specificTextField.setText("");
    }//GEN-LAST:event_randomRadioButtonActionPerformed

    private void specificRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specificRadioButtonActionPerformed
        // TODO add your handling code here:
        valueOneTextField.setText("");
        valueTwoTextField.setText("");
        lengthComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_specificRadioButtonActionPerformed

    private void randomBetweenRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomBetweenRadioButtonActionPerformed
        // TODO add your handling code here:
        specificTextField.setText("");
        lengthComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_randomBetweenRadioButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(IntegerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntegerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntegerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntegerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntegerGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JRadioButton customRadioButton;
    private javax.swing.ButtonGroup groupRadioButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
