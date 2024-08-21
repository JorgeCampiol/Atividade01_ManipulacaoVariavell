public class Main {
    public static void main(String[] args) {
//
        int idade = 22;
        double altura = 1.71;
        String nome = "Jorge";
        boolean Estudante = true;

        //Operação SIMPLES
        int idade2 = 30;
        int somaIdade = idade + idade2;
        double alturaDplicada = altura * 2;
        String saudacao = "ola," + nome + "!";

        //resultado
        System.out.println(saudacao);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Idade2: " + idade2);
        System.out.println("Soma Idade: " + somaIdade);
        System.out.println("Nome: " + nome);
        System.out.println("Estudante: " + Estudante);

    }
}