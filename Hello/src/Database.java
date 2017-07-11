import java.util.ArrayList;
import java.util.List;


public class Database {
	public List<Persona> list_persone = new ArrayList<Persona>();
	public List<Permesso> list_permessi_dir = new ArrayList<Permesso>();
	public List<Permesso> list_permessi_dip = new ArrayList<Permesso>();
	ConnectionMySQL data1=new ConnectionMySQL();
	
public Database(){
	list_persone.add(new Persona("Agostino", "Palmiero","Dipendente"));
	list_persone.add(new Persona("Antonio", "Divico","Dirigente"));
	list_persone.add(new Persona("Angelo", "Campomaggiore","Dirigente"));
	list_permessi_dir.add(new Permesso("Statistiche"));
	list_permessi_dir.add(new Permesso("Magazzino"));
	list_permessi_dip.add(new Permesso("Badge"));
	list_permessi_dir.add(new Permesso("Accredito stipendio"));
	list_permessi_dip.add(new Permesso("Visualizza stipendio"));
	list_permessi_dir.add(new Permesso("Contabilita"));
	list_permessi_dir.add(new Permesso("Registrazione"));
	}
}
