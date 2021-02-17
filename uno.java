/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.Scanner;

/**
 *
 * @author FELIX
 */
public class uno {
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        //variables
        int notas[];
        int nElem;
        int sumPar;
        int sumImp;
        
        //solicitamos n elementos
        System.out.println("Ingrese la cantidad de elementos para el vector");
        nElem = leer.nextInt();
        
        //inicializamo el vector
        notas = new int[nElem];
        sumPar = 0;
        sumImp = 0;
        
        //procedimientos
        llenaVect(nElem, notas, sumPar, sumImp);//llenar vector
        impriVect(nElem, notas);//mostrar vector
    }
    
    public static void llenaVect(int nElem, int notas[], int sumPar, int sumImp) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 20) + 1;
            
            if (notas[i] % 2 == 0) {
                sumPar = sumPar + notas[i];
            } else {
                sumImp = sumImp + notas[i];
            }          
        }
        System.out.println("La suma de los numeros pares es:" + sumPar);
        System.out.println("La suma de los numeros impares es:" + sumImp);
    }
    
    public static void impriVect(int nElem, int notas[]) {
        for (int i = 0; i < nElem ; i++) {
            System.out.println("Notas [" + i + "] = " + notas[i]);
        }
    }
}
