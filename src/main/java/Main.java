import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Cliente joao = new PessoaFisica("João", "Av. Antonio Carlos, 6627",
                                        new Date(), "111.111.111-11", 36, 'm');

        Cliente matheus = new PessoaFisica("Matheus", "Av. Antonio Carlos, 6627",
                new Date(), "111.111.111-11", 17, 'm');

        Cliente alex = new PessoaFisica("Alex", "Av. Antonio Carlos, 6627",
                new Date(), "111.111.111-11", 36, 'm');


        Conta contaJoao = new ContaCorrente(1234, joao, 100, 50);

        Conta contaMatheus = new ContaCorrente(5678, matheus, 1000, 1500);

        //Questão 1

        try {
            contaMatheus.salvarConta();
        }catch(IOException e){
            System.out.println("Erro ao salvar conta: "+ e.getMessage());
        }

        try {
            contaJoao.salvarConta();
        }catch(IOException e){
            System.out.println("Erro ao salvar conta: "+ e.getMessage());
        }

        //Questão 2

        try {
            Conta contaLida1 = Conta.lerConta(1, 1234);
            System.out.println(contaLida1.toString());
        }catch (IOException e){
            System.out.println("Erro ao ler conta" + e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println("Erro. não foi possível achar a classe dessa conta" + e.getMessage());
        }

        try {
            Conta contaLida2 = Conta.lerConta(1, 5678);
            System.out.println(contaLida2.toString());
        }catch (IOException e){
            System.out.println("Erro ao ler conta" + e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println("Erro. não foi possível achar a classe dessa conta" + e.getMessage());
        }



    }
}
