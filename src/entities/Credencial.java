package entities;

public class Credencial {
    private int nivel;
    private int saldoAcreditado;

    public Credencial(int nivel){
        this.nivel = nivel;
    }

    public void setSaldoAcreditado(int saldo)
    {
        this.saldoAcreditado = saldo;
    }
    public int getNivel() {return nivel;}
    public int getSaldoAcreditado() {return saldoAcreditado;}
}



