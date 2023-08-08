public class Piloto {

    // Atributos
    String nome;
    String cpf;
    int numRGANAC;


    public piloto(String nome, String cpf,int numRGANAC){
        this.nome = nome;
        this.cpf = cpf;
        this.numRGANAC = numRGANAC;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public int getNumRGANAC(){
        return getNumRGANAC;
    }
    public void setNumRGANAC(int numRGANAC){
        this.numRGANAC = numRGANAC;
    }
    public  void pilotar() {
        System.out.println("Voar");
    }
}
