import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaMia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> listaEm = new ArrayList<>();
        
        while (true) {
            System.out.println("Menú:");
            System.out.println("Ingrese 1 para agregar empleado");
            System.out.println("Ingrese 2 para mostrar información de empleados");
            System.out.println("Ingrese 3 para calcular aumento de salario");
            System.out.println("Ingrese 4 para salir del programa");
            System.out.println("Seleccione una opción: ");
            int op = sc.nextInt();
            
            switch (op) {
                case 1:
                    aggEmpleado(sc, listaEm);
                    break;
                case 2:
                    InfoEm(listaEm);
                    break;
                case 3:
                    calcularAumentoSalario(sc, listaEm);
                    break;
                case 4:
                    System.out.println("Cancelado");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }
      
    private static void aggEmpleado(Scanner sc, ArrayList<Empleado> listaEm2) {
        String nombre;
        double salario = 0;
        int edad = 0;
        System.out.println("Ingrese los Datos que se piden");
        System.out.print("Nombre del Empleado");
        nombre = sc.next();
        System.out.print("Salario del empleado: ");
        salario = sc.nextDouble();
        System.out.print("Edad del empleado: ");
        edad = sc.nextInt();
        
        Empleado empleado = new Empleado(nombre, salario, edad);
        listaEm2.add(empleado);
        
        System.out.println("Empleado agregado correctamente.");
    }
    
   
    private static void InfoEm(ArrayList<Empleado> listaEmpleados) {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No tiene empleados");
        } else {
            System.out.println("Información de los empleados:");
            for (Empleado empleado : listaEmpleados) {
                System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.getSalario() + ", Edad: " + empleado.getEdad());
            }
        }
    }
    
    
    private static void calcularAumentoSalario(Scanner scanner, ArrayList<Empleado> listaEmpleados) {
        if (listaEmpleados.isEmpty()) {
            System.out.println("no tiene empleados.");
        } else {
            double totalSalarios = 0;
            for (Empleado empleado : listaEmpleados) {
                totalSalarios += empleado.getSalario();
            }
            double salarioPromedio = totalSalarios / listaEmpleados.size();
            
            System.out.print("Ingrese el porcentaje de aumento salarial: ");
            double porcentajeAumento = scanner.nextDouble();
            
            for (Empleado empleado : listaEmpleados) {
                if (empleado.getSalario() < salarioPromedio) {
                    double aumento = empleado.getSalario() * (porcentajeAumento / 100);
                    double nuevoSalario = empleado.getSalario() + aumento;
                    empleado.setSalario(nuevoSalario);
                    System.out.println("El salario de " + empleado.getNombre() + " ha sido aumentado a " + nuevoSalario);
                }
            }
        }
    }
}
