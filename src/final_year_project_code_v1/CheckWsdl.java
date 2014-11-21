/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_code_v1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author my301
 */
public class CheckWsdl {
    
    
    /* This class has only one method which checks if the given Wsdl is correct or not, it returns a boolean
     * I call this class every time user enters a new wsdl
    */
    private String message;
    public CheckWsdl(){
       message = "Wsdl is invalid.";
    }
    
    /* This method returns true, if the wsdl is correct else it returns false */
    public boolean checkWSDLAvailable(String wsdl) {
        
        int length = wsdl.length();
        if(wsdl.charAt(length-5) == ('.')&& Character.toLowerCase(wsdl.charAt(length-4)) == ('w') && Character.toLowerCase(wsdl.charAt(length-3)) == ('s') && Character.toLowerCase(wsdl.charAt(length-2)) == ('d') && Character.toLowerCase(wsdl.charAt(length-1)) == ('l'))
        {
            if(Common.checkPath(wsdl))
            {
                message = "Wsdl is correct.";
                return true;
            }
            else
            {
                message = "Unable to find the file.";
                return false;
            }
        }
        else if(wsdl.charAt(length-5) == ('?') && Character.toLowerCase(wsdl.charAt(length-4)) == ('w') && Character.toLowerCase(wsdl.charAt(length-3)) == ('s') && Character.toLowerCase(wsdl.charAt(length-2)) == ('d') && Character.toLowerCase(wsdl.charAt(length-1)) == ('l')){
            URL url = null;
            URLConnection urlConnection = null;
            try {
                url = new URL(wsdl);
                urlConnection = url.openConnection();
                
                if(urlConnection.getContent() == null) {
                    return false;
                }                
            } catch (MalformedURLException ex) {
                return false;
            } catch (IOException ex) {
                return false;
            }
            message = "Wsdl is correct.";
            return true;
        }        
        else{            
            return false;
        }        
    
        
    }
     public String getMessage()
        {
            return message;
        }
}
