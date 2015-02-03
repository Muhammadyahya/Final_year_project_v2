/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package GrahpicalUserInterface.MainGUI;

import Logic.CommonMethodsOne;
import Data.User.CollectTestData;
import Data.WSDL.StoreEnum;
import Data.WSDL.StoreWsdlData;
import Logic.ParsingWsdl;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author my301
 */
public class ShowMethods extends javax.swing.JFrame {
    
    /**
     * Creates new form ShowMethods
     */
    
    private ParsingWsdl parsingWsdlObj;
    
    public ShowMethods() {
        initComponents();
    }
    
    public ShowMethods(ParsingWsdl parsingWsdlObj) {
        initComponents();
        this.parsingWsdlObj = parsingWsdlObj;
        displayWsdlData();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        testButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        noteLable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        methodjTree = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Automated Test Case Generator");

        testButton.setText("Test");
        testButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        noteLable.setForeground(new java.awt.Color(204, 0, 0));
        noteLable.setText("Note:");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        methodjTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(methodjTree);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(noteLable)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(testButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(testButton)))
                .addGap(31, 31, 31)
                .addComponent(noteLable)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(backButton))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Close the program?")==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        WelcomePage welcomePageFrame = new WelcomePage();
        welcomePageFrame.setSize(550,300);
        welcomePageFrame.setLocationRelativeTo(null);
        welcomePageFrame.setDefaultCloseOperation(WelcomePage.DISPOSE_ON_CLOSE);
        welcomePageFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed
    
    
    /*
    *  This method checks if the user has selected correct method from the jtree.
    *  Also it checks if the user has entered an Int in the dialog box for number of test cases.
    *  Number of test case value has to be greater than 0.
    */    
    
    @SuppressWarnings("empty-statement")
    private void testButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButtonActionPerformed
        // TODO add your handling code here:
        
        noteLable.setText("Note:");
        StoreWsdlData swdObj = null;
        String selectedMethod;
        if(methodjTree.getSelectionCount()!= 0 )
        {
            selectedMethod  =  methodjTree.getSelectionPath().getLastPathComponent().toString();
            if(selectedMethod.charAt(0)=='r'){
                noteLable.setText("Note: Please select a valid method.");
            }
            else{
                selectedMethod = selectedMethod.substring(14,selectedMethod.length());
            }
            boolean check = false;
            
            
            for(StoreWsdlData swd :parsingWsdlObj.getWsdlData()){
                if(swd.getMethodName().equals(selectedMethod)){
                    swdObj = swd;
                    check = true;
                }
                if(check){
                    break;
                }
            }
            
            if(!check){
                JOptionPane.showMessageDialog(null,"Please select a valid method");
            }
            else{
                String input = JOptionPane.showInputDialog(null,"Please enter a number of Test Cases");
                
                if(CommonMethodsOne.isInt(input)){
                    int numTestCase = Integer.parseInt(input);
                    if(numTestCase <=0){
                        JOptionPane.showMessageDialog(null,"Please enter an interger value greater than 0.");
                    }
                    else{
                        this.dispose();
                        CollectTestData collectTestDataObj = new CollectTestData(swdObj,numTestCase,selectedMethod);
                        collectTestDataObj.CollectTestCaseData(collectTestDataObj);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please enter an interger( e.g 1 , 22 ).");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a method");
        }
    }//GEN-LAST:event_testButtonActionPerformed
    
    private void displayWsdlData()
    {
        //create the root node
        DefaultTreeModel model = (DefaultTreeModel) methodjTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        //create the child node
        DefaultMutableTreeNode methodNode;
        //create the an other child node
        DefaultMutableTreeNode enumNode;
        
        for(StoreWsdlData swd :parsingWsdlObj.getWsdlData() )
        {
            methodNode = new DefaultMutableTreeNode("Method Name : " + swd.getMethodName());
            int i =0;
            for(Object x: swd.getElmentType()){
                
                if(x instanceof StoreEnum)
                {
                    StoreEnum temp = (StoreEnum)x;
                    // i will need this if i do the type for enum values.
                    int tempPosistion=0;
                    enumNode = new DefaultMutableTreeNode("  -Data Name : "+temp.getResElementName());
                    for(String storeEnumObj: temp.getEnumValue())
                    {
                        enumNode.add(new DefaultMutableTreeNode("  ---- Enum values :  "+storeEnumObj));
                    }
                    methodNode.add(enumNode);
                }
                else{
                    methodNode.add(new DefaultMutableTreeNode("  -Data Name : "+swd.getElmentName().get(i)+"   Datatype :  "+x));
                }
                i++;
            }
            root.add(methodNode);
        }
        model.reload(root);
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
            java.util.logging.Logger.getLogger(ShowMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowMethods().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree methodjTree;
    private javax.swing.JLabel noteLable;
    private javax.swing.JButton testButton;
    // End of variables declaration//GEN-END:variables
}