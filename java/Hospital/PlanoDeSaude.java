
package Hospital;
public class PlanoDeSaude {
    private String cnpj;
    private String nome;
    private String contato;
    private Paciente paciente;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public PlanoDeSaude( String cnpj , String nome, String contato , Paciente paciente){
    this.cnpj=cnpj;
    this.contato=contato;
    this.nome=nome;
    this.paciente=paciente;
    }
    public String toString(){
    return"\n Cnpj ="+getCnpj()
            + "\n Contato ="+getContato()
            + "\n Nome ="+getNome()
            + "\n Paciente ="+getPaciente();
    }
}
