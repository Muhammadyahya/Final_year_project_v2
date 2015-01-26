/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrahpicalUserInterface.MainGUI;

import Data.User.CollectTestData;
import Logic.Common;
import Logic.GenerateTestData.EncryptArrayList;
import Logic.UserInterface.LogicCustomInt;
import javax.swing.JOptionPane;

/**
 *
 * @author my301
 */
public class StringGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form IntGenGUI
     */
    private CollectTestData collectTestDataObj;
    private boolean countChecked;
    
    public StringGUI() {
        initComponents();
        this.radioButton();
    }
    
    public StringGUI(CollectTestData obj) {
        initComponents();
        this.collectTestDataObj = obj;
        this.radioButton();
        this.countChecked = false;
        pramNameLabel.setText("Parameter Name : "+ collectTestDataObj.getStoreWsdlData().getElmentName().get(collectTestDataObj.getCount()));     
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
        pramNameLabel = new javax.swing.JLabel();
        randomRadioButton = new javax.swing.JRadioButton();
        specificRadioButton = new javax.swing.JRadioButton();
        randomBetweenRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
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
        alphaTwoComboBox = new javax.swing.JComboBox();
        alphaOneComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLabel.setText("TEST DATA GENERATOR");

        pramNameLabel.setText("Parameter Name :");

        randomRadioButton.setText("Random String");

        specificRadioButton.setText("Specific String");

        randomBetweenRadioButton.setText("Random String between two alphabets");

        jLabel1.setText("Alphabet One");

        jLabel2.setText("Alphabet Two");

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

        customRadioButton.setText("Custom ( More Options )");

        jLabel3.setText("E.g length 5 (abcde or eadfd etc).");

        lengthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        pramTypeLabel.setText("Parameter Type :");

        alphaTwoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }));
        alphaTwoComboBox.setToolTipText("");

        alphaOneComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }));
        alphaOneComboBox.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(randomBetweenRadioButton)
                    .addComponent(randomRadioButton)
                    .addComponent(customRadioButton)
                    .addComponent(noteLabel)
                    .addComponent(specificRadioButton)
                    .addComponent(pramNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addComponent(pramTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(specificTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lengthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alphaTwoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alphaOneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(headerLabel)
                .addGap(27, 27, 27)
                .addComponent(pramNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pramTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(randomRadioButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specificRadioButton)
                    .addComponent(specificTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(randomBetweenRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alphaOneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alphaTwoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noteLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(closeButton)
                    .addComponent(mainButton))
                .addContainerGap(73, Short.MAX_VALUE))
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
                CustomStringGUI customStringGuiFrame =  new CustomStringGUI(collectTestDataObj,0);
                customStringGuiFrame.setSize(550,550);
                customStringGuiFrame.setLocationRelativeTo(null);
                customStringGuiFrame.setDefaultCloseOperation(StringGUI.DISPOSE_ON_CLOSE);
                customStringGuiFrame.setVisible(true);
                customStringGuiFrame.revalidate();
            }
            else if(specificRadioButton.isSelected())
            {
                if(!specificTextField.getText().equals(""))
                {
                    // below line store and concatenate the String 
                    //collectTestDataObj.addTestCaseInfo(Common.addToArray(Common.concatenateString(specificTextField.getText())));
                    EncryptArrayList encrytArrayListObj = new EncryptArrayList();        
                    collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("String", "Specific", specificTextField.getText()));                    
                    this.dispose();
                    collectTestDataObj.increaseCount();                    
                    collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please enter a String in the specific text field.");
                }
            }
            else if(randomBetweenRadioButton.isSelected())
            {   
                if(!alphaOneComboBox.getSelectedItem().equals("Please Select")&&!alphaTwoComboBox.getSelectedItem().equals("Please Select")&&!lengthComboBox.getSelectedItem().equals("0"))
                {   
                    // below code store user value in the arraylist and increase the count 
                    EncryptArrayList encrytArrayListObj = new EncryptArrayList();
                    collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("String", "BetweenTwoValue",lengthComboBox.getSelectedItem()+"-"+Common.smallerChar(alphaOneComboBox.getSelectedItem(),alphaTwoComboBox.getSelectedItem())+"-"+Common.biggerChar(alphaOneComboBox.getSelectedItem(),alphaTwoComboBox.getSelectedItem())));
                    this.dispose();
                    collectTestDataObj.increaseCount();                    
                    collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please select Alphabet One, Alphabet Two and Length.");
                }
            }
            else if(randomRadioButton.isSelected())
            {
                if(!lengthComboBox.getSelectedItem().equals("0"))
                {
                    EncryptArrayList encrytArrayListObj = new EncryptArrayList();        
                    collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("String", "Random",""+lengthComboBox.getSelectedItem()));  
                    this.dispose();
                    collectTestDataObj.increaseCount();                    
                    collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                 }
                else{
                    JOptionPane.showMessageDialog(null,"Please select a length.");
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
            java.util.logging.Logger.getLogger(StringGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox alphaOneComboBox;
    private javax.swing.JComboBox alphaTwoComboBox;
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
    private javax.swing.JLabel pramNameLabel;
    private javax.swing.JLabel pramTypeLabel;
    private javax.swing.JRadioButton randomBetweenRadioButton;
    private javax.swing.JRadioButton randomRadioButton;
    private javax.swing.JRadioButton specificRadioButton;
    private javax.swing.JTextField specificTextField;
    // End of variables declaration//GEN-END:variables
}
