import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String nome = "Rhaissa";
        System.out.println("Hello and welcome " + nome + "!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        int a = 3;
        int b = 2;
        int soma = a+b;
        int subtracao = a-b;
        double divisao = (double) a/b; //cast

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);

        boolean fimDeSemana = true;
        //se fimDeSemana for true escrever tal, caso contrario escrever tal
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
        System.out.println();
        System.out.println("Exemplo if-else");
        int nota = 30;
        char classificacaoNota;
        if (nota >= 90)
        {
            classificacaoNota = 'A';
            System.out.println("Aluno aprovado com honras!");
        }
        else if (nota >= 70 && nota < 90)
        {
            classificacaoNota = 'B';
            System.out.println("Aluno aprovado!");
        } else if (nota >= 50 && nota < 70)
        {
            classificacaoNota = 'C';
            System.out.println("Aluno em recuperação.");
        } else
        {
            classificacaoNota = 'D';
            System.out.println("Aluno não aprovado.");
        }
        nota = 0;
        System.out.println("Exemplo switch-case");
        switch (classificacaoNota){
            case 'A':
            case 'B':
                System.out.println("PARABÉNS! VOCÊ SE ESFORÇOU E CONSEGUIU!");
                break;
            case 'C':
            case 'D':
                System.out.println("Estude mais da próxima vez!");
        }
        System.out.println();
        System.out.println();
        nome = "Rhaissa";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println("quantidade de caracteres do nome: " + nome.length());
        String outroNome = "rhaissa";
        System.out.println(nome.equals(outroNome)); //compara uma variável com a outra
        System.out.println(nome.equalsIgnoreCase(outroNome)); //compara uma variável com a outra ignorando se maiusculo ou minusculo
        // declarei import java.time.LocalDate; do lado de fora igual o using em C#
        // declarei import java.util.Locale;
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek()); //dia da semana
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12)
        {
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18)
        {
            saudacao = "Boa tarde";
        }
        else { saudacao = "Boa noite"; }
        System.out.println(saudacao + ", " + nome + ". Hoje é " + diaSemana + ".");
        //outro jeito:
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toLowerCase());
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}