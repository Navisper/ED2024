
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    {
        Scanner h = new Scanner(System.in);
        Scanner o = new Scanner(System.in);
        System.out.print("por favor ingresa 1 para iniciar el programa:  ");
        String hola = o.next();

        List<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("xd", "xd"));
        tareas.add(new Tarea("xdd", "xdd"));
        int xd;
        int dx;

        while( hola.equals("1"))
        {
            System.out.println("\nbienvenido al gestor de tareas en java\n\n");

            System.out.println("\nescoje una de las siguientes opciones\n1) listar tareas\n2) agregar tarea\n3) eliminar tarea\n4) salir del programa");

            xd = h.nextInt();
            
            String datos;

            if(xd == 1)
            {
                for(int i = 0; i < tareas.size(); i++)
                {
                    tareas.get(i).datos();
                }

                System.out.println("1) listar tareas\n2) agregar tarea\n3) eliminar tarea\n4) salir del programa");
                xd = h.nextInt();
            }
            else if(xd == 2)
            {
                System.out.println("por favor escriba el nombre de su tarea para añadirla");
                datos = h.next();
                tareas.add(new Tarea(hola, datos));

                System.out.println("1) listar tareas\n2) agregar tarea\n3) eliminar tarea\n4) salir del programa");
                xd = h.nextInt();
            }
            else if(xd == 3)
            {
                System.out.println("por favor escriba el indice de la tarea a eliminar");
                dx = h.nextInt();

                tareas.remove(dx);
                System.out.println("1) listar tareas\n2) agregar tarea\n3) eliminar tarea\n4) salir del programa");
                xd = h.nextInt();
            }
            else if(xd==4)
            {
                hola = "2";
            }
            else
            {
                
                System.out.println("ups, parece que no has escogido un numero vaido\ningresa nuevamente un numero del 1 al 4(entero)");
                xd = h.nextInt();
            }

            
        }
    }
}
