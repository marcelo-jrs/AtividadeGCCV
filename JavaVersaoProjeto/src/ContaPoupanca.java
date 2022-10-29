import java.util.Date;

public class ContaPoupanca extends ContaComum{

    Date dt_aniversario;

    public ContaPoupanca(Long nro_conta, Date dt_abertura, Date dt_encerramento, int situacao, int senha, double saldo, Date dt_aniversario) {
        super(nro_conta, dt_abertura, dt_encerramento, situacao, senha, saldo);
        this.dt_aniversario = dt_aniversario;
    }

    public Date getDt_aniversario() {
        return dt_aniversario;
    }

    public void setDt_aniversario(Date dt_aniversario) {
        this.dt_aniversario = dt_aniversario;
    }
}
