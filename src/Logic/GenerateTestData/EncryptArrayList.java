/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.GenerateTestData;

import java.util.ArrayList;

/**
 *
 * @author my301
 */
public class EncryptArrayList {
    
    private ArrayList<String> encryptArrayList;
    public EncryptArrayList()
    {
        this.encryptArrayList = new ArrayList<>();
    }
    
    public ArrayList<String> startEncrypt(String className, String buttonValue, String userValue)
    {
        switch (className) {
            case "String":
                this.encryptArrayList.add("String");
                addButtonValue(buttonValue);
                break;
            case "Int":
                this.encryptArrayList.add("Int");
                addButtonValue(buttonValue);
                break;
            case "Char":
                this.encryptArrayList.add("Char");
                addButtonValue(buttonValue);
                break;
            case "Boolean":
                this.encryptArrayList.add("Boolean");
                addButtonValue(buttonValue);
                break;
            case "Date":
                this.encryptArrayList.add("Date");
                addButtonValue(buttonValue);
                break;
        }
        
        /* finally add the value */
        this.encryptArrayList.add(userValue);
        
        return this.encryptArrayList;
        
    }
    
    public void addButtonValue(String button)
    {
        switch (button) {
            case "Random":
                this.encryptArrayList.add("Random");
                break;
            case "betweenTwoValue":
                this.encryptArrayList.add("BetweenTwoValue");
                break;
            case "Specific":
                this.encryptArrayList.add("Specific");
                break;
        }
    }
    
}
