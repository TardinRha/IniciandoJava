// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        String nome = "Nome";
        saudacao(nome);
        int a= 5;
        int b= a + 2;
        int resultado = soma(a, b); // ou soma(a=5, b=a+2)
        System.out.println(resultado);
    }

    //metodos
    public static void saudacao(String nome)
    {
        System.out.println("Hello, " + nome);
    }
    public static int soma(int a, int b)
    {
        return a+b;
    }
}