public class PessoaJuridica extends Pessoa{

    Long cnpj_pessoa;

    public PessoaJuridica(String nom_pessoa, String end_pessoa, Long cep_pessoa, String tel_pessoa, double renda_pessoa, int sit_pessoa, Long cnpj_pessoa) {
        super(nom_pessoa, end_pessoa, cep_pessoa, tel_pessoa, renda_pessoa, sit_pessoa);
        this.cnpj_pessoa = cnpj_pessoa;
    }

    public Long getCnpj_pessoa() {
        return cnpj_pessoa;
    }

    public void setCnpj_pessoa(Long cnpj_pessoa) {
        this.cnpj_pessoa = cnpj_pessoa;
    }
}
