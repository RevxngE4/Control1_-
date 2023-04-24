import java.util.ArrayList;
import java.util.Iterator;
public class Inventario {
    private ArrayList vehiculos;

    public Inventario(){
        vehiculos = new ArrayList();
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    public Vehiculo buscarVehiculo(String modelo){
        for (Iterator i = vehiculos.iterator(); i.hasNext();) {
            Vehiculo vehiculo = (Vehiculo) i.next();
            if (vehiculo.getModelo().equalsIgnoreCase(modelo)) {
                return vehiculo;
            }
        }
        return null;
    }
    public ArrayList buscarVehiculosPorModelo(String Modelo){
        ArrayList resultados = new ArrayList();
        for (Iterator i = vehiculos.iterator(); i.hasNext();){
            Vehiculo vehiculo = (Vehiculo)i.next();
            if (vehiculo.getModelo().equalsIgnoreCase(Modelo)){
                resultados.add(vehiculo);
            }
        }
        return resultados;
    }
    public ArrayList buscarVehiculosTipoMotor(String TipoMotor){
        ArrayList resultados = new ArrayList();
        for (Iterator i = vehiculos.iterator(); i.hasNext();){
            Vehiculo vehiculo = (Vehiculo)i.next();
            if (vehiculo.getTipoMotor().equalsIgnoreCase(TipoMotor)){
                resultados.add(vehiculo);
            }
        }
        return resultados;
    }

    public ArrayList buscarVehiculosTipoCuerpo(String TipoCuerpo){
        ArrayList resultados = new ArrayList();
        for (Iterator i = vehiculos.iterator(); i.hasNext();){
            Vehiculo vehiculo = (Vehiculo) i.next();
            if (vehiculo.getTipoCuerpo().equalsIgnoreCase(TipoCuerpo)){
                resultados.add(vehiculo);
            }
        }
        return resultados;
    }
    public ArrayList buscarVehiculosTransmision(String TipoTransmision){
        ArrayList resultados = new ArrayList();
        for (Iterator i = vehiculos.iterator(); i.hasNext();){
            Vehiculo vehiculo = (Vehiculo) i.next();
            if (vehiculo.getTransmision().equalsIgnoreCase(TipoTransmision)){
                resultados.add(vehiculo);
            }
        }
        return resultados;
    }
    public ArrayList buscarVehiculosColor(String Color){
        ArrayList resultados = new ArrayList();
        for (Iterator i = vehiculos.iterator(); i.hasNext();){
            Vehiculo vehiculo = (Vehiculo) i.next();
            if (vehiculo.getColor().equalsIgnoreCase(Color)){
                resultados.add(vehiculo);
            }
        }
        return resultados;
    }
    public ArrayList buscarCochesPorPrecio(double precioMin, double precioMax) {
        ArrayList resultados = new ArrayList();
        for (Iterator i = vehiculos.iterator(); i.hasNext();) {
            Vehiculo vehiculo = (Vehiculo) i.next();
            if (vehiculo.getPrecio() >= precioMin && vehiculo.getPrecio() <= precioMax) {
                resultados.add(vehiculo);
            }
        }
        return resultados;
    }
    public ArrayList buscarCochesPorVelocidad(double velocidad) {
        ArrayList resultados = new ArrayList();
        for (Iterator i = vehiculos.iterator(); i.hasNext();) {
            Vehiculo vehiculo = (Vehiculo) i.next();
            if (vehiculo.getVelocidad() == velocidad) {
                resultados.add(vehiculo);
            }
        }
        return resultados;
    }


}
