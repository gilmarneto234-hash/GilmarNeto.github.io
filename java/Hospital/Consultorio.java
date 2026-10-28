
package Hospital;
public class Consultorio {
    private int numero;
    private String localizacao;
    private Consulta consulta;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public Consultorio( int numero ,  String localizacao , Consulta consulta){
    this.consulta=consulta;
    this.localizacao=localizacao;
    this.numero=numero;
    }
    @Override
    public String toString(){
    return"\n Numero do Consultorio ="+getNumero()
            + "\n Localizacao ="+getLocalizacao()
            + "\n Consulta Marcada ="+getConsulta();
    }
}
