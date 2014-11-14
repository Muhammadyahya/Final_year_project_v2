/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_SoupUI_V1;

/**
 *
 * @author my301
 */
public class extra_code {
    
    /*  try {
         
          String wsldInput = JOptionPane.showInputDialog("please enter the WSLD");
          // this wsldinput will go instead of wsld 2 lines below.
          WsdlProject project = new WsdlProject();
          
          WsdlInterface iface = WsdlInterfaceFactory.importWsdl(project, "http://www.webservicex.net/geoipservice.asmx?WSDL", true)[0];
          
          List<Operation> operationlist = iface.getOperationList();
          
          System.out.println(""+iface.getName());
          
          
          
          List<AbstractWsdlModelItem<?>> abc = iface.getAllMessages();
          for(AbstractWsdlModelItem<?> m : abc){
          //out("abstract zzzzzzzzzzzzzzzzz"+m.getChildren().get(0).getName());
          for(ModelItem mx : m.getChildren()){
          
          out("mxxxxx:   "+ mx.getName());
          
          
          
          
          }
          }
          for (Operation opObj : operationlist) {
          System.out.println("1111111: "+opObj.getName());
          WsdlOperation operation1 = (WsdlOperation) iface.getOperationByName(opObj.getName());
          
          //WsdlRequest request = operation1.addNewRequest("request one");
          
          System.out.println("oprtation type tttttt:  "+operation1.getType());
          
          
          System.out.println("555555555:  "+ operation1.getBindingOperation().getBindingInput());
          List<? extends ModelItem> modellist = opObj.getChildren();
          for(ModelItem modelObj:modellist)
          {
          System.out.println("222222: "+modelObj.getName());
          }
          
          List<Request> childrens = opObj.getRequestList();
          for (Request c : childrens) {
          System.out.println("333333333:  "+c.getRequestContent());
          }
          
          org.apache.xmlbeans.SchemaType sType = null;
          
          WsdlElementType et = new WsdlElementTypeImpl(sType);
          
          }
          
          
          } catch (XmlException | IOException | SoapUIException ex) {
          Logger.getLogger(Wsdl_Parsing.class.getName()).log(Level.SEVERE, null, ex);
          
          }
         
         */
    
}
