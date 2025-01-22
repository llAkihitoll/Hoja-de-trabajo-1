public interface Licuadora {
    void encender(); 
    void apagar(); 
    boolean estaEncendida();
    double llenar(double volumen); 
    int incrementarVelocidad();
    int decrementarVelocidad();
    int consultarVelocidad();
    boolean estarLlena();
    double vaciar();
    double servir(double volumenRestado);
}