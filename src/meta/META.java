/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meta;

import clientebiblioteca.Painel;
import java.util.Scanner;

/**
 *
 * @author trabalho
 */
public class META {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Painel.conectar();

        //guia1Atvd1();
        //guia1Atvd2();
        //guia2Atvd1();
        //guia3Atvd1();
        guia3Atvd2();
        
        demonstracao();
        

        Painel.desconectar();
    }

    public static void demonstracao(){
        
        
    }
    
    public static void guia1Atvd1() {
        Scanner ent = new Scanner(System.in);

        System.out.print("Entre com o nome: ");
        String nome = ent.next();

        Painel.escrever(Painel.Display.D1, nome);
        Painel.Ler(Painel.Chave.C1);
        
        //Painel.
        
    }

    public static void guia1Atvd2() {
        Scanner ent = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        int n1 = ent.nextInt();
        System.out.print("Entre com o segundo número: ");
        int n2 = ent.nextInt();

        int soma = n1 + n2;

        Painel.escrever(Painel.Display.D1, soma);

    }

    public static void guia2Atvd1() {

        boolean estadoC1 = Painel.Ler(Painel.Chave.C1);
        boolean estadoC2 = Painel.Ler(Painel.Chave.C2);
        boolean estadoC3 = Painel.Ler(Painel.Chave.C3);
        boolean estadoC4 = Painel.Ler(Painel.Chave.C4);

        if (estadoC1 == true) {
            Painel.ligar(Painel.Led.L1);
        }

        if (estadoC2 == true) {
            Painel.ligar(Painel.Led.L2);
        }

        if (estadoC3 == true) {
            Painel.ligar(Painel.Led.L3);
        }

        if (estadoC4 == true) {
            Painel.ligar(Painel.Led.L4);
        }

    }

    public static void guia3Atvd1() {

        Scanner ent = new Scanner(System.in);

        System.out.print("Entre com o número do led a ser acesso/apagado: ");
        int num = ent.nextInt();

        while (num < 5 && num > 0) {
            boolean estadoL1 = Painel.Ler(Painel.Led.L1);
            boolean estadoL2 = Painel.Ler(Painel.Led.L2);
            boolean estadoL3 = Painel.Ler(Painel.Led.L3);
            boolean estadoL4 = Painel.Ler(Painel.Led.L4);

            if (num == 1) {
                if (estadoL1 == false) {
                    Painel.ligar(Painel.Led.L1);
                } else {
                    Painel.desligar(Painel.Led.L1);
                }
            } else if (num == 2) {
                if (estadoL2 == false) {
                    Painel.ligar(Painel.Led.L2);
                } else {
                    Painel.desligar(Painel.Led.L2);
                }
            } else if (num == 3) {
                if (estadoL3 == false) {
                    Painel.ligar(Painel.Led.L3);
                } else {
                    Painel.desligar(Painel.Led.L3);
                }
            } else if (num == 4) {
                if (estadoL4 == false) {
                    Painel.ligar(Painel.Led.L4);
                } else {
                    Painel.desligar(Painel.Led.L4);
                }
            }

            System.out.print("Entre com o número do led a ser acesso/apagado: ");
            num = ent.nextInt();
        }

    }

    public static void guia3Atvd2() {
        while (true) {
            boolean estadoC1 = Painel.Ler(Painel.Chave.C1);
            boolean estadoC2 = Painel.Ler(Painel.Chave.C2);
            boolean estadoC3 = Painel.Ler(Painel.Chave.C3);
            boolean estadoC4 = Painel.Ler(Painel.Chave.C4);

            if (estadoC1 == true) {
                Painel.ligar(Painel.Led.L1);
            } else {
                Painel.desligar(Painel.Led.L1);
            }

            if (estadoC2 == true) {
                Painel.ligar(Painel.Led.L2);
            } else {
                Painel.desligar(Painel.Led.L2);
            }

            if (estadoC3 == true) {
                Painel.ligar(Painel.Led.L3);
            } else {
                Painel.desligar(Painel.Led.L3);
            }

            if (estadoC4 == true) {
                Painel.ligar(Painel.Led.L4);
            } else {
                Painel.desligar(Painel.Led.L4);
            }

            double estadoS1 = Painel.Ler(Painel.Sensor.S1);
            double estadoS2 = Painel.Ler(Painel.Sensor.S2);
            
            Painel.escrever(Painel.Display.D1, "D1: "+estadoS1+"         D2: "+estadoS2);
            
        }
    }
}
