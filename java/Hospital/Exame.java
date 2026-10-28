
package Hospital;
public class Exame extends Procedimento {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public Exame( String data, int numero , String descricao , double valor){
    super(numero , descricao , valor);
    this.data=data;
    }
    @Override
    public String toString(){
    return"\n data ="+getData();
    }
}