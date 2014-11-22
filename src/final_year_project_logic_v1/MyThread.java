/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_logic_v1;

import final_year_project_GUI_v1.*;
import final_year_project_data_V1.*;
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
       
                    EnumGenGui enumGenGuiFrame = new EnumGenGui(storeEnumObj);
                    enumGenGuiFrame.setSize(550,500);
                    enumGenGuiFrame.setLocationRelativeTo(null);
                    enumGenGuiFrame.setDefaultCloseOperation(EnumGenGui.DISPOSE_ON_CLOSE);
                    enumGenGuiFrame.setVisible(true);
                    enumGenGuiFrame.revalidate();

   }

    @Override
    protected Object doInBackground() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}