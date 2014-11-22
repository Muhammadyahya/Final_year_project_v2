/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_data_V1;

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
    
    
        // delete this method
    private static void completextype(Element element)
    {
        out("*****************************remove the stuff between the starts and comment the top line **********************************");
        
        out("  Schema ComplexTypes: ");
        for (ComplexType ct1 : element.getSchema().getComplexTypes()) {
            out("    ComplexType Name: " + ct1.getName());
            if (ct1.getAnnotation() != null)
                annotationOut(ct1);
            if (ct1.getAttributes().size() > 0) {
                out("    ComplexType Attributes: ");
                /*
                 * If available, attributeGroup could be read as same as attribute in
                 * the following.
                 *//*
                for (Attribute attr : ct1.getAttributes()) {
                    out("      Attribute Name: " + attr.getName());
                    out("      Attribute Form: " + attr.getForm());
                    out("      Attribute ID: " + attr.getId());
                    out("      Attribute Use: " + attr.getUse());
                    out("      Attribute FixedValue: " + attr.getFixedValue());
                    out("      Attribute DefaultValue: " + attr.getDefaultValue());
                }
            }
  


            // ct1.getModel() delivers the child element used in complexType. In case
            // of 'sequence' you can also use the getSequence() method.
             
            out("    ComplexType Model: " + ct1.getModel().getClass().getSimpleName());
            if (ct1.getModel() instanceof ModelGroup) {
                out("    Model Particles: ");
                for (SchemaComponent sc : ((ModelGroup) ct1.getModel()).getParticles()) {
                    out("      Particle Kind: " + sc.getClass().getSimpleName());
                    //out("      particle Type: " + sc.);
                    out("      Particle Name: " + sc.getName() + "\n");
                }
            }
            
            if (ct1.getModel() instanceof ComplexContent) {
                Derivation der = ((ComplexContent) ct1.getModel()).getDerivation();
                out("      ComplexConten Derivation: " + der.getClass().getSimpleName());
                out("      Derivation Base: " + der.getBase());
            }
            
            if (ct1.getAbstractAttr() != null)
                out("    ComplexType AbstractAttribute: " + ct1.getAbstractAttr());
            if (ct1.getAnyAttribute() != null)
                out("    ComplexType AnyAttribute: " + ct1.getAnyAttribute());
            
            out("");
        }
        
        if (element.getSchema().getSimpleTypes().size() > 0) {
            out("  Schema SimpleTypes: ");
            for (SimpleType st : element.getSchema().getSimpleTypes()) {
                out("    SimpleType Name: " + st.getName());
                out("    SimpleType Restriction: " + st.getRestriction());
                out("    SimpleType Union: " + st.getUnion());
                out("    SimpleType List: " + st.getList());
            }
        }
        
        
        out("***********************************************************************************");
        
    }
    
    // delete this method
    private static void annotationOut(SchemaComponent sc) {
        if (sc.getAnnotation().getAppinfos().size() > 0) {
            System.out
                    .print("    Annotation (appinfos) available with the content: ");
            for (Appinfo appinfo : sc.getAnnotation().getAppinfos()) {
                out(appinfo.getContent());
            }
        } else {
            System.out
                    .print("    Annotation (documentation) available with the content: ");
            for (com.predic8.schema.Documentation doc : sc.getAnnotation().getDocumentations()) {
                out(doc.getContent());
            }
        }
    }
    
    
         
         */
    
}
