
package Hospital;
public class Consulta extends Procedimento {
    private String data;
    private String hora;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    public Consulta( String data , String hora , int numero , String descricao , double valor){
    super( numero , descricao , valor );
    this.data=data;
    this.hora=hora;
    }
    @Override
    public String toString(){
    return"\n data ="+getData()
            + "\n Hora "+getHora();
    }
}
