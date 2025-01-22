public class LicuadoraEnSi implements Licuadora {
    private boolean encendida;
    private double contenido; // Peso adentro de la licuadora en gramos
    private int velocidad;
    private static final double MAX_GRAMOS = 2000.0; // Maximo de peso
    private static final int MAX_VELOCIDAD = 10; // Velocidad máxima

    public LicuadoraEnSi() {
        this.encendida = false;
        this.contenido = 0.0;
        this.velocidad = 0;
    }

    @Override
    public void encender() {
        if (!encendida) {
            encendida = true;
        }
    }

    @Override
    public void apagar() {
        if (encendida) {
            encendida = false;
            velocidad = 0; // Reinicia la velocidad al apagarla
        }
    }

    @Override
    public boolean estaEncendida() {
        return encendida;
    }