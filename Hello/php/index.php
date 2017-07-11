<?php
 /*
 * PHP SOAP - How to create a SOAP Server and a SOAP Client
 */

$options = array('location' => 'http://localhost:8080/Hello/services/Hello', 
                  'uri' => 'http://localhost/'
				 );
//create an instante of the SOAPClient (the API will be available)
$api = new SoapClient(NULL, $options);
//call an API method
echo $api->controlloAutorizzazione(String Username, String Password, String Servizio);
 ?>