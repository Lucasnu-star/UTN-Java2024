public class Empleado {
        // ATTRIBUTES
        private String nombre;
        private String apellido;
        private String dni;
        private double salario;

        // GETTER

        public String getNombre() {return nombre;}
        public String getApellido() {return apellido;}
        public String getDni() {return dni;}
        public double getSalario() {return salario;}

        // SETTERS

        public void setNombre(String nombre) {this.nombre = nombre;}
        public void setApellido(String apellido) {this.apellido = apellido;}
        public void setDni(String dni) {this.dni = dni;}
        public void setSalario(double salario) {this.salario = salario;}

        // METHODS

        public void calcularSalarioSemanal()
        {
            // Trabaja 8 hrs diarias 5 dias a la semana

            int horasPorSemana = 8 * 5;
            double salarioSemanal = this.salario * horasPorSemana;
            this.salario = salarioSemanal;
        }
        public void calcularSalarioAnual()
        {
            // Usando metodo salarioSemanal para calcular el SalarioAnual.
            this.salario = this.salario * 52; // Un año tiene 52 semanas.
        }
        public void aumentarSalario (int porcentaje)
        {
            double porcentajeEnDecimal = (double) porcentaje / 100 ; // Pasaje del porcentaje a numero decimal para hacer mas sencillo la cuenta para incrementar el salario.
            double montoSumarSalarioAnual= salario * porcentajeEnDecimal;

            salario = salario + montoSumarSalarioAnual;


        }
        public String mostrarEmpleado () // Muestra el empleado con todos sus atributos
        {
            return "Nombre:" + nombre + " " + "Apellido:"  +  apellido + " "  + "Dni:" + dni + " " + "Salario:" + (int)salario;
        }
        public void crearPersona(String nombre, String apellido, String dni , double salario)
        {
            setNombre(nombre);
            setApellido(apellido);
            setDni(dni);
            setSalario(salario);

        }

}
