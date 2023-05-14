package payments_solutions;


public enum Payments_Methods_Enum {
    PIX(5.0, "PIX"),
    CURRENCY(10.0, "CURRENCY");


    private final double valor;
    private final String descricao;

    Payments_Methods_Enum(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }
    public String getDescricao() {
        return this.descricao;
    }
}
