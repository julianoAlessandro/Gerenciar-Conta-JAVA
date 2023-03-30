package MaterialMarrom;

import java.util.ArrayList;
import java.util.List;

public class Conta3 {
	    private String  idConta;
	    private String nomeCliente;
	    private String nomeBanco;
	    private String nomeAgencia;
	    private double saldo;
	    private  List<Conta3> conta = new ArrayList<>();
	    



	
		public Conta3( String idConta,String nomeCliente,String nomeBanco,String nomeAgencia,double saldo) {
			this.idConta = idConta;
			this.nomeCliente = nomeCliente;
			this.nomeBanco = nomeBanco;
			this.nomeAgencia = nomeAgencia;
			this.saldo = saldo;
	
			
		}



		//public void Conta(int idConta, String nomeCliente, String nomeBanco, String nomeAgencia,double saldo){
	      //  this.idConta = idConta;
	     //   this.nomeCliente = nomeCliente;
	     //   this.nomeBanco = nomeBanco;
	    //    this.nomeAgencia = nomeAgencia;
	   //     this.saldo = saldo;
	  //  }
		
		

	    public String getIdConta() {
			return idConta;
		}


		public void setIdConta(String  idConta) {
		this.idConta = idConta;
		}


		public String getNomeCliente() {
			return nomeCliente;
		}


		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}


		public String getNomeBanco() {
			return nomeBanco;
		}


		public void setNomeBanco(String nomeBanco) {
			this.nomeBanco = nomeBanco;
		}


		public String getNomeAgencia() {
			return nomeAgencia;
		}


		public void setNomeAgencia(String nomeAgencia) {
			this.nomeAgencia = nomeAgencia;
		}


		public double getSaldo() {
			return saldo;
		}


		public void setSaldo(double  saldo) {
			System.out.println("saldo: " + saldo);
			this.saldo = saldo;
		}


		public List<Conta3> getContas() {
			return conta;
		}


		public void setContas(List<Conta3> conta) {
			this.conta = conta;
		}
		
		   public void adicionarConta(Conta3 novaConta) {
		        conta.add(novaConta);
		    }
		   public double Depositar(int valor) {
			  saldo = saldo + valor;
			  return saldo;
			  
		   }
		   public double  sacar(double valor) {
			   if(saldo > valor) {
				   saldo = saldo - valor;
				   return saldo;
				   
				   
			   }
			   else {
				   System.out.println("saldo inválido para sacar");
			   }
			return valor;
			
		   }


		@Override
	    public String toString() {
	        return "Conta{" +
	                "idConta=" + idConta +
	                ", nomeCliente='" + nomeCliente + '\'' +
	                ", nomeBanco='" + nomeBanco + '\'' +
	                ", nomeAgencia='" + nomeAgencia + '\'' +
	                  "saldo:" + saldo + "\r\n"+ '}';
	    }
	


	}
