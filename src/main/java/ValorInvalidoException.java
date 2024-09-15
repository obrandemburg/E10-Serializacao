public class ValorInvalidoException extends Exception{
    ValorInvalidoException(){
        super("Erro. Valor excede o saldo da conta");
    }
}
