public class Vehiculo {
    private String TipoCuerpo;
    private String TipoMotor;
    private String Transmision;
    private String Color;
    private String Modelo;
    private double Precio;
    private double Velocidad;

    public Vehiculo(String TipoCuerpo, String TipoMotor, String Transmision, String Color, String Modelo, double Precio, double Velocidad){
        this.TipoCuerpo = TipoCuerpo;
        this.TipoMotor = TipoMotor;
        this.Transmision = Transmision;
        this.Color = Color;
        this.Modelo = Modelo;
        this.Precio = Precio;
        this.Velocidad = Velocidad;
    }

    public String getTipoCuerpo() {
        return TipoCuerpo;
    }

    public void setTipoCuerpo(String tipoCuerpo) {
        TipoCuerpo = tipoCuerpo;
    }

    public String getTipoMotor() {
        return TipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        TipoMotor = tipoMotor;
    }

    public String getTransmision() {
        return Transmision;
    }

    public void setTransmision(String transmision) {
        Transmision = transmision;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }
    public String getDescripcion() {
        return Modelo + " - " + TipoCuerpo + " - " + TipoMotor + " - " + Transmision + " - " + Color + " - " + Velocidad;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double velocidad) {
        Velocidad = velocidad;
    }
}
