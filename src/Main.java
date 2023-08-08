public class Main {
    public static void main(String[] args){
        // Construir balões
        Balao b1 = new Balao();
        String resultado = b1.voar();
        System.out.println(resultado);
        Balao b2;
        b2 = new Balao();

        b1.nIdentificação = 10;
        b1.cor = "verde";
        b1.tipo = "pequeno";
        b1.capacidade = 5;
        b1.altura = 1.20;
        b1.porte = "medio";
        b1.peso = 60.00;

        b2.nIdentificação = 15;
        b2.cor = "laranja";
        b2.tipo = "grande";
        b2.capacidade = 10;
        b2.altura = 1.50;
        b2.porte = "grande";
        b2.peso = 90.00;

        //criar objetos do passeio
        Pessoa p1 = new Pessoa();
        Pessoa p2;
        p2 = new Pessoa();


        p1.nome = "Maria Luiza da Silva Araujo";
        p1.cpf = "45454503851";
        p1.rg = "523691518";
        p1.telefone = 11981523675;
        p1.telEmergencia = 11875364947;
        p1.endereco = "Rua Aspásia, 355 - Vila Silviania, Carapicuíba - SP";
        p1.termoRisco = true;

        p2.nome = "Leila Aparecida da Silva Araujo";
        p2.cpf = "12345678901";
        p2.rg = "987654321";
        p2.telefone = 11987462345;
        p2.telEmergencia = 11975694321;
        p2.endereco = "Rua Gelmiro Smaniotto, 61 - Jardim Planalto, Carapicuíba - SP";
        p2.termoRisco = true;

        // Construindo piloto

        Piloto pi1 = new Piloto();


        pi1.nome = "Dimitrio Barros de Araujo";
        pi1.cpf = "54698712376";
        pi1.numRGANAC = 842394;
    }
}