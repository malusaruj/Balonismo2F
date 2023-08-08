public class Pessoa {

    //Atributos
    String nome;
    String cpf;
    int rg;
    int telefone;
    int telEmergencia;
    String endereco;
    public pessoa(String nome, String cpf, int rg, int telefone, int telEmergencia, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        Telefone = telefone;
        TelEmergencia = telEmergencia;
        Endereco = endereco;
    }
    public Nome gerarNome(){
        Nome p1 =  new Nome();
        return p1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelEmergencia() {
        return telEmergencia;
    }

    public void setTelEmergencia(int telEmergencia) {
        this.telEmergencia = telEmergencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //Métodos
    public void voa() {System.out.println("Pessoa Viaja"); }

    public void voa(String pessoa_viaja) {
    }
}
