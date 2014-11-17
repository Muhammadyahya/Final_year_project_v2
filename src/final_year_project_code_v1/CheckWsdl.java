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
    
    public CheckWsdl(){
        
    }
    
    public boolean checkWSDLAvailable(String wsdl) {
        
        int length = wsdl.length();
        if(wsdl.charAt(length-5) == ('?') && wsdl.charAt(length-4) == ('W') && wsdl.charAt(length-3) == ('S') && wsdl.charAt(length-2) == ('D') && wsdl.charAt(length-1) == ('L')){
            
            
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
            
            return true;
        }
        
        else{
            
            return false;
        }
        
    }
    
}
