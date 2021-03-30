class Logowanie{
	private String login = "dupa";
	private String haslo = "123";
		
	//KONSTRUKTOR
	public Logowanie(){
		this.login = login;
		this.haslo = haslo;
	}
    @Override
	public String toString(){
        return "Login:"+login+" Haslo:"+haslo; 
    }

}