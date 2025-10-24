import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> ponente = new ArrayList<>(); // array list de estudiantes ponentes.

        int cantidad_de_estudiante = 0;

        System.out.println("Cuantos estudiantes se registraran?");
        cantidad_de_estudiante = sc.nextInt();

        for (int i = 1; i <= cantidad_de_estudiante; i++) {
            System.out.println("Diga ID del ponente");
            int id = sc.nextInt();
            System.out.println("Diga la cantidad de ponecias del estudiante" + id);
            int ponencia = sc.nextInt();
            ponente.add(new Estudiante(id, ponencia));
        }

        for (Estudiante e : ponente) {
            System.out.println("ID " + e.GetId() + " Cantidad " + e.GetCantidadPonencias());
            System.out.println("-----------------------------------------------");
        }

        // A continuacion se implementa los requerimientos

        // primer requerimiento
        int mayor = 0;
        int idestudiante = 0;

        for (Estudiante est1 : ponente) { // recorre el array para determinar
                                          // el mayor ponente y presentar el id
            if (est1.GetCantidadPonencias() > mayor) {
                mayor = est1.GetCantidadPonencias();
                idestudiante = est1.GetId();
            }

        }

        System.out.println("El estudiante con mayor cantidad de ponencia es" + idestudiante);

        for (Estudiante e : ponente) {
            System.out.println("ID " + e.GetId() + " Cantidad " + e.GetCantidadPonencias());
            System.out.println("-----------------------------------------------");
        }

        // segundo requerimiento
        System.out.println("Incorporamos un nuevo ponente");
        System.out.println("Diga el id del ponente");
        int idponente = sc.nextInt();
        System.out.println("Teclee la cantidad de trabajos a presentar");
        int cantidadtrabajo = sc.nextInt();

        ponente.add(new Estudiante(idponente, cantidadtrabajo));

        for (Estudiante e : ponente) {
            System.out.println("ID " + e.GetId() + " Cantidad " + e.GetCantidadPonencias());
            System.out.println("-----------------------------------------------");
        }

        // Tercer requerimiento

        System.out.println("Defina cantidad de ponencias para comparar y determinar menor id de autor");
        int definicioncantidad = sc.nextInt();
        for (Estudiante i : ponente) {
            if (i.GetCantidadPonencias() < definicioncantidad) {
                System.out.println(i.GetId());
            }
        }

        for (Estudiante e : ponente) {
            System.out.println("ID " + e.GetId() + " Cantidad " + e.GetCantidadPonencias());
            System.out.println("-----------------------------------------------");
        }

        // Cuarto requerimiento

        int c = 0;

        for (Estudiante est : ponente) {
            if (est.GetCantidadPonencias() > 5) {
                c++;
            }
        }

        System.out.println("Existen " + c + " estudiantes con más de 5 ponencias");

        // quito requerimiento

        System.out.println("Escriba el id del estudiante para saber su cantidad de ponencias");
        int d = sc.nextInt();
        for (Estudiante estud : ponente) { // 10 objetos de tipo Estudiante
            if (estud.GetId() == d) {
                System.out.println(
                        "La cantidad de ponecias del id" + estud.GetId() + " es" + estud.GetCantidadPonencias());
                break;
            }

        }

        for (Estudiante e : ponente) {
            System.out.println("ID " + e.GetId() + " Cantidad " + e.GetCantidadPonencias());
            System.out.println("-----------------------------------------------");
        }

        // sexto requerimiento

        int suma = 0;
        double prom = 0;
        for (Estudiante e : ponente) {
            suma += e.GetCantidadPonencias();
        }
        prom = suma / ponente.size();
        System.out.println("el promedio de trabajos del evento es " + prom);

        // septimo requerimiento

        int cuentaestudiante = 0;
        for (Estudiante es : ponente) {
            if (es.GetCantidadPonencias() > 3) {
                cuentaestudiante++;
            }
        }
        System.out.println("existen " + cuentaestudiante + " estudiantes con mas de 3 ponencias");

        for (Estudiante e : ponente) {
            System.out.println("ID " + e.GetId() + " Cantidad " + e.GetCantidadPonencias());
            System.out.println("-----------------------------------------------");
        }

        // octavo requerimiento

        System.out.println("Ingrese el ID del estudiante a eliminar");
        int idestudianteeliminado = sc.nextInt();
        for (Estudiante t : ponente) { // 5 elementos
            if (t.GetId() == idestudianteeliminado) {
                System.out.println("?Desea eliminar al estudiante" + t.GetId());
                System.out.println("1-confirmar   2-Cancelar");
                int decision = sc.nextInt();
                if (decision == 1) {
                    ponente.remove(t);
                    System.out.println("Estudiante eliminado");
                }
                break;
            }
        }

        for (Estudiante e : ponente) {
            System.out.println("ID "+e.GetId() +" Cantidad "+ e.GetCantidadPonencias());
            System.out.println("-----------------------------------------------");
        }




    

    
    }
    




}