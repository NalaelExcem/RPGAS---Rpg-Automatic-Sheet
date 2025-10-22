package theagonis;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Ficha ficha = new Ficha();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ver Alpha 1.0 - Inicializada.");
		
		// Loop 
		while (true) {
			System.out.println("Digite Nome:");
			String name = sc.next();
			ficha.setNome(name);
			
			System.out.println("Hp");
			Float hp = sc.nextFloat();
			ficha.setHp(hp);
			
			System.out.println("Mp");
			Float mp = sc.nextFloat();
			ficha.setMp(mp);
			
			System.out.println("Xp");
			Float xp = sc.nextFloat();
			ficha.setXp(xp);
			
			
			System.out.println(ficha.viewFicha());
			System.out.println("Essa ficha está correta? Digite 1 para Sim.");
			String resposta = sc.next();
			if (resposta.equals("1")) {
			    System.out.println("Salvo");
			    break;
			} else {
				System.out.println("Preencha Novamente, Seu bosta");
				//TODO Criar segunda parte do Codigo (tudo no Main) (Dentro de um While)
				//TODO Adicionar opções para incrementar e decrementar valores da atual ficha. (Switch)
				//TODO Opção de Visualizar ficha (Switch)
				//TODO Opção de saida. (Break)
			}
		}
		
		while (true) {
			System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Aumentar HP");
            System.out.println("2 - Diminuir HP");
            System.out.println("3 - Aumentar MP");
            System.out.println("4 - Diminuir MP");
            System.out.println("5 - Aumentar XP");
            System.out.println("6 - Diminuir XP");
            System.out.println("7 - Mostrar ficha");
            System.out.println("8 - Sair");
			
            String opcao = sc.next();
            Float modificador = 0f;
            
            //(Perguntar a Elton se eu criasse uma variavel chamada "Modificador" aqui no Main que service para todos os cases se iria deixar o codigo melhor ou iria causar algum problema
            
            switch(opcao) {
            	case "1":
            	System.out.println("Quanto Aumentar o HP?");
            	modificador = sc.nextFloat();
            	ficha.increaseHP(modificador);
            	System.out.println(ficha.viewFicha());
            	break;
            	
            	case "2":
            	System.out.println("Quanto Diminuir o HP?");
            	modificador = sc.nextFloat();
            	ficha.decreaseHP(modificador);
            	System.out.println(ficha.viewFicha());
            	break;
            	
            	case "3":
            	System.out.println("Quanto aumentar o MP?");
            	modificador = sc.nextFloat();
            	ficha.increaseMP(modificador);
            	System.out.println(ficha.viewFicha());
            	break;
            	
            	case "4":
            	System.out.println("Quanto Diminuir o MP?");
            	modificador = sc.nextFloat();
            	ficha.decreaseMP(modificador);
            	System.out.println(ficha.viewFicha());
            	break;
            	
            	case "5":
            	System.out.println("Quanto aumentar o XP?");
            	modificador = sc.nextFloat();
            	ficha.increaseMP(modificador);
            	System.out.println(ficha.viewFicha());
            	break;
            	
            	case "6":
            	System.out.println("Quanto Diminuir o XP?");
            	modificador = sc.nextFloat();
            	ficha.decreaseMP(modificador);
            	System.out.println(ficha.viewFicha());
            	break;
            	
            	case "7":
            	System.out.println(ficha.viewFicha());
            	break;
            	
            	case "8":
            	System.out.println("Saindo...");
            	sc.close();
            	System.exit(0);
            	break;
            	
            	default:
            		System.out.println("Out of Range");
            };
		}
		
		
		
	}	
	
}
