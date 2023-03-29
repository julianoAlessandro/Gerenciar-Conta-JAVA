package MaterialMarrom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GerenciarConta3 {
   private final  Scanner sc = new Scanner (System.in);
    public static List<Conta3> listConta = new ArrayList<Conta3>();
	
    

	 //funções fora do main

	    public static void main(String[] args) {	
	     GerenciarConta3 gc = new GerenciarConta3();
	     
	     int opcao = 0;
	    
	    do {
	    	System.out.println("==================================================================");
	    	System.out.println("Bem vindo ao Menu de escolha :");
	    	System.out.println("Escolha uma opcao para continuar com o Programa:");
	    	System.out.println("Digite 1 para Cadastrar");
	    	System.out.println("Digite 2 para depositar");
	    	System.out.println("Digite 3 para Sacar");
	    	System.out.println("Digite 4 para Mostrar Saldo");
	    	System.out.println("Digite 5 para ver Patrimonio");
	    	System.out.println("Digite 7 para ver as contas Cadastradas");
	    	System.out.println("Digite 9 para sair");
	    	System.out.println("==================================================================");
	    	
	    	opcao =Integer.parseInt(gc.sc.nextLine());
	    	switch(opcao) {
	    	//precisam ser chamados a partir de um objeto da propria classe GerenciarConta3
	    	case 1:
	    	{
	    		gc.execCadastrarConta();
	    		break;
	    	}
	    		
	    	case 2:
	    		gc.execDepositar();
	    		break;
	    	//case 3:
	    		//gc.execSacar();
	    	//	break;
	    	//case 4:
	    	//	gc. execExibirSaldo();
	    	//	break;
	    	//case 5:
	    		//gc.execMostrarPatrimonio();
	    		//break;
	    	case 7:
	    	{
	    		gc.execContasCadastradas();
	    		break;
	    
	    	}
	    	
	    	
	    		
	    	case 9:
	    		System.out.println("Programa encerrado");
	    	default:
	    		System.out.println("Escolha invalida");
	    		
	    		
	    	}//condcionais   
	    
	    	
	       			    
	       	
	    }while(opcao != 9);

	
	    

	    }//main 
	    
	    //função fora do main
	    public void  execCadastrarConta(){
	    	System.out.println("************************************************************");
	    	System.out.println("Seja bem vindo ao Sistema de Cadastro:");
	    	System.out.println("Digite o nome do cleinte:");
	    	String nome = sc.nextLine();
	    	System.out.println("Digite o id da conta: ");
	       	String  idConta = sc.nextLine();
	    	//int idConta2 = 0;   	
	  
	    	//if(!idConta.isEmpty()) {
	    		//System.out.println("Seu id está armazenado !");
	    		//System.out.println("Seu id numerico será:"+ idConta2);
	    	//}
	    	//else {
	    		//System.out.println("Informe um id no campo digite ID");
	    	//}
	    		    	
	       	
	    	
	    	
	    	System.out.println("Informe o saldo atual:");
	    	Double saldo = Double.valueOf(sc.nextLine()); //perguntar ao professor sobre problema ao deixar isso por último
	    	
	    	System.out.println("Digite o nome da Agencia:");
	    	String nomeAgencia = sc.nextLine();
	    	
	    	System.out.println("Digite o nome do Banco :");
	    	String nomeBanco = sc.nextLine();
	    	
	    	System.out.println("************************************************************");
	    	 
	
	    	
	       	
	      
	        	
	       	Conta3 novaConta = new Conta3(idConta,nome,nomeBanco,nomeAgencia,saldo);
	   	  	listConta.add(novaConta);
	   	  	
	   	 
	   	  	
	   		     	   	  	   	  	
	    }
	   	  	
	   	  public void execContasCadastradas() {
	   			for(int i = 0; i < listConta.size(); i++) {
	   			System.out.println("=============================Informações do Adminstrador do Banco===================");
	   	  		System.out.println("O cliente possui um total de"+ i + "Cadastradas no Sistema,endo esses cadastros:"+listConta);
	   	  		
	   	  	}
	   		
	   		
	   	  }
	   	  /*
	   	  
	   	  public void execDepositar() {
	   	 	for(Conta3 conta : listConta) {
	   	 		System.out.println("conta: " + conta.getIdConta());
	   	 		
	   	 		if (conta.getIdConta().equals("1")) {
	   	 			System.out.println("achei: " + conta.getNomeCliente());
	   	 		}
	   	 	}
	   		  
	   		  
	   	  }// pelo ID!!
	   	  
	   	  */
	   	  
	   	public void  execDepositar() {
	   		System.out.println("Escolha uma conta para depositar o valor, informe seu ID:");
	   
	   		int valor =Integer.valueOf(sc.nextLine());
	   		for(int i = 0; i < listConta.size(); i++) {
	   			if(i == valor) {
	   				System.out.println("A conta escolhida é a de id:"+ valor +"sendo a sua conta :"+ listConta.get(i));
	   				
	   			}
	   		}// por indice
	   
	   		 
	   	 
	    	
	    	
	    	
	    
	    	
	    	

	    
	    
	    
	
	   	}
}//fim da classe
