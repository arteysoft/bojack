package edu.it;

public class EjercicioCollatz {
    public void collatz(int numero){
        for (;numero > 1; numero = getResultado(numero));
    }

    private int getResultado(int numero) {
        return esPar(numero) ? (numero / 2) : (numero * 3) + 1;
    }

    private Boolean esPar(int numero) {
        return (numero % 2 == 0);
    }

    private Boolean esImpar(int numero) {
        return !esPar(numero);
    }
}
