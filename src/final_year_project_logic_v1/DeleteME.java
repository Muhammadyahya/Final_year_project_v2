/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/




package final_year_project_logic_v1;

/**
 *
 * @author Muhammad Yahya
 */

import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DeleteME extends JFrame
{
    


    public void Test() {
        Set<Object> options = new HashSet<>();
        options.add(new Option<Integer>("One", 1));
        options.add(new Option<Integer>("Two", 2));
        options.add(new Option<Integer>("Three", 3));
        options.add(new Option<Integer>("Four", 4));
        //CheckComboBox s = new CheckComboBox(options);
        
        CheckComboBox c = new CheckComboBox();
        this.add(this);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.pack();
    }

    private static class CheckComboBox {

        public CheckComboBox() {
        }
    }
    
  


    private class Option<T> implements Comparable<T> {
        private String label;
        private T value;

        public Option(String label, T value) {
            this.label = label;
            this.value = value;
        }

        @Override
        public String toString() {
            return this.label;
        }

        @Override
        public int compareTo(T o) {
            // TODO Auto-generated method stub
            return 0;
        }
    }
    
    
       public static void main(String[] args) {
       DeleteME x = new DeleteME();
       
        x.Test();
    }
}



