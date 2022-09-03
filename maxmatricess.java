/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Humberto
 */

public class maxmatricess {
    

    public static void main(String[] args) {
        int f1 = 3, c1 = 3;
        int f2 = 3, c2 = 3;
        int[][] Matriz1 = { {1, 0, -1}, {2, -1, 0},{1, 1, -1} };
        int[][] Matriz2 = { {0, -1, 0}, {0, 1, -2},{2, -2, 0}};
        int[][] producto = multiplicaMatrices(Matriz1, Matriz2,f1,c1,c2,f2);
        try{MostrarMatriz(producto);}
        catch (Exception e) {
      System.out.println("No se pudo calcular el producto matricial.");}
        int[][] suma = sumaMatrices(Matriz1,Matriz2,f1,f2,c1,c2);
        try {MostrarMatriz(suma);}
        catch(Exception e){System.out.println("no se pudo calcular la suma");}
        
    }

    public static int[][] multiplicaMatrices(int[][] PrimeraMatriz, int[][] SegundaMatriz, int f1, int c1, int c2,int f2) {
        if (f2!=c1){
            System.out.println("las matrices no conmutan");
            return null;
        }
        int[][] producto = new int[f1][c2];
        for(int i = 0; i < f1; i++) {   
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    producto[i][j] = producto[i][j]+ (PrimeraMatriz[i][k] * SegundaMatriz[k][j]);
                }
            }
        }

        return producto;
    }

    public static void MostrarMatriz(int[][] producto) {
        System.out.println("La matriz resultante es: ");
        for(int[] fila : producto) {
            for (int i : fila) {
                System.out.print(i+ "    ");
            }
            System.out.println();  //esto es un enter nada mas NO BORRAR
        }
    }

    private static int[][] sumaMatrices(int[][] Matriz1, int[][] Matriz2, int f1, int f2, int c1, int c2) {
        if(f1!=f2||c1!=c2){
            System.out.println("Las matrices no se pueden sumar");
        return null;
        }
        int[][]suma = new int[f1][c1];
                for(int i=0;i<f1;i++){
                for (int j=0;j<c1;j++){
                
                suma[i][j]= Matriz1[i][j]+Matriz2[i][j];
                }
                
                
                }
                
        
        return suma;
   
    }
}