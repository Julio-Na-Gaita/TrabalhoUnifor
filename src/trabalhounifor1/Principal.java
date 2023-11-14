package trabalhounifor1;

public class Principal {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria(true);
        Carro carro = new Carro("Carro A");
        Moto moto = new Moto("Moto B");
        CarroEsportivo carroEsportivo = new CarroEsportivo("Carro Esportivo C");

        // Criar instâncias da classe Pessoa
        Pessoa<Veiculo> pessoa1 = new Pessoa<>("Roberta");
        Pessoa<Veiculo> pessoa2 = new Pessoa<>("Mateus");
        Pessoa<Veiculo> pessoa3 = new Pessoa<>("Marcos");

        // Simular a compra de veículos pelas pessoas
        pessoa1.comprarVeiculo(concessionaria, carro);
        pessoa2.comprarVeiculo(concessionaria, carroEsportivo);
        pessoa3.comprarVeiculo(concessionaria, moto);

        // Exibir os modelos dos veículos comprados por cada pessoa
        System.out.println(pessoa1.getVeiculoComprado().getModelo());
        System.out.println(pessoa2.getVeiculoComprado().getModelo());
        System.out.println(pessoa3.getVeiculoComprado().getModelo());

        Moto moto = new Moto("Honda", "Fan 160", "Vermelha", 2023, "Do tipo flex: Gasolina e alcool");

        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Combustível: " + moto.getCombustivel());

        moto.ligar();
        moto.acelerar();
        moto.freiar();
        moto.desligar();
    }

}
