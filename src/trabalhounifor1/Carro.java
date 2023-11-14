package trabalhounifor1;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String combustivel;
    private int ano;

    public Carro(String marca, String modelo, String cor, int ano, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void acelerar() {
        System.out.println("Acelerando o carro");
    }

    public void freiar() {
        System.out.println("Freiando o carro");
    }

    public void ligar() {
        System.out.println("Ligando o carro");
    }

    public void desligar() {
        System.out.println("Desligando o carro");
    }
}
