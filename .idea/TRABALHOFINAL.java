import java.util.Scanner;

public class TRABALHOFINAL {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

String produto1,produto2,produto3,produto4,produto5,produto6,produto7,produto8,produto9,produto10;
float precoCusto1,precoCusto2,precoCusto3,precoCusto4,precoCusto5,precoCusto6,precoCusto7,precoCusto8,precoCusto9,precoCusto10;
int opcoes;

//ENTRADA DE DADOS

    System.out.println("Cadastre o produto 1 :");
    produto1=input.nextLine();
    System.out.println("Cadastre o valor de custo do produto 1:");
    precoCusto1= Float.parseFloat(input.nextLine());
    
    System.out.println("Cadastre o produto 2 :");
    produto2=input.nextLine();
    System.out.println("Cadastre o valor de custo do produto 2:");
    precoCusto2= Float.parseFloat(input.nextLine());
    
    System.out.println("Cadastre o produto 3 :");
    produto3=input.nextLine();
    System.out.println("Cadastre o valor de custo do produto 3:");
    precoCusto3= Float.parseFloat(input.nextLine());
    
    System.out.println("Cadastre o produto 4 :");
    produto4=input.nextLine();
    System.out.println("Cadastre o valor de custo do produto 4:");
    precoCusto4= Float.parseFloat(input.nextLine());
    
    System.out.println("Cadastre o produto 5 :");
    produto5=input.nextLine();
    System.out.println("Cadastre o valor de custo do produto 5:");
    precoCusto5= Float.parseFloat(input.nextLine());
    
    System.out.println("Cadastre o produto 6 :");
    produto6=input.nextLine();
    System.out.println("Cadastre o valor de custo do produto 6:");
    precoCusto6= Float.parseFloat(input.nextLine());
    
    System.out.println("Cadastre o produto 7 :");
    produto7=input.nextLine();
    System.out.println("Cadastre o valor de custo do produto 7:");
    precoCusto7= Float.parseFloat(input.nextLine());
    
    System.out.println("Cadastre o produto 8 :");
    produto8=input.nextLine();
    System.out.println("Cadastre o valor de custo do produto 8:");
    precoCusto8= Float.parseFloat(input.nextLine());
    
    System.out.println("Cadastre o produto 9 :");
    produto9=input.nextLine();
    System.out.println("Cadastre o valor de custo do produto 9:");
    precoCusto9= Float.parseFloat(input.nextLine());
    
    System.out.println("Cadastre o produto 10 :");
    produto10=input.nextLine();
    System.out.println("Cadastre o valor de custo do produto 10:");
    precoCusto10= Float.parseFloat(input.nextLine());
    
    System.out.println("Selecione o uma das opçoes "
            + " 1-VENDA DE PRODUTO"
            + " 2- REPOSIcaO DE ESTOQUE"
            + " 3-RELATORIO DE ESTOQUE"
            + " 4-RELATORIO DE VENDAS"
            + " 5-SAIR");
    opcoes=Integer.parseInt(input.nextLine());
    
//Processamento

}}