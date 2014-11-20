/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/




package final_year_project_code_v1;

/**
 *
 * @author Muhammad Yahya
 */

import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.WSDLParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class DeleteME extends JFrame
{
    
    private static void tryCatch()
            
    {
        try{ 
        WSDLParser parser = new WSDLParser();
        Definitions defs = parser.parse("/homes/my301/year3/Project/other/GoogleSearch.wsdl");
        InputStream stream = null;
        stream = new FileInputStream(new File("/homes/my301/year3/Project/other/file.txt"));
            System.out.println(":)");
        }
        catch(Exception e){
            System.out.println(e.toString());
            System.out.println(":(");
        }
        
    }     

    
    public static void main(String[] args)
    {
        tryCatch();
    }
}



