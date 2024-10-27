package PuntoBonusTrack;

import java.util.ArrayList;

/**
 * Desarrolle un main e invoque únicamente a las funciones que compilen
 * correctamente.
 * El Aeropuerto Internacional Astor Piazzolla de nuestra ciudad nos pide un
 * sistema para administrar su flota de aviones que diariamente presta
 * operaciones.
 * De nuestro aeropuerto nos interesa conocer su nombre, su código
 * internacional, dirección y capacidad de operación (cantidad de aviones que
 * pueden transitar por sus pistas). El aeropuerto tiene diferentes hangares
 * para administrar de manera eficiente los diferentes tipos de avión y cada uno
 * tiene diferentes restricciones explicadas más adelante.
 * Todos los tipos de avión tienen un nombre de modelo, una marca, capacidad
 * de combustible, tipo de motor y cantidad de asientos (los aviones de carga
 * tendrán 0 asientos).
 * Los tipos de aviones pueden ser:
 * ● Comercial: tiene cantidad de azafatas y una lista de servicios.
 * ● Privado: tiene un indicador para saber si tiene o no jacuzzi y un string
 * con la clave de wifi
 * ● De carga: tiene la cantidad de kilos que puede administrar y una lista
 * de posibles productos a transportar
 * ● Militar: tiene un sistema de armas (aire-aire o aire-tierra) y cantidad de
 * balas
 * Todos los aviones: despegan, aterrizan y vuelan.
 * Comercial y Privado: sirven comida y dan mantas para el frío.
 * Solo en los privados se puede ver el mundial (true/false)
 * Los de tipo Militar y DeCarga tienen un método para ingresar (no hay que
 * desarrollar más que un método que devuelva true/false)
 * DeCarga: descargan contenido.
 * Como nuestro aeropuerto tiene una capacidad de operación (cantidad de
 * aviones), cada vez que agregamos un avión debemos tener en cuenta este
 * límite. Si es superado, el avión no podrá ingresar y lanzaremos un mensaje.
 * Además, diseñe un método que haga despegar a todos los aviones de un
 * determinado hangar enviado por parámetro.
 */
public class Aeropuerto {

        //Atributos
        private String nombre;
        private String codigo;
        private String direccion;
        private int capacidadOperacion;
        private  ArrayList<Hangares<?>> hangaresAeropuerto;




        //Constructor
        public Aeropuerto(String nombre, String codigo, String direccion, int capacidadOperacion) {
                this.nombre = nombre;
                this.codigo = codigo;
                this.direccion = direccion;
                this.capacidadOperacion = capacidadOperacion;
                hangaresAeropuerto= new ArrayList<>();


        }


        //Getters
        public String getNombre() {
                return nombre;
        }
        public String getDireccion() {
                return direccion;
        }
        public String getCodigo() {
                return codigo;
        }
        public int getCapacidadOperacion() {
                return capacidadOperacion;
        }


        //Setters
        public void setNombre(String nombre) {
                this.nombre = nombre;
        }
        public void setCodigo(String codigo) {
                this.codigo = codigo;
        }
        public void setDireccion(String direccion) {
                this.direccion = direccion;
        }
        public void setCapacidadOperacion(int capacidadOperacion) {
                this.capacidadOperacion = capacidadOperacion;
        }

        //Metodos
        public void registrarHangar(Hangares<?> hangar)
        {
                hangaresAeropuerto.add(hangar);
        }

        public void eliminarHangarAeropuerto(Hangares<?> hangar)
        {
                hangaresAeropuerto.remove(hangar);
        }
        public String mostrarHangaresAeropuerto()
        {
                       return hangaresAeropuerto.toString();
        }
        public int cuantosHangaresAeropuerto()
        {
                return hangaresAeropuerto.size();

        }
        public int avionesTotalAeropuerto()
        {
                int recuento=0;
                for( Hangares <?> hangar : hangaresAeropuerto )
                        {
                               recuento +=  hangar.cuantosAvionesEnHangar();
                        }

                return recuento;

        }

        public boolean confirmarAvionEntraAlAeropuerto()
        {
                boolean entra= false;
                if(avionesTotalAeropuerto() <=  capacidadOperacion)
                {
                        entra= true;

                }

                return entra;
        }



        //ToString
        @Override
        public String toString() {
                return "Aeropuerto{" +
                        "nombre='" + nombre + '\'' +
                        ", codigo='" + codigo + '\'' +
                        ", direccion='" + direccion + '\'' +
                        '}';
        }
}
