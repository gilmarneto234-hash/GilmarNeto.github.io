
package Hospital;
public class Medicamento {
    private String nome;
    private double dosagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }
    public Medicamento(String nome , double dosagem){
    this.dosagem=dosagem;
    this.nome=nome;
    }
    public String toString(){
    return"\n Nome do Medicamento ="+getNome()
            + "\n Dosagem do Medicamento ="+getDosagem();
    }
}
