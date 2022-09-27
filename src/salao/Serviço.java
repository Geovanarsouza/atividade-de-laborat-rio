package salao;

public class Serviço {
	private int id;
	private String nome;
	private float valor;
	private String descrição;
	
public void setid(int id) {
	    
		if(id>0)
			this.id = id;
	}
public void setnome(String nome) {
    if(nome.length()>4)
		this.nome = nome;
}
public void setdescrição(String descrição) {
    if(descrição.length()>9)
		this.descrição = descrição;
}
public void setvalor(float valor) {
    
	if(valor>0)
		this.valor = valor;
}
public int getId() {
	return this.id;
}
public String getnome() {
	return this.nome;
}
public String getdescrição() {
	return this.descrição;
}
public float getvalor() {
	return this.valor;
}
}
