class Moto {
    private String marca;
    private String modelo;
    private String cor;
    private String combustivel;
    private int ano;

    public Moto(String marca, String modelo, String cor, int ano, String combustivel) {
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
        System.out.println("Acelerando a moto");
    }
    public void freiar() {
        System.out.println("Freiando a moto");
    }
    public void ligar() {
        System.out.println("Ligando a moto");
    }
    public void desligar() {
        System.out.println("Desligando a moto");
    }


    }

