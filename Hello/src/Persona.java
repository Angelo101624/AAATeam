public class Persona {
	private String username;
	private String password;
	private String ruolo;

    public Persona(){}
	
	public Persona(String username, String password,String ruolo){
	    this.username=username;
	    this.password=password;
	    this.ruolo=ruolo;
    }

    public String getusername(){
    	return username;
    }
    public void setusername(String user){
    	this.username=user;
    }

    public String getpassword(){
    	return password;
    }
    public void setpassword(String pwd){
    	this.password=pwd;
    }


    public String getruolo(){
    	return ruolo;
    }
    public void setruolo(String ru){
    	this.ruolo=ru;
    }


}
