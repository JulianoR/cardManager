/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardmanager;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Universidade Federal do Pampa Graduação: Engenharia de Software Disciplina:
 * Práticas de Desenvolvimento de Software Professor: Wagner de Melo Reck
 * Semestre: 5° - 2012/01
 *
 * @author Juliano Rodovalho & Lucas Capanelli
 * @version 0.1
 */
public class Main_Jogo {

    /**
     * Variáveis que definem as caracteristicas do baralho a ser criado.
     */
    public static int numCartas;
    public static String[] naipes = new String[4];

    /**
     * Main do jogo, responsável por chamar os métodos e definições relevantes
     * como, número de cartas, naipes e chamadas de métodos.
     *
     * @param String[] args
     */
    public static void main(String[] args) {

        /**
         * Criando 4 naipes para o baraho.
         */
        naipes[0] = "Ouros";
        naipes[1] = "Paus";
        naipes[2] = "Copas";
        naipes[3] = "Espadas";

        /**
         * Objeto do tipo Scanner, para a manipulação da entrada do usuário.
         */
        Scanner entradaTeclado = new Scanner(System.in);

        /**
         * Cria uma instância(Objeto) da classe Baralho_Cartas.java, a qual,
         * jutamente com a classe Carta.java, são as bibliotecas.
         */
        Baralho_Cartas baralho = new Baralho_Cartas();

        /**
         * Variaveis locais.
         */
        int opcaoMenu;
        boolean continua = true;
        //   boolean testeNCarta = true;

        /**
         * Try contra Trolls...
         */
        try {

            System.out.println(" Bem Vindo ao CardManager! \n Aqui você podera Criar e Manipular um baralho simples de cartas! \n Informe a baixo sua preferências. \n");

            while (true) {

                System.out.print(" Informe o número de Cartas do Baralho: ");
                numCartas = entradaTeclado.nextInt();

                /**
                 * Verifica entradas válidas para o número de Cartas no Baralho.
                 */
                if (numCartas < 1) {
                    System.out.print(">>> ERRO: Número inválido de cartas! <<< \n --> Informe um número Inteiro Positivo! \n \n");
                    continue;

                } else {
                    break;
                }
            }

            /**
             * Chamada do construtor da biblioteca Baralho_Cartas, enviando as
             * informações básicas para a criação do baralho.
             */
            baralho.Baralho_Cartas(numCartas, naipes);


            while (continua) {

                System.out.println("\n--------------------------------\nMenu - Opções: \n 1 - Mostra número de Cartas. || 2 - Embaralhar. \n "
                        + "3 - Cortar Baralho(2 partes iguais). || 4 - Retirar Carta do Início. \n "
                        + "5 - Retirar Carta do Final. || 6 - Mover Carta do Início para o Fim. \n"
                        + " 7 - Mostar Baralho. || 8 - Sair do Jogo. \n--------------------------------");
                System.out.print("Escolha uma opção do Menu: ");
                opcaoMenu = entradaTeclado.nextInt();

                switch (opcaoMenu) {

                    case 1:
                        System.out.println("\n -- Número de Cartas no Baralho: " + baralho.getNumCartas());
                        break;

                    case 2:
                        baralho.embaralha();
                        System.out.println("\n -- Embaralhado! ");
                        break;

                    case 3:
                        baralho.cortarBaralho();
                        System.out.println("\n -- Corte realizado! ");
                        break;

                    case 4:
                        System.out.println("\n -- Carta do início: " + baralho.retirarCartaInicio());
                        break;

                    case 5:
                        System.out.println("\n -- Carta do Final: " + baralho.retirarCartaFim());
                        break;

                    case 6:
                        baralho.moveCartaIniFim();
                        System.out.println("\n -- Carta movida do Início para o Fim! ");
                        break;

                    case 7:
                        baralho.getBaralho();
                        break;

                    case 8:
                        System.out.println("\n === FIM DO JOGO! ===");
                        continua = false;
                        break;

                    default:
                        System.out.println(">>> ERRO: Esta não é uma Opção Válida! <<< \n --> Tente novamente, seguindo as opções do MENU!");

                }
            }
        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "Pow Usuário, Deixa de ser Troll ¬¬  \n \n " + error);

        }
    }
}
