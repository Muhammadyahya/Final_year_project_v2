/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aFinal_Year_Project_DeleteME_V1;

import Final_Year_Project_Data_V1.StoreEnum;
import javax.swing.SwingWorker;

/**
 *
 * @author my301
 */
public class MyThread extends SwingWorker<Object, Object> { 

   private StoreEnum storeEnumObj;
    
   public MyThread(StoreEnum parameter) {
        this.storeEnumObj = parameter;
       // store parameter for later user
   }

   public void start() {
       
  

   }

    @Override
    protected Object doInBackground() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}