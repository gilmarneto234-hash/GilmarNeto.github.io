
package Hospital;
public class Medico extends Pessoa {
     private String crm;
     private String especialidade;
     private Exame exame;
     private Medicacao medicacao;
     private Consulta consulta;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Medicacao getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(Medicacao medicacao) {
        this.medicacao = medicacao;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public Medico( String crm , String especialidade , String cpf , String nome , Exame exame , Consulta consulta , Medicacao medicacao){
    super(cpf, nome);
    this.crm=crm;
    this.consulta=consulta;
    this.especialidade=especialidade;
    this.exame=exame;
    this.medicacao=medicacao;
    }
    @Override
    public String toString(){
    return"\n Crm do Medico ="+getCrm()
            + "\n Consulta ="+getConsulta()
            + "\n Especialidade ="+getEspecialidade()
            + "\n Exame ="+getExame()
            + "\n Medicacao ="+getMedicacao();
    }
}
