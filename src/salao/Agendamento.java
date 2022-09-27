package salao;

import java.util.Calendar;

public class Agendamento {
	private int id;
	private Calendar data;
	private Cliente cliente;
	private int hora;
	private int minuto;
	private Cabelereiro cabelereiro;
	
	public Agendamento(Cliente cliente,Cabelereiro cabelereiro) {
		this.cliente=cliente;
		this.cabelereiro=cabelereiro;
	}
public void setid(int id) {
		this.id = id;
	}
public void setdata(Calendar data) {
    this.data = data;
}
public void setcliente(Cliente cliente) {
	this.cliente=cliente;
}
public void sethora(int hour) {
	this.hora=hour;
}
public void setminuto(int minute) {
	this.minuto=minute;
}
public void setcabelereiro(Cabelereiro cabelereiro) {
	this.cabelereiro=cabelereiro;
}
public int getid() {
	return this.id;
}
public Calendar getdata() {
	return this.data;
}
public Cliente getcliente() {
	return this.cliente;
}
public int gethora() {
	return this.hora;
}
public int getminuto() {
	return this.minuto;
}
public Cabelereiro getcabelereiro() {
	return this.cabelereiro;
}
}
