public class Balao {

    // Atributos
    int id;
    String registro;
    String cor;
    String tipo;
    int capacidade;
    double altura;
    String porte;
    double peso;

    public balao(){}

    public balao(int id, String cor, String tipo, double altura, double peso, String porte, int capacidadedePessoa) {
        this.id = id;
        this.cor = cor;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.porte = porte;
        this.capacidadedePessoa = capacidadedePessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos
    public String voar(){
        return "voando";
    }

}
