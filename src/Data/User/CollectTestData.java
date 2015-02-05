/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.User;

import GrahpicalUserInterface.MainGUI.*;;
import Data.WSDL.StoreWsdlData;
import Data.WSDL.StoreEnum;
import GrahpicalUserInterface.Report.CustomReportGUI;
import Logic.GenerateTestData.DecryptArrayList;
import Logic.WSDL.SoapRequest;
import aDeleteME.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
    private String tagName;
    private String tagValue;
    private String methodName;
    
    
    public CollectTestData(StoreWsdlData swdObj, int numTestCase, String methodName)
    {
        this.numTestCase= numTestCase;
        this.swdObj = swdObj;
        this.prameterLength =  swdObj.getElmentType().size();
        this.count=0;
        this.testCaseInfo=new ArrayList<ArrayList<String>>();
        this.checkCompleted = false;
        this.methodName = methodName;
        
    }
    
    public void addTestCaseInfo(ArrayList<String> pram)
    {
        this.testCaseInfo.add(pram);
    }
    
    public void CollectTestCaseData(CollectTestData collectTestDataObj)
    {
        if(count < prameterLength)
        {
            Object obj = swdObj.getElmentType().get(count);
            
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
                String tempElementType = (String)swdObj.getElmentType().get(count);
                if(tempElementType.equals("int")|| tempElementType.equals("float")||tempElementType.equals("decimal")){
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
                    stringGUIFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    stringGUIFrame.setVisible(true);
                    stringGUIFrame.revalidate();
                }
                
                else if(tempElementType.equals("boolean")){
                    BooleanGUI booleanGUIFrame = new BooleanGUI(collectTestDataObj);
                    booleanGUIFrame.setSize(500,400);
                    booleanGUIFrame.setLocationRelativeTo(null);
                    booleanGUIFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    booleanGUIFrame.setVisible(true);
                    booleanGUIFrame.revalidate();
                }
                
                else{
                    
                    JOptionPane.showMessageDialog(null, "Unknow dataType... Class: TestDataGen!");
                    TestFrame testFrame = new TestFrame(collectTestDataObj);
                    testFrame.setSize(550,500);
                    testFrame.setLocationRelativeTo(null);
                    testFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    testFrame.setVisible(true);
                    testFrame.revalidate();
                }
            }
        }
        else{
            VerifyResultGUI verifyResultGUIFrame = new VerifyResultGUI(collectTestDataObj);
            verifyResultGUIFrame.setSize(450,450);
            verifyResultGUIFrame.setLocationRelativeTo(null);
            verifyResultGUIFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
            verifyResultGUIFrame.setVisible(true);
            verifyResultGUIFrame.revalidate();
            
        }// else of 1st IF
    }// end method
    
    public void runTestCases(CollectTestData collectTestDataObj)
    {
        
        
        StoreReportData storeReportDataObj = new StoreReportData(collectTestDataObj);
        
        for (int a = 0; a < numTestCase; a++)
        {
            this.storeGeneratedValueObj = new StoreGeneratedValue();
            for (int i = 0; i < testCaseInfo.size(); i++)
            {
                DecryptArrayList decodeArrayList = new DecryptArrayList(swdObj,testCaseInfo.get(i),this.storeGeneratedValueObj);
                decodeArrayList.startDecoding(i);
            }// end 2nd for loop inside else case
            
            storeReportDataObj.addStoreGeneratedValue(storeGeneratedValueObj);
            
            SoapRequest soapRequestObj = new SoapRequest(storeGeneratedValueObj, collectTestDataObj,storeReportDataObj);
            try {
                soapRequestObj.soapConnectionRequest();
            } catch (Exception ex) {
                Logger.getLogger(CollectTestData.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }// end 1st for loop inside else
        
        
            CustomReportGUI customReportGUIFrame = new CustomReportGUI(storeReportDataObj);
            customReportGUIFrame.setSize(1000,800);
            customReportGUIFrame.setLocationRelativeTo(null);
            customReportGUIFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
            customReportGUIFrame.setVisible(true);
            customReportGUIFrame.revalidate();
        
        /* for testing purpose */
       /*
        * for (int i = 0; i < numTestCase; i++) {
            
            System.out.println("--------------------------------------------------------------");
            System.out.println("");
            System.out.println("");
            
                ArrayList<String> m = this.storeGeneratedValueObj.getParameterNameList();
                ArrayList<String> v = this.storeGeneratedValueObj.getGeneratedValueList();
                
                System.out.println("");
                for (int x = 0; x < m.size(); x++) {
                    
                    System.out.println("PrameterName : " +m.get(x) + "  Value is : "+ v.get(x));
                }
                System.out.println("");
                System.out.println("**** Input Request ****");
                System.out.println(storeReportDataObj.getInputData().get(i));
                System.out.println("");
                
                System.out.println("");
                System.out.println("**** OutPut Response ****");
                //System.out.println(storeReportDataObj.getOutPutResponse().get(i));
                
                System.out.println(new xmlFormatter().format(storeReportDataObj.getOutPutResponse().get(i)));
                System.out.println("");
            
            System.out.println("");
            System.out.println("");
            System.out.println("--------------------------------------------------------------");
            System.out.println("");
            System.out.println("");

               }/* end of testing */
        
        
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
    
    public void addTagName(String pram){
        this.tagName = pram;
    }
    
    public void addTagValue(String pram){
        this.tagValue = pram;
    }
    
    public String getTagValue(){
        return tagValue;
    }
    
    public String getTagName(){
        return tagName;
    }
    
    public String getMethodName() {
        return methodName;
    }
    
}// end class
