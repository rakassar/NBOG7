package BUSINESSNEXT.NBOG7.API;



import java.io.ByteArrayInputStream;
import java.io.File;

import javax.naming.InitialContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;

import org.apache.axis.utils.ByteArrayOutputStream;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import BUSINESSNEXT.NBOG7.METHOD.*;
import BUSINESSNEXT.SBCGOLD8.REPOSITORY.Properties;





public class AMLServicesForLead {
//public static String Token;
    // SAAJ - SOAP Client Testing
    //public static void main(String args[]) {

public static void AMLServicesCall() {
        /*
            The example below requests from the Web Service at:
             http://www.webservicex.net/uszip.asmx?op=GetInfoByCity


            To call other WS, change the parameters below, which are:
             - the SOAP Endpoint URL (that is, where the service is responding from)
             - the SOAP Action

            Also change the contents of the method createSoapEnvelope() in this class. It constructs
             the inner part of the SOAP envelope that is actually sent.
         */
	    String soapEndpointUrl=Properties.WSDLUrl;   
        //String soapEndpointUrl = "https://sbcdev.crmnext.com/accg7/CRMnextWebApi/CRMnextService.svc";
        String soapAction = "http://www.crmnext.com/api/ICRMnextApi/SaveObject";
       
        callSoapWebService(soapEndpointUrl, soapAction);
    }

    private static void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String myNamespace = "api";
        String myNamespace1 = "arr";
        String myNamespaceURI = "http://www.crmnext.com/api/";
        String myNamespaceURI1 = "http://schemas.microsoft.com/2003/10/Serialization/Arrays";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
        envelope.addNamespaceDeclaration(myNamespace1, myNamespaceURI1);
        SOAPBody soapBody = envelope.getBody();
        
        SOAPElement SaveObject = soapBody.addChildElement("SaveObject", myNamespace);

        SOAPElement userContext = SaveObject.addChildElement("userContext", myNamespace);
      
        SOAPElement issuccess = userContext.addChildElement("IsSuccess", myNamespace);
        issuccess.addTextNode("true");
        //Token="qjg8clqv8mjs5njd6l2s676fkp5qqyt2meg56m88jgkaqr6f6vmalmenxz7ytd3mxscnqmdd3en94e7yxe4jsmg5a6uv2swm466bdb3jr6jczpum97lnqnc56vl5fezd83ctzqgjfv2pczn2pk6b3s227bmwuegj2a2xh9s3f7rhmwkv5rd3mazzpujtwk3wazuh5b3nky27g9wm7uwutr3ngreayfjrta6gnk9q3xapd4wwu3u74bbalq6d68mvjhvmk7e3g3a4cdggadvvwyu9wthj3cn2g46cch7sxccuduynqjksbdxcjcfk8g4y3pjcfa9r48lcycsc6msr4e5qylqhjglxbqs9lv5jb4hkh9bjqt9laa9rdlrd9tv666w7ts3hd4b67h6nma4dmfnf6ganav8gpawtzscdlwydvkrubael3a43ejjtuyakkykg3aecwmumakl9f7dqcmgmuzl63wfraz3j3pp2anvbjk8drmwjl6bzrjj98a4yte3jbt5e6k3t9pvuehh6kgvwh7pr3b9zf66nyztfm257x2x6e2c9947yytst786t23exkxyjw6n9badps3tbkx5u2gs3x6dv6huchv2";
        
        SOAPElement tokens = userContext.addChildElement("Token", myNamespace);
        tokens.addTextNode(TokenGeneration.Token);
        
        SOAPElement objectInfo = SaveObject.addChildElement("objectInfo", myNamespace);
        SOAPElement SaveRequest = objectInfo.addChildElement("SaveRequest", myNamespace);
        
        //SaveRequest.setAttribute("xsi:type", "api:Lead");
        //SaveRequest.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");

        
        SOAPElement ItemId = SaveRequest.addChildElement("ItemId", myNamespace);
        ItemId.addTextNode(LeadObjectPageMethod.leadid);
        SOAPElement ItemType = SaveRequest.addChildElement("ItemType", myNamespace);
        ItemType.addTextNode("Lead");
        SOAPElement ObjectData= SaveRequest.addChildElement("ObjectData", myNamespace);

        SOAPElement KeyValueOfstringstring	 = ObjectData.addChildElement("KeyValueOfstringstring", myNamespace1);
    
        SOAPElement key1=KeyValueOfstringstring.addChildElement("Key", myNamespace1);
        key1.addTextNode("lea_ex9_17");
        SOAPElement Value1 = KeyValueOfstringstring.addChildElement("Value",myNamespace1 );
        Value1.addTextNode("Match Not Found");
   
        
        
        //soapBodyElem4.addTextNode("acid_qa");

         }

    private static void callSoapWebService(String soapEndpointUrl, String soapAction) {
        
    	try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);
            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            String Response =soapResponse.toString();
            System.out.println(Response);
            
            //soapResponse.writeTo(System.out);
            //System.out.println();
            
           // soapResponse.getSOAPBody();
            //soapResponse.getSOAPPart();
      
            ByteArrayOutputStream byteOutStream = new ByteArrayOutputStream();
            soapResponse.writeTo(byteOutStream);
            String res = new String(byteOutStream.toByteArray());
            //System.out.println("Response \n"+res);
 
            
            File xmlFile = new File(res);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            ByteArrayInputStream bis = new ByteArrayInputStream(res.getBytes());
            Document doc = dBuilder.parse(bis);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("IsSuccess");
            String IsSuccess = nList.item(0).getChildNodes().item(0).getTextContent();
            System.out.println("IsSuccess-"+IsSuccess);
            
            NodeList nList1 = doc.getElementsByTagName("Message");
            String Message = nList1.item(0).getChildNodes().item(0).getTextContent();
            System.out.println("Message-"+Message);
            
			/*
			 * nList = doc.getElementsByTagName("FamilyAnnualOOPLimitAmount"); String
			 * familyAnnualAmount = nList.item(0).getChildNodes().item(0).getTextContent();
			 */
            
            
            
            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }

    private static SOAPMessage createSOAPRequest(String soapAction) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        createSoapEnvelope(soapMessage);
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);
        headers.addHeader("Content-Type", "text/xml; charset=utf-8");
        soapMessage.saveChanges();
        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");
        return soapMessage;
    }

}