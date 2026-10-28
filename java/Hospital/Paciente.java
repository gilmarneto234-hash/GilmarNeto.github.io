
package Hospital;
public class Paciente extends Pessoa {
    private String endereco;
    private String telefone;
    private Exame exame;
    private Medicacao medicacao;
    private Consulta consulta;
    private Prontuario prontuario;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
      public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }
    
   public Paciente( String endereco , String telefone ,String cpf , String nome , Prontuario prontuario,Exame exame , Consulta consulta , Medicacao medicacao ){
   super(cpf,nome);
   this.consulta=consulta;
   this.endereco=endereco;
   this.exame=exame;
   this.medicacao=medicacao;
   this.telefone=telefone;
   this.prontuario=prontuario;
   
   }    
   @Override
   public String toString(){
   return"\n Consulta ="+getConsulta()
           + "\n Endereco ="+getEndereco()
           + "\n Exame ="+getExame()
           + "\n Medicacao ="+getMedicacao()
           + "\n Telefone ="+getTelefone()
           +"\n Prontuario ="+getProntuario();
   }
}
