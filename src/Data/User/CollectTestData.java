/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.User;

import GrahpicalUserInterface.MainGUI.*;
import Logic.WSDL.ParsingWsdl;
import java.util.logging.Level;
import java.util.logging.Logger;
import Data.WSDL.StoreWsdlData;
import Data.WSDL.StoreEnum;
import GrahpicalUserInterface.Report.CustomReportGUI;
import GrahpicalUserInterface.Report.CustomVerifyResultGUI;
import Logic.GenerateTestData.DecryptArrayList;
import Logic.WSDL.SoapRequest;
import java.io.StringReader;
import java.util.*;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 *
 * @author my301
 */
public class CollectTestData {
    
    private ArrayList<ArrayList<String>> testCaseInfo;
    private StoreWsdlData swdObj;
    private int prameterLength;
    private int count;
    private boolean checkCompleted;
    private int numTestCase;
    private StoreGeneratedValue storeGeneratedValueObj;
    private String methodName;
    private ParsingWsdl parsingWsdlObj;
    private StoreReportData storeReportDataObj;
    
    
    public CollectTestData(StoreWsdlData swdObj, int numTestCase, String methodName,ParsingWsdl parsingWsdlObj)
    {
        this.parsingWsdlObj = parsingWsdlObj;
        this.numTestCase= numTestCase;
        this.swdObj = swdObj;
        this.prameterLength =  swdObj.getElementType().size();
        this.count=0;
        this.testCaseInfo=new ArrayList<ArrayList<String>>();
        this.checkCompleted = false;
        this.methodName = methodName;
        this.storeReportDataObj = new StoreReportData(this);
        
    }
    
    public ParsingWsdl getParsingWsdl()
    {
        return this.parsingWsdlObj;
    }
    
    public void addTestCaseInfo(ArrayList<String> pram)
    {
        this.testCaseInfo.add(pram);
    }
    
    public void CollectTestCaseData(CollectTestData collectTestDataObj)
    {
        if(count < prameterLength)
        {
            Object obj = swdObj.getElementType().get(count);
            
            if(obj instanceof StoreEnum)
            {
                StoreEnum x =   (StoreEnum)obj;
                EnumGUI enumGenGuiFrame = new EnumGUI(x, collectTestDataObj);
                enumGenGuiFrame.setSize(550,500);
                enumGenGuiFrame.setLocationRelativeTo(null);
                enumGenGuiFrame.setDefaultCloseOperation(EnumGUI.DISPOSE_ON_CLOSE);
                enumGenGuiFrame.setVisible(true);
                enumGenGuiFrame.revalidate();
            }
            else if(obj instanceof String)
            {
                String tempElementType = (String)swdObj.getElementType().get(count);
                if(tempElementType.equals("int")){
                    // call intGenGUI
                    IntegerGUI intGenGUIFrame = new IntegerGUI(collectTestDataObj);
                    intGenGUIFrame.setSize(500,600);
                    intGenGUIFrame.setLocationRelativeTo(null);
                    intGenGUIFrame.setDefaultCloseOperation(IntegerGUI.DISPOSE_ON_CLOSE);
                    intGenGUIFrame.setVisible(true);
                    intGenGUIFrame.revalidate();
                }
                
                else if(tempElementType.equals("string")){
                    StringGUI stringGUIFrame = new StringGUI(collectTestDataObj);
                    stringGUIFrame.setSize(500,600);
                    stringGUIFrame.setLocationRelativeTo(null);
                    stringGUIFrame.setDefaultCloseOperation(StringGUI.DISPOSE_ON_CLOSE);
                    stringGUIFrame.setVisible(true);
                    stringGUIFrame.revalidate();
                }
                
                else if(tempElementType.equals("boolean")){
                    BooleanGUI booleanGUIFrame = new BooleanGUI(collectTestDataObj);
                    booleanGUIFrame.setSize(500,400);
                    booleanGUIFrame.setLocationRelativeTo(null);
                    booleanGUIFrame.setDefaultCloseOperation(BooleanGUI.DISPOSE_ON_CLOSE);
                    booleanGUIFrame.setVisible(true);
                    booleanGUIFrame.revalidate();
                }
                
                else if(tempElementType.equals("double")|| tempElementType.equals("float")||tempElementType.equals("decimal")){
                    DecimalGUI decimalGUIFrame = new DecimalGUI(collectTestDataObj);
                    decimalGUIFrame.setSize(500,600);
                    decimalGUIFrame.setLocationRelativeTo(null);
                    decimalGUIFrame.setDefaultCloseOperation(DecimalGUI.DISPOSE_ON_CLOSE);
                    decimalGUIFrame.setVisible(true);
                    decimalGUIFrame.revalidate();
                }
                
                else if(tempElementType.equals("date")){
                    DateGUI dateGUIFrame = new DateGUI(collectTestDataObj);
                    dateGUIFrame.setSize(500,600);
                    dateGUIFrame.setLocationRelativeTo(null);
                    dateGUIFrame.setDefaultCloseOperation(DecimalGUI.DISPOSE_ON_CLOSE);
                    dateGUIFrame.setVisible(true);
                    dateGUIFrame.revalidate();
                }
                
                else{                    
                    JOptionPane.showMessageDialog(null, "ERROR: \n Unknow dataType... "
                                                      + "\n Ref  Class: CollectTestData!!!"
                                                      + "\n Data type : "+tempElementType);
                }
            }
        }
        else{
            
            this.runTestCases(collectTestDataObj,0);
        }// else of 1st IF
    }// end method
    
    public void runTestCases(CollectTestData collectTestDataObj, int testCasePosition)
    {
        
        if(testCasePosition<this.numTestCase)
        {
            this.storeGeneratedValueObj = new StoreGeneratedValue();
            for (int i = 0; i < testCaseInfo.size(); i++)
            {
                DecryptArrayList decodeArrayList = new DecryptArrayList(swdObj,testCaseInfo.get(i),this.storeGeneratedValueObj);
                decodeArrayList.startDecoding(i);
            }// end 2nd for loop inside else case
            if(checkTestCaseRepetition(storeGeneratedValueObj , storeReportDataObj)){
                storeReportDataObj.addStoreGeneratedValue(storeGeneratedValueObj); // storing the generated data in the StoreReportData class
                
                SoapRequest soapRequestObj = new SoapRequest(storeGeneratedValueObj, collectTestDataObj,storeReportDataObj); // soap request for each generated values
                try {
                    soapRequestObj.soapConnectionRequest();
                    
                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    InputSource is = new InputSource(new StringReader(storeReportDataObj.getOutPutResponse().get(testCasePosition)));
                    Document doc = dBuilder.parse(is);
                    doc.getDocumentElement().normalize();
                    
                    CustomVerifyResultGUI CustomVerifyResultGUIFrame = new CustomVerifyResultGUI(storeReportDataObj,1,testCasePosition,doc);
                    CustomVerifyResultGUIFrame.setSize(550,670);
                    CustomVerifyResultGUIFrame.setLocationRelativeTo(null);
                    CustomVerifyResultGUIFrame.setDefaultCloseOperation(CustomVerifyResultGUI.DISPOSE_ON_CLOSE);
                    CustomVerifyResultGUIFrame.setVisible(true);
                    CustomVerifyResultGUIFrame.revalidate();
                    
                } catch (Exception ex) {
                    Logger.getLogger(CollectTestData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                numTestCase--;
                runTestCases(collectTestDataObj, testCasePosition);
            }
        }// end 1st if statement
        else{
            CustomReportGUI customReportGUIFrame = new CustomReportGUI(storeReportDataObj);
            customReportGUIFrame.setSize(1000,800);
            customReportGUIFrame.setLocationRelativeTo(null);
            customReportGUIFrame.setDefaultCloseOperation(CustomReportGUI.DISPOSE_ON_CLOSE);
            customReportGUIFrame.setVisible(true);
            customReportGUIFrame.revalidate();
        }
    }
    
    private boolean checkTestCaseRepetition(StoreGeneratedValue storeGeneratedValueObj, StoreReportData storeReportDataObj)
    {
        for (int i = 0; i < storeReportDataObj.getStoreGeneratedValue().size(); i++)
        {
            int x = 0;
            for (int j = 0; j < this.storeGeneratedValueObj.getGeneratedValueList().size(); j++) {
                if(this.storeGeneratedValueObj.getGeneratedValueList().get(j).equals(storeReportDataObj.getStoreGeneratedValue().get(i).getGeneratedValueList().get(j)))
                {
                    x=  x+1;
                }
            }
            if(x==this.storeGeneratedValueObj.getGeneratedValueList().size())
            {
                return false;
            }
        }
        return true;
    }
    
    
    
    public StoreWsdlData getStoreWsdlData(){
        return swdObj;
    }
    
    public int getCount(){
        return count;
    }
    
    public void increaseCount(){
        count++;
    }
    
    public ArrayList<ArrayList<String>> getCollectTestDataArrayList(){
        return testCaseInfo;
    }
    
    public boolean getCheckCompleted(){
        return checkCompleted;
    }

    public String getMethodName() {
        return methodName;
    }
    
}// end class
