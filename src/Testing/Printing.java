/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author my301
 */
public class Printing {
    
    public static void main(String[] args) {
        
        // wsdlInput.setText("http://www.thomas-bayer.com/axis2/services/BLZService?wsdl");
     
        
        String [] a = {"http://www.webservicex.net/usaddressverification.asmx?WSDL","http://www.webservicex.net/stockquote.asmx?WSDL","http://www.webservicex.net/GenericNAICS.asmx?WSDL","http://www.webservicex.net/FedACH.asmx?WSDL","http://www.webservicex.net/MortgageIndex.asmx?WSDL","http://www.webservicex.net/sunsetriseservice.asmx?WSDL","http://www.webservicex.net/FedWire.asmx?WSDL","http://www.webservicex.net/medicareSupplier.asmx?WSDL","http://www.webservicex.net/RealTimeMarketData.asmx?WSDL"," http://www.webservicex.net/LondonGoldFix.asmx?WSDL"," http://www.webservicex.net/Statistics.asmx?WSDL"," http://www.webservicex.net/FinanceService.asmx?WSDL"," http://www.webservicex.net/BibleWebservice.asmx?WSDL"};

         for (int i = 0; i < a.length; i++) {
             System.out.println("//      "+"wsdlInput.setText(\""+a[i]+"\");");
            
        }
    }
    
}
