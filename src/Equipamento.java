public class Equipamento {
    private int estado;

    public void ligar(){
        this.estado=1;
    }
    public void desligar(){
        this.estado=0;
    }
    public void mostrarEstado(){
        if this.estado==1 {
            System.out.println("ligada");
        } else {
            System.out.println("Desligada")
        }
    }

    /*Construtores*/

    public Equipamento(int estado) {
        this.estado = estado;
    }

    /*Getters e Setters*/

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
