package Application;

import Abstraction.Abstract.AbstracaoTamanho;
import Abstraction.Conrete.TamanhoFamilia;
import Abstraction.Conrete.TamanhoGrande;
import Abstraction.Conrete.TamanhoMedio;
import Abstraction.Conrete.TamanhoPequeno;
import Implementation.Abstract.ImplementacaoRefrigerante;
import Implementation.Concrete.CocaCola;
import Implementation.Concrete.Fanta;
import Implementation.Concrete.Guarana;

import java.util.Scanner;

/**
 * Padrão Bridge, serve para desacomplar/diferenciar a abstração de sua implementação
 * Esse é meio chato. Vamos lá
 * Criaremos o conteúdo normal das classes concretas que estamos lidando (Abstração), porém iremos se parar
 * suas ações/metodos (Implementação)
 * Ex:
 * Independente de qualquer plataforma de computador, teremos janelas, botoes, barras e etc. (Implementação)
 * Basta codificarmos as diversas implementações para qualquer windows/linux/mac (Abstração) quisermos.
 * Independente de qualquer refri, qualquer bife ou molho (Implementaçõa)
 * Codificaremos as comidas (Abstrações) que TERÃO a implementação.
 */
public class App {

    private static String coletaRefri(){
        Scanner in = new Scanner(System.in);
        String resposta = "";
        while (true){
            System.out.println("Escolha um sabor de refrigerante");
            System.out.println("1 - CocaCola");
            System.out.println("2 - Guaraná");
            System.out.println("3 - Fanta");
            resposta = in.nextLine();
            return resposta;
        }
    }

    private static String coletaTamanho(){
        Scanner in = new Scanner(System.in);
        String resposta = "";
        while (true){
            System.out.println("Escolha o tamanho do refrigerante");
            System.out.println("1 - Pequeno");
            System.out.println("2 - Médio");
            System.out.println("3 - Grande");
            System.out.println("4 - Família");
            resposta = in.nextLine();
            return resposta;
        }
    }

    private static void close(){
        System.out.println("=============Fim=============");
    }

    private static void start(){
        System.out.println("==========Bem vindo==========");
    }

    private static void fazPedido(String saborRefri, String tamanhoRefri){
        ImplementacaoRefrigerante refri = null;
        AbstracaoTamanho tamanho;

        switch (saborRefri){
            case "1":
                refri = new CocaCola();
                break;
            case "2":
                refri = new Guarana();
                break;
            case "3":
                refri = new Fanta();
                break;
                default:
                    System.out.println("erro");
        }

        switch (tamanhoRefri){
            case "1":
                tamanho = new TamanhoPequeno(refri);
                tamanho.beber();
                break;
            case "2":
                tamanho = new TamanhoMedio(refri);
                tamanho.beber();
                break;
            case "3":
                tamanho = new TamanhoGrande(refri);
                tamanho.beber();
                break;
            case "4":
                tamanho = new TamanhoFamilia(refri);
                tamanho.beber();
                break;
                default:
                    System.out.println("erro");
        }
    }

    public static void main(String[] args) {
        String refri = "";
        String tamanho = "";

        App.start();
        refri = App.coletaRefri();
        tamanho = App.coletaTamanho();

        App.fazPedido(refri, tamanho);
        App.close();

    }
}
