import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Vehiculo veh1 = new Vehiculo("Sedan", "Gasolina", "automatica", "Amarillo", "Toyota", 25000,50);
        Vehiculo veh2 = new Vehiculo("Coupe", "Diesel", "manual", "Rojo", "Volkswagen", 22000, 90);
        Vehiculo veh3 = new Vehiculo("Sedan", "Diesel", "automática", "Negro", "Volkswagen", 24000, 70);
        Vehiculo veh4 = new Vehiculo("Coupe", "Diesel", "automática", "Blanco", "Toyota", 25000, 60);
        Vehiculo veh5 = new Vehiculo("Coupe", "Gasolina", "automática", "Verde", "Volkswagen", 56000,50);

        Inventario inventario = new Inventario();
        inventario.agregarVehiculo(veh1);
        inventario.agregarVehiculo(veh2);
        inventario.agregarVehiculo(veh3);
        inventario.agregarVehiculo(veh4);
        inventario.agregarVehiculo(veh5);


        List invenVehiculosCuerpo = (List) inventario.buscarVehiculosTipoCuerpo("Coupe");
        for(Object vehObj : invenVehiculosCuerpo){
            Vehiculo vehiculo = (Vehiculo) vehObj;
            System.out.println(vehiculo.getDescripcion()+ " - " + vehiculo.getPrecio());
        }
        System.out.println();
        List invenVehiculosTransmision = (List) inventario.buscarVehiculosTransmision("manual");
        for(Object vehObj : invenVehiculosTransmision){
            Vehiculo vehiculo = (Vehiculo) vehObj;
            System.out.println(vehiculo.getDescripcion()+ " - " + vehiculo.getPrecio());
        }
        //b
        System.out.println();
        List invenVehiculosVelocidad = (List) inventario.buscarCochesPorVelocidad(50);
        for(Object vehObj : invenVehiculosVelocidad){
            Vehiculo vehiculo = (Vehiculo) vehObj;
            System.out.println(vehiculo.getDescripcion()+ " - " + vehiculo.getPrecio());
        }
        //c






    }
}