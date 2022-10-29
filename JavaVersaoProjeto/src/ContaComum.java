import java.util.Date;

public class ContaComum {

    Long nro_conta;
    Date dt_abertura;
    Date dt_encerramento;
    int situacao;
    int senha;
    double saldo;

    public ContaComum(Long nro_conta, Date dt_abertura, Date dt_encerramento, int situacao, int senha, double saldo) {
        this.nro_conta = nro_conta;
        this.dt_abertura = dt_abertura;
        this.dt_encerramento = dt_encerramento;
        this.situacao = situacao;
        this.senha = senha;
        this.saldo = saldo;
    }

    public Long getNro_conta() {
        return nro_conta;
    }

    public void setNro_conta(Long nro_conta) {
        this.nro_conta = nro_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public Date getDt_abertura() {
        return dt_abertura;
    }

    public void setDt_abertura(Date dt_abertura) {
        this.dt_abertura = dt_abertura;
    }

    public Date getDt_encerramento() {
        return dt_encerramento;
    }

    public void setDt_encerramento(Date dt_encerramento) {
        this.dt_encerramento = dt_encerramento;
    }
}
