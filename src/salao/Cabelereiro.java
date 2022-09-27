package salao;

public class Cabelereiro {
	private int id;
	private String nome;
	private String cpf;
	
public void setid(int id) {
	    
		if(id>0)
			this.id = id;
	}
public void setnome(String nome) {
    
	if(nome.length()>2) {
		this.nome=nome;
	}
		
}
public Cabelereiro(String cpf,String nome) {
	this.cpf=cpf;
	this.nome=nome;
}
public int getid() {
	return this.id;
}
public String getnome() {
	return this.nome;
}
public String getcpf() {
	return this.cpf;
}
}
