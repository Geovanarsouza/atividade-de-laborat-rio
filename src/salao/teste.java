package salao;

import java.util.Calendar;

public class teste {

	public static void main(String[] args) {
		Cliente cliente1=new Cliente("123.456.789-11");
		Cliente cliente2=new Cliente("123.456.789-22");
		Cliente cliente3=new Cliente("123.456.789-33");
		cliente1.setid(1);
		cliente1.setnome("Julia");
		cliente2.setid(2);
		cliente2.setnome("Maria");
		cliente3.setid(3);
		cliente3.setnome("Isabela");
		
		Cabelereiro cabelereiro1=new Cabelereiro("123.456.789-444","Marcos");
		Cabelereiro cabelereiro2=new Cabelereiro("123.456.789-555","Patricia");
		Cabelereiro cabelereiro3=new Cabelereiro("123.456.789-666","Arthur");
		cabelereiro1.setid(4);
		cabelereiro2.setid(5);
		cabelereiro3.setid(6);

		Serviço serviço1=new Serviço();
		Serviço serviço2=new Serviço();
		Serviço serviço3=new Serviço();
		serviço1.setid(7);
		serviço1.setnome("escova");
		serviço1.setvalor(50);
		serviço1.setdescrição("escovação completa no cabelo");
		serviço2.setid(8);
		serviço2.setnome("corte");
		serviço2.setvalor(25);
		serviço2.setdescrição("corte de cabelo");
		serviço3.setid(9);
		serviço3.setnome("design de sobrancelha");
		serviço3.setvalor(30);
		serviço3.setdescrição("desig de sobrancelha com aplicação de henna");
		
		Agendamento agendamento1=new Agendamento(cliente1,cabelereiro1);
		Agendamento agendamento2=new Agendamento(cliente2,cabelereiro2);
		Agendamento agendamento3=new Agendamento(cliente3,cabelereiro3);
		agendamento1.setid(10);
		agendamento1.setdata(Calendar.getInstance());
		agendamento1.setcliente(cliente1);
		agendamento1.sethora(Calendar.HOUR);
		agendamento1.setminuto(Calendar.MINUTE);
		agendamento1.setcabelereiro(cabelereiro1);
		agendamento2.setid(11);
		agendamento2.setdata(Calendar.getInstance());
		agendamento2.setcliente(cliente2);
		agendamento2.sethora(Calendar.HOUR);
		agendamento2.setminuto(Calendar.MINUTE);
		agendamento2.setcabelereiro(cabelereiro2);
		agendamento3.setid(12);
		agendamento3.setdata(Calendar.getInstance());
		agendamento3.setcliente(cliente3);
		agendamento3.sethora(Calendar.HOUR);
		agendamento3.setminuto(Calendar.MINUTE);
		agendamento3.setcabelereiro(cabelereiro3);
		
		Atendimento atendimento1=new Atendimento(cliente1);
		Atendimento atendimento2=new Atendimento(cliente2);
		Atendimento atendimento3=new Atendimento(cliente3);
		atendimento1.setdata(Calendar.getInstance());
		atendimento1.setserviço(serviço1);
		atendimento1.setcabelereiro(cabelereiro1);
		atendimento2.setdata(Calendar.getInstance());
		atendimento2.setserviço(serviço2);
		atendimento2.setcabelereiro(cabelereiro2);
		atendimento3.setdata(Calendar.getInstance());
		atendimento3.setserviço(serviço3);
		atendimento3.setcabelereiro(cabelereiro3);
		System.out.println("CLIENTES");
		System.out.println(cliente1.getnome()+ "\t"+cliente1.getcpf()+"\t"+ cliente1.getId());
		System.out.println(cliente2.getnome()+ "\t"+cliente2.getcpf()+"\t"+ cliente2.getId());
		System.out.println(cliente3.getnome()+ "\t"+cliente3.getcpf()+"\t"+ cliente3.getId());
		System.out.println("CABELEREIROS");
		System.out.println(cabelereiro1.getnome()+ "\t"+cabelereiro1.getcpf()+"\t"+ cabelereiro1.getid());
		System.out.println(cabelereiro2.getnome()+ "\t"+cabelereiro2.getcpf()+"\t"+ cabelereiro2.getid());
		System.out.println(cabelereiro3.getnome()+ "\t"+cabelereiro3.getcpf()+"\t"+ cabelereiro3.getid());
		System.out.println("SERVIÇOS");
		System.out.println(serviço1.getnome()+"\t"+serviço1.getvalor()+"\t"+serviço1.getdescrição()+"\t"+serviço1.getId());
		System.out.println(serviço2.getnome()+"\t"+serviço2.getvalor()+"\t"+serviço2.getdescrição()+"\t"+serviço2.getId());
		System.out.println(serviço3.getnome()+"\t"+serviço3.getvalor()+"\t"+serviço3.getdescrição()+"\t"+serviço3.getId());
		System.out.println("ATENDIMENTO");
		System.out.println(atendimento1.getcabelereiro().getnome()+"\t"+atendimento1.getdata()+"\t"+atendimento1.getserviço().getnome()+"\t"+atendimento1.getcliente().getnome());
		System.out.println(atendimento2.getcabelereiro().getnome()+"\t"+atendimento2.getdata()+"\t"+atendimento2.getserviço().getnome()+"\t"+atendimento2.getcliente().getnome());
		System.out.println(atendimento3.getcabelereiro().getnome()+"\t"+atendimento3.getdata()+"\t"+atendimento3.getserviço().getnome()+"\t"+atendimento3.getcliente().getnome());
	}
}
