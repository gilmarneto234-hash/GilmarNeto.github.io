
package Hospital;

public class Medicacao extends Procedimento {
    private String finalidade;
    private double dosagem;
    private Medicamento medicamento;

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    public Medicacao( String finalidade , double dosagem ,   int numero , String descricao , double valor , Medicamento medicamento){
    super(numero,descricao ,valor);
    this.dosagem=dosagem;
    this.finalidade=finalidade;
    this.medicamento=medicamento;
    }
    @Override
    public String toString(){
    return"\n Finalidade do Medicamento ="+getFinalidade()
            + "\n Dosagem do Medicamento ="+getDosagem()
            + "\n Medicamento ="+getMedicamento();
    }
}
