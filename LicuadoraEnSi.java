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
    
    @Override
    public double llenar(double gramos) {
        if (gramos <= 0) {
            return -1; // Error: peso no válido
        }
        if (contenido + gramos > MAX_GRAMOS) {
            return -2; // Error: pasa la capacidad máxima
        }
        contenido += gramos;
        return contenido; // Muestra el peso actual
    }

    @Override
    public int incrementarVelocidad() {
        if (!encendida) {
            return -1; // No se puede cambiar la velocidad si está apagada
        }
        if (velocidad < MAX_VELOCIDAD) {
            velocidad++;
            return velocidad;
        }
        return -2; // Ya está en la velocidad máxima
    }

    @Override
    public int decrementarVelocidad() {
        if (!encendida) {
            return -1; // No se puede cambiar la velocidad si está apagada
        }
        if (velocidad > 0) {
            velocidad--;
            return velocidad;
        }
        return -2; // Ya está en la velocidad mínima
    }

    @Override
    public int consultarVelocidad() {
        return velocidad;
    }

    @Override
    public boolean estarLlena() {
        return contenido >= MAX_GRAMOS;
    }

    @Override
    public double vaciar() {
        double gramosVaciados = contenido;
        contenido = 0.0;
        return gramosVaciados;
    }

    @Override
    public double servir(double gramosRestados) {
        if (gramosRestados <= 0 || gramosRestados > contenido) {
            return -1;
        }
        contenido -= gramosRestados;
        return contenido; // Devuelve el peso que queda
    }
}