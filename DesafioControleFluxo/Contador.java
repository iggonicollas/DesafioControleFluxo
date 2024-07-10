package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        final int parametroUm = terminal.nextInt();

        int parametroDois = 0;
        boolean parametrosValidos = false;
        
        while (!parametrosValidos) {
            System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();
            
            try {
                
                contar(parametroUm, parametroDois);
                parametrosValidos = true; 
            } catch (ParametrosInvalidosException exception) {                
                System.out.println("O segundo parâmetro deve ser maior que o primeiro. Por favor, tente novamente.");
            }
        }

        terminal.close();
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {        
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametroDois - parametroUm;        
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i + " = " + parametroUm++);
        }
    }
}
