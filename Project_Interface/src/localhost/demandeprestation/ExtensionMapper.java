
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package localhost.demandeprestation;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://facturation.tmax.com/xsd".equals(namespaceURI) &&
                  "Result".equals(typeName)){
                   
                            return  com.tmax.facturation.xsd.Result.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://planification.tmax.com/xsd".equals(namespaceURI) &&
                  "Plan".equals(typeName)){
                   
                            return  com.tmax.planification.xsd.Plan.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    