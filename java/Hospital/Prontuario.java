
package Hospital;
public class Prontuario {
  private int numero;
  private Procedimento procedimento;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }
  public Prontuario( int numero , Procedimento procedimento){
  this.numero=numero;
  this.procedimento=procedimento;
  }
  @Override
  public String toString(){
  return"\n Numero ="+getNumero()
          + "\n Procedimento ="+getProcedimento();
  }
}
