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
    private ArrayList<StoreResultValue> storeCheckValueDataList;
    
    public StoreReportData(CollectTestData collectTestDataPram)
    {
        this.collectTestDataObj = collectTestDataPram;
        this.storeGeneratedValueObj = new ArrayList<>();
        this.inputData = new ArrayList<>();
        this.outPutResponse = new ArrayList<>();
        this.storeCheckValueDataList = new ArrayList<>();

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
    
    public ArrayList<StoreResultValue> getStoreCheckValueDataList() {
        return storeCheckValueDataList;
    }

    public void setStoreCheckValueDataList(StoreResultValue storeCheckValueDataList) {
        this.storeCheckValueDataList.add(storeCheckValueDataList);
    }
}
