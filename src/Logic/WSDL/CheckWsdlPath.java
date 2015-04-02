/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.WSDL;

import com.predic8.wsdl.WSDLParser;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author my301
 */
public class CheckWsdlPath {
    
    
    /* 
     * This class has only one method which checks if the given Wsdl is correct or not, it returns a boolean
     * I call this class every time user enters a new wsdl
     */
    private String message;
    public CheckWsdlPath(){
        message = "Wsdl is invalid.";
    }
    
    /* This method returns true, if the wsdl is correct else it returns false */
    public boolean checkWSDLAvailable(String wsdl) {        
        int length = wsdl.length();
        if(wsdl.charAt(length-5) == ('.')&& Character.toLowerCase(wsdl.charAt(length-4)) == ('w') && Character.toLowerCase(wsdl.charAt(length-3)) == ('s') && Character.toLowerCase(wsdl.charAt(length-2)) == ('d') && Character.toLowerCase(wsdl.charAt(length-1)) == ('l'))// this is to make sure that file extension is correct
        {
            if(checkPath(wsdl)) // check path parse the WSDL aswell
            {
                message = "Wsdl is correct."; // message is for user infomation
                return true;
            }
            else
            {
                message = "Unable to find the file.";
                return false;
            }
        }
        else if(wsdl.charAt(length-5) == ('?') && Character.toLowerCase(wsdl.charAt(length-4)) == ('w') && Character.toLowerCase(wsdl.charAt(length-3)) == ('s') && Character.toLowerCase(wsdl.charAt(length-2)) == ('d') && Character.toLowerCase(wsdl.charAt(length-1)) == ('l')){ // for online WSDL
            URL url = null;
            URLConnection urlConnection = null;
            try {
                url = new URL(wsdl); // creating URL object
                urlConnection = url.openConnection(); // opening new connection
                
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
    
    private boolean checkPath(String pram)
    {
        try{
            WSDLParser parser = new WSDLParser();
            parser.parse(pram);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public String getMessage()
    {
        return message;
    }
    
    /* for testing purpose */
     public static void main(String [] args)
    {
        String wsdl = "/homes/my301/year3/Project/other/article.wsdl";
        CheckWsdlPath obj =  new CheckWsdlPath();
        obj.checkWSDLAvailable(wsdl);
        System.out.println(obj.message);

    }
}
