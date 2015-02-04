/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrahpicalUserInterface.MainGUI;

import Data.User.CollectTestData;
import Logic.CommonMethodsOne;
import Logic.GenerateTestData.EncryptArrayList;
import Logic.UserInterface.LogicCustomInt;
import Logic.UserInterface.LogicDate;
import javax.swing.JOptionPane;

/**
 *
 * @author my301
 */
public class DateGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form IntGenGUI
     */
    private CollectTestData collectTestDataObj;
    private boolean countChecked;
    
    public DateGUI() {
        initComponents();
        this.radioButton();
    }
    
    public DateGUI(CollectTestData obj) {
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
        dateTwoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pramTypeLabel = new javax.swing.JLabel();
        formatComboBox1 = new javax.swing.JComboBox();
        formatComboBox3 = new javax.swing.JComboBox();
        formatComboBox2 = new javax.swing.JComboBox();
        sepratorComboBox = new javax.swing.JComboBox();
        dateOneTextField = new javax.swing.JTextField();
        specificTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLabel.setText("TEST DATA GENERATOR");

        pramNameLabel.setText("Parameter Name :");

        randomRadioButton.setText("Random Date");

        specificRadioButton.setText("Specific Date");

        randomBetweenRadioButton.setText("Random Date between two dates");

        jLabel1.setText("Date One");

        jLabel2.setText("Date Two");

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

        jLabel3.setText("Format");

        pramTypeLabel.setText("Parameter Type :");

        formatComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "yy", "yyyy", "m", "mm", "mmm", "mmmm", "d", "dd" }));

        formatComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "yy", "yyyy", "m", "mm", "mmm", "mmmm", "d", "dd" }));

        formatComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "yy", "yyyy", "m", "mm", "mmm", "mmmm", "d", "dd" }));

        sepratorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "/", ".", "-", "spaces" }));

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
                        .addComponent(headerLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(noteLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(specificRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(specificTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pramNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                        .addComponent(pramTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(163, 163, 163))
                            .addComponent(randomBetweenRadioButton))
                        .addComponent(customRadioButton))
                    .addComponent(randomRadioButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateTwoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(formatComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formatComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formatComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateOneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sepratorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(headerLabel)
                .addGap(21, 21, 21)
                .addComponent(pramNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pramTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(randomRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specificRadioButton)
                    .addComponent(specificTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(randomBetweenRadioButton)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTwoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sepratorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(customRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(noteLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(closeButton)
                    .addComponent(mainButton))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
        if(randomRadioButton.isSelected()||specificRadioButton.isSelected()||randomBetweenRadioButton.isSelected()||customRadioButton.isSelected())
        {
            if(!formatComboBox1.getSelectedItem().equals("")&&!formatComboBox2.getSelectedItem().equals("")&&!formatComboBox3.getSelectedItem().equals("")&&!sepratorComboBox.getSelectedItem().equals(""))
            {
                LogicDate obj = new LogicDate();
                String format;
                if(obj.checkFormat(formatComboBox1.getSelectedItem().toString(),formatComboBox2.getSelectedItem().toString(),formatComboBox3.getSelectedItem().toString(), sepratorComboBox.getSelectedItem().toString()))
                {
                    if(sepratorComboBox.getSelectedItem().equals("spaces")){
                        format = formatComboBox1.getSelectedItem().toString() +" "+formatComboBox2.getSelectedItem().toString()+" "+formatComboBox3.getSelectedItem().toString();
                        JOptionPane.showMessageDialog(null,"The date format will be "+ format);
                    }
                    else{
                        format = formatComboBox1.getSelectedItem().toString() +sepratorComboBox.getSelectedItem().toString()+formatComboBox2.getSelectedItem().toString()+sepratorComboBox.getSelectedItem().toString()+formatComboBox3.getSelectedItem().toString();
                        JOptionPane.showMessageDialog(null,"The date format will be "+ format);
                    }
                    if(customRadioButton.isSelected())
                    {
                        /*
                         * 
                         * this is the only one not done yet
                         * 
                         */
                        this.dispose();
                        CustomDateGUI customDateGuiFrame =  new CustomDateGUI(collectTestDataObj,0);
                        customDateGuiFrame.setSize(550,550);
                        customDateGuiFrame.setLocationRelativeTo(null);
                        customDateGuiFrame.setDefaultCloseOperation(DateGUI.DISPOSE_ON_CLOSE);
                        customDateGuiFrame.setVisible(true);
                        customDateGuiFrame.revalidate();
                    }
                    else if(specificRadioButton.isSelected())
                    {
                        if(!specificTextField.getText().equals(""))
                        {
                            if(obj.checkDate(specificTextField.getText()))
                            {
                                EncryptArrayList encrytArrayListObj = new EncryptArrayList();
                                collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("Date", "Specific", specificTextField.getText()));
                                this.dispose();
                                collectTestDataObj.increaseCount();
                                collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"InputDate in specific text field is wrong.");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Please enter a date in the specific text field.");
                        }
                    }
                    
                    else if(randomBetweenRadioButton.isSelected())
                    {
                        if(!dateOneTextField.equals("")&&!dateTwoTextField.equals(""))
                        {
                            if(obj.checkDate(dateOneTextField.getText())&& obj.checkDate(dateTwoTextField.getText()))
                            {
                                
                                String result = obj.compareDate(dateOneTextField.getText(),dateTwoTextField.getText(),format);
                                String dateOne;
                                String dateTwo;
                                switch (result) {
                                    case "DateOne":
                                        dateOne  = dateOneTextField.getText();
                                        dateTwo = dateTwoTextField.getText();
                                        break;
                                    case "DateTwo":
                                        dateOne = dateTwoTextField.getText();
                                        dateTwo = dateOneTextField.getText();
                                        break;
                                    default:
                                        dateOne  = dateOneTextField.getText();
                                        dateTwo = dateTwoTextField.getText();
                                        break;
                                }
                                EncryptArrayList encrytArrayListObj = new EncryptArrayList();
                                collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("Date", "BetweenTwoValue",sepratorComboBox.getSelectedItem()+"&"+format+"&"+dateOne+"&"+dateTwo));
                                this.dispose();
                                collectTestDataObj.increaseCount();
                                collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"InputDate in textfield one or textfield two is wrong.");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Please enter date one and date two.");
                        }
                    }
                    else if(randomRadioButton.isSelected()){
                        
                        EncryptArrayList encrytArrayListObj = new EncryptArrayList();
                        collectTestDataObj.addTestCaseInfo(encrytArrayListObj.startEncrypt("Date", "Random",sepratorComboBox.getSelectedItem()+"&"+format));
                        this.dispose();
                        collectTestDataObj.increaseCount();
                        collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Date format is wrong.");
                }// 3rd if else for checking format
            }
            else{
                JOptionPane.showMessageDialog(null,"Please enter date format.");
            }// 2nd if else
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select one of the option. Thanks");
        }// 1st if else
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
            java.util.logging.Logger.getLogger(DateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DateGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JRadioButton customRadioButton;
    private javax.swing.JTextField dateOneTextField;
    private javax.swing.JTextField dateTwoTextField;
    private javax.swing.JComboBox formatComboBox1;
    private javax.swing.JComboBox formatComboBox2;
    private javax.swing.JComboBox formatComboBox3;
    private javax.swing.ButtonGroup groupRadioButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel pramNameLabel;
    private javax.swing.JLabel pramTypeLabel;
    private javax.swing.JRadioButton randomBetweenRadioButton;
    private javax.swing.JRadioButton randomRadioButton;
    private javax.swing.JComboBox sepratorComboBox;
    private javax.swing.JRadioButton specificRadioButton;
    private javax.swing.JTextField specificTextField;
    // End of variables declaration//GEN-END:variables
}
