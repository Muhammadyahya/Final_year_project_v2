/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_WsdlParsing_V1;

/**
 *
 * @author my301
 */

import com.predic8.schema.ComplexContent;
import com.predic8.schema.ComplexType;
import com.predic8.schema.Derivation;
import com.predic8.schema.Element;
import com.predic8.schema.Schema;
import com.predic8.schema.SimpleType;
import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.Operation;
import com.predic8.wsdl.PortType;
import com.predic8.wsdl.WSDLParser;
import java.util.List;

public class Main2 {

	/**
	 * @param args
	 */
	private static Definitions definitions;

	public static void main(String[] args) {
		WSDLParser parser = new WSDLParser();
		definitions = parser.parse("http://www.webservicex.net/geoipservice.asmx?WSDL");
		//String requiredOperation = "authenticate";
		for (PortType portType : definitions.getPortTypes()) {
			List<Operation> operation = portType.getOperations();
			if (operation != null) {
                            
                            for(Operation op: operation){
                                
				Element request = op.getInput().getMessage().getParts().get(0).getElement();
                            
				getChildElements(request);
                            }
			}
		}
	}

	public static void getChildElements(Element element) {
		ComplexType complexType = null;//element.getSchema().getComplexType(
				//element.getType().getLocalPart());
		if (complexType != null) {
			if (complexType.getModel() instanceof ComplexContent) {
				Derivation derivation = ((ComplexContent) complexType
						.getModel()).getDerivation();
				if (derivation.getBase() != null) {
					if (element.getSchema().getElement(
							derivation.getBase().getLocalPart()) == null) {
						// System.out.println(definitions.getElement(derivation.getBase()));
						System.out.println(derivation.getBase().getLocalPart());
						getElement(derivation.getBase().getLocalPart());
					}
				}
			}
		} else {
			SimpleType simpleType = element.getSchema().getSimpleType(
					element.getType().getLocalPart());
			if (simpleType != null) {
				
			}
		}
	}

	public static Element getElement(String name) {
		Element element = new Element();
		for (Schema schema : definitions.getSchemas()) {
			System.out.println(schema.getAllElements());
		}
		return element;
	}

}
