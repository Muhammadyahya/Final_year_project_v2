/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrahpicalUserInterface.MainGUI;

/**
 *
 * @author my301
 */

import Logic.WSDL.CheckWsdl;
import Logic.WSDL.ParsingWsdl;
import javax.swing.JOptionPane;

public class WelcomePage extends javax.swing.JFrame {
    
    /**
     * Creates new form WelcomePage
     */
    public WelcomePage() {
        initComponents();
        checkMethodButton.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        wsdlInput = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        noteLabel = new javax.swing.JLabel();
        checkMethodButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Automated Test Case Generator");

        jLabel2.setText("Input Wsdl");

        okButton.setText("Validate");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        noteLabel.setForeground(new java.awt.Color(204, 0, 0));

        checkMethodButton.setText("Check Methods");
        checkMethodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMethodButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noteLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wsdlInput, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkMethodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wsdlInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(checkMethodButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(exitButton))
                .addGap(28, 28, 28)
                .addComponent(noteLabel)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        
        /*
         * Below are different wsdl for testing
         */
        
        //
        //      http://www.webservicex.net/genericbarcode.asmx?WSDL
        //      http://www.webservicex.net/sendsmsworld.asmx?WSDL
        //      http://www.thomas-bayer.com/axis2/services/BLZService?wsdl
        //      http://trial.serviceobjects.com/gp/GeoPhone.asmx?wsdl
        //      http://www.webservicex.net/WeatherForecast.asmx?WSDL
        //      wsdlInput.setText("http://www.webservicex.net/geoipservice.asmx?WSDL");
        //        wsdlInput.setText("http://ws.cdyne.com/emailverify/Emailvernotestemail.asmx?WSDL");
        //      wsdlInput.setText("http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/sendsmsworld.asmx?WSDL");
        //      wsdlInput.setText("http://developer.ebay.com/webservices/latest/ebaysvc.wsdl"); // not wotking
        //      wsdlInput.setText("http://www.thomas-bayer.com/axis2/services/BLZService?wsdl");
//              wsdlInput.setText("http://www.webservicex.net/usaddressverification.asmx?WSDL");
//              wsdlInput.setText("http://www.webservicex.net/stockquote.asmx?WSDL");
//              wsdlInput.setText("http://www.webservicex.net/GenericNAICS.asmx?WSDL");
//              wsdlInput.setText("http://www.webservicex.net/FedACH.asmx?WSDL");
              wsdlInput.setText("http://www.webservicex.net/MortgageIndex.asmx?WSDL"); // for int testing
        //      wsdlInput.setText("http://www.webservicex.net/sunsetriseservice.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/FedWire.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/medicareSupplier.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/RealTimeMarketData.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/LondonGoldFix.asmx?WSDL");
              wsdlInput.setText("http://www.webservicex.net/Statistics.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/FinanceService.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/BibleWebservice.asmx?WSDL"); // not working
        //      wsdlInput.setText("http://webservices.amazon.com/AWSECommerceService/AWSECommerceService.wsdl");
        //      wsdlInput.setText("http://www.webservicex.net/TranslateService.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/ConvertComputer.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/Astronomical.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/ConverPower.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/ConvertAngle.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/RssToHTML.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/uklocation.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/periodictable.asmx?WSDL");
        //      wsdlInput.setText("http://www.webservicex.net/country.asmx?WSDL");
        
        
        /* for laptop */
        //      wsdlInput.setText("C:\\Users\\Muhammad Yahya\\Documents\\NetBeansProjects\\wsdl\\genericbarcode.wsdl");
        
        /* for ITL */
        //      wsdlInput.setText("/homes/my301/year3/Project/other/genericbarcode.wsdl");
        //      wsdlInput.setText("/homes/my301/year3/Project/other/sendsmsworld.wsdl");
        //      wsdlInput.setText("/homes/my301/year3/Project/other/article.wsdl");
        

        CheckWsdl checkWsdlObj =  new CheckWsdl();
        ParsingWsdl parsingWsdlObj =  new ParsingWsdl();
        if(wsdlInput.getText().equals("")){
            noteLabel.setText("Note: "+checkWsdlObj.getMessage());
            checkMethodButton.setEnabled(false);
        }//end if
        else
        {
            if(checkWsdlObj.checkWSDLAvailable(wsdlInput.getText())){
                parsingWsdlObj.parseWsdl(wsdlInput.getText());
                noteLabel.setText("Note: "+checkWsdlObj.getMessage());
                checkMethodButton.setEnabled(true);
            }
            else{
                noteLabel.setText("Note: "+checkWsdlObj.getMessage());
                checkMethodButton.setEnabled(false);
            }
        }// end else
        // end method   
    }//GEN-LAST:event_okButtonActionPerformed
    
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        /*
         * this method clear the text in the wsld input textfeild
         */
        wsdlInput.setText("");
        checkMethodButton.setEnabled(false);
    }//GEN-LAST:event_clearButtonActionPerformed
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        /*
         * closes the program
         */
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Close the program?")==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed
    
    private void checkMethodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMethodButtonActionPerformed
        
        /*
         * This method checks if the if the wsdl is correct or not...
         * If wsdl is correct if opens new window in which it shows all the methods
         */
        
        /*
         * checking if the wsdl is correct
         */
        CheckWsdl checkWsdlObj =  new CheckWsdl();
        ParsingWsdl parsingWsdlObj =  new ParsingWsdl();
        if(wsdlInput.getText().equals("")){
            noteLabel.setText("Note: "+checkWsdlObj.getMessage());
            checkMethodButton.setEnabled(false);
        }
        else{
            if(checkWsdlObj.checkWSDLAvailable(wsdlInput.getText()))
            {
                parsingWsdlObj.parseWsdl(wsdlInput.getText());
                noteLabel.setText("Note: "+checkWsdlObj.getMessage());
                checkMethodButton.setEnabled(true);
                
                /*
                 * calling Show Method Class
                 */
                this.setVisible(false);
                ShowMethods showMethodPanel = new ShowMethods(parsingWsdlObj);
                showMethodPanel.setSize(500,500);
                showMethodPanel.setLocationRelativeTo(null);
                showMethodPanel.setDefaultCloseOperation(ShowMethods.DISPOSE_ON_CLOSE);
                showMethodPanel.setVisible(true);
                this.dispose();
            }
            else{
                noteLabel.setText("Note: "+checkWsdlObj.getMessage());
                checkMethodButton.setEnabled(false);
            }
        }        
    }//GEN-LAST:event_checkMethodButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkMethodButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField wsdlInput;
    // End of variables declaration//GEN-END:variables
}
