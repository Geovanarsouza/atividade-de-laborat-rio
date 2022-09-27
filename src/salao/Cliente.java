package salao;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	
	public Cliente(String cpf) {
		this.cpf=cpf;
	}
	
public void setid(int id) {
	    
		if(id>0)
			this.id = id;
	}
public void setnome(String nome) {
	if(nome.length()>2)
		this.nome=nome;
}
public int getId() {
	return this.id;
}
public String getnome() {
	return this.nome;
}
public String getcpf() {
	return this.cpf;
}
}
