import java.util.Date;

public class ContaEspecial extends ContaComum{

    double limite_conta;

    public ContaEspecial(Long nro_conta, Date dt_abertura, Date dt_encerramento, int situacao, int senha, double saldo, double limite_conta) {
        super(nro_conta, dt_abertura, dt_encerramento, situacao, senha, saldo);
        this.limite_conta = limite_conta;
    }

    public double getLimite_conta() {
        return limite_conta;
    }

    public void setLimite_conta(double limite_conta) {
        this.limite_conta = limite_conta;
    }
}
