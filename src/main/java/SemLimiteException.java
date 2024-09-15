public class SemLimiteException extends Exception{
    SemLimiteException(){
        super("Erro. Valor excede o limite da conta");
    }
}
