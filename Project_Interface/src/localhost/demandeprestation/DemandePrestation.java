

/**
 * DemandePrestation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package localhost.demandeprestation;

    /*
     *  DemandePrestation java interface
     */

    public interface DemandePrestation {
          

        /**
          * Auto generated method signature
          * 
                    * @param demandePrestationRequest0
                
         */

         
                     public localhost.demandeprestation.DemandePrestationResponse process(

                        localhost.demandeprestation.DemandePrestationRequest demandePrestationRequest0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param demandePrestationRequest0
            
          */
        public void startprocess(

            localhost.demandeprestation.DemandePrestationRequest demandePrestationRequest0,

            final localhost.demandeprestation.DemandePrestationCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    