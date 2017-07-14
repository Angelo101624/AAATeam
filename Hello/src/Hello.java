 import java.rmi.RemoteException;
 
public class Hello implements ServiceInterface {
    public String ID1,pass1;
    public boolean x,y=false;
    Database data = new Database();
   
    public String controlloAutorizzazione(String Username, String Password, String Servizio){
    	this.ID1=Username;
    	this.pass1=Password;
    	for(int i=0; i<data.list_persone.size(); i++){
    		if(data.list_persone.get(i).getusername().equals(Username)&&data.list_persone.get(i).getpassword().equals(Password)){
    			x=true;
    			if(data.list_persone.get(i).getruolo()=="Dirigente"){
    			    for(int j=0; j<data.list_permessi_dir.size(); j++){
    			        if(data.list_permessi_dir.get(j).getdescrizione().equals(Servizio)){
    	    		        y=true;
    			        	return "Accesso permesso - Servizio permesso";
    			        }
    	            }
    			    if (y!=true) {return "Accesso permesso - Servizio negato";}
    		    }
    			
    			if(data.list_persone.get(i).getruolo()=="Dipendente"){
    			    for(int j=0; j<data.list_permessi_dip.size(); j++){
    			        if(data.list_permessi_dip.get(j).getdescrizione().equals(Servizio)){
    	    		        y=true;
    			        	return "Accesso permesso - Servizio permesso";}
    	            }
    			    if (y!=true) {return "Accesso permesso - Servizio negato";}
    			}
    		}
    	}
        if(x!=true){return "Credenziali errate";}
		return "-----------";
  }
    
}
