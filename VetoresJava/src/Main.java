import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("VETORES");
        //Deve ser do mesmo tipo
        int[] numeros = new int[3];
        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 2;
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        //OU
        String[] letras = {"A", "B", "C"}; //não precisa informar o tamanho do vetor
        for (int i = 0; i < letras.length; i++)
        {
            System.out.println(letras[i]);
        }
        for (int i = 0; i < letras.length; i++)
        {
            System.out.print(letras[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(letras));
        System.out.println();

         int[] novosNumeros = {9, 10, 12, 25, 2};
         int maior = novosNumeros[0];
         int menor = novosNumeros[0];
         int media = 0;
         for (int i=0; i<novosNumeros.length; i++)
         {
             if (novosNumeros[i] > maior){
                 maior = novosNumeros[i];
             }
             if (novosNumeros[i] < menor) {
             menor = novosNumeros[i];
             }
             media += novosNumeros[i];
         }
         media = media / novosNumeros.length;
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        System.out.println("Media = " + media);
         }
    }
