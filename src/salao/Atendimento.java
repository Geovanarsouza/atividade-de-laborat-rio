package salao;

import java.util.Calendar;

public class Atendimento {
	private Cliente cliente;
	private Calendar data;
	private Serviço serviço;
	private Cabelereiro cabelereiro;
	
	public Atendimento(Cliente cliente) {
		this.cliente=cliente;
	}
	public void setdata(Calendar data) {
		this.data=data;
	}
	public void setcliente(Cliente cliente) {
		this.cliente=cliente;
	}
	public void setserviço(Serviço serviço) {
		this.serviço=serviço;
	}
	public void setcabelereiro(Cabelereiro cabelereiro) {
		this.cabelereiro=cabelereiro;
	}
	public void getserviço(Serviço serviço) {
		this.serviço=serviço;
	}
	public void getcabelereiro(Cabelereiro cabelereiro) {
		this.cabelereiro=cabelereiro;
	}
	public Calendar getdata() {
		return this.data;
	}
	public Serviço getserviço() {
		return this.serviço;
	}
	public Cabelereiro getcabelereiro() {
		return this.cabelereiro;
	}
	public Cliente getcliente() {
		return this.cliente;
	}
}
