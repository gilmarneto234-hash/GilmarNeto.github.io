
package Hospital;
public class Atendente extends Pessoa {
     private int matr;
     private double salario;
     private Consulta consulta;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
     public Atendente( int matr , double salario ,  String cpf , String nome , Consulta consulta){
      super(cpf , nome);
      this.consulta=consulta;
      this.matr=matr;
      this.salario=salario;
     }       
    @Override     
     public String toString(){
     return"\n Matricula do Atendente ="+getMatr()
             + "\n Salario do Atendente ="+getSalario()
             + "\n Consulta marcada pelo Atendente ="+getConsulta();
     }
    }

