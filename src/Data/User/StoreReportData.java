/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.User;

import java.util.ArrayList;

/**
 *
 * @author my301
 */

public class StoreReportData {
    
    private CollectTestData collectTestDataObj;
    private ArrayList<StoreGeneratedValue> storeGeneratedValueObj;
    private ArrayList<String> inputData;
    private ArrayList<String> outPutResponse;
    private ArrayList<String> actualTagValue;
    private ArrayList<StoreCheckValueData> storeCheckValueDataList;

   
    
    public StoreReportData(CollectTestData collectTestDataPram)
    {
        this.collectTestDataObj = collectTestDataPram;
        this.storeGeneratedValueObj = new ArrayList<>();
        this.inputData = new ArrayList<>();
        this.outPutResponse = new ArrayList<>();
        this.actualTagValue = new ArrayList<>();
    }
    
    public void addStoreGeneratedValue(StoreGeneratedValue obj){
        this.storeGeneratedValueObj.add(obj);
    }
    
    public void addinputData(String pram){
        this.inputData.add(pram);
    }
    public void addOutPutResponse(String pram){
        this.outPutResponse.add(pram);
    }
    
    public ArrayList<String> getInputData(){
        return this.inputData;
    }
    public ArrayList<String> getOutPutResponse(){
        return this.outPutResponse;
    }      
    public CollectTestData getCollectTestData(){
        return collectTestDataObj;
    }
    
    public ArrayList<StoreGeneratedValue> getStoreGeneratedValue(){
        return this.storeGeneratedValueObj;
    }
    public ArrayList<String> getActualTagValue(){
        return this.actualTagValue;
    }
    public void addActualTagValue(String parm){
        this.actualTagValue.add(parm);
    }

    public ArrayList<StoreCheckValueData> getStoreCheckValueDataList() {
        return storeCheckValueDataList;
    }

    public void setStoreCheckValueDataList(StoreCheckValueData storeCheckValueDataList) {
        this.storeCheckValueDataList.add(storeCheckValueDataList);
    }
}
