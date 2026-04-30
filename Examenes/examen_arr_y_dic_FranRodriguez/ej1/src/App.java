import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> astronautas = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> combustible = new LinkedHashMap<>();
        boolean salir = false;

        while (!salir) {
            String accion = sc.next().toLowerCase();

            if (accion.equals("mission_completed")) {
                salir = true;
                System.out.println("RANKING");
            } else {
                String nombre = sc.next();
                if (accion.equals("arrive")) {
                    if (astronautas.containsKey(nombre)) {
                        System.out.println(nombre + " ya esta en el planeta");
                    } else {
                        astronautas.put(nombre, 1);
                        combustible.put(nombre, 0);
                    }
                }
                else if (accion.equals("depart")) {
                        int estado= astronautas.get(nombre);
                        if (estado==0) {
                            System.out.println(nombre+" ya esta en el espacio");
                        }
                        else{
                            astronautas.put(nombre, 0);
                        }
                }
                else if (accion.equals("refuel")) {
                        int estado=astronautas.get(nombre);
                        if (estado==0) {
                            combustible.put(nombre, combustible.get(nombre)+20);
                        }
                        else System.out.println("Error no se puede repostar en tierra");
                }
                else if (accion.equals("transfer")) {
                        String nombre2=sc.next();
                        int estado1=astronautas.get(nombre);
                        int estado2= astronautas.get(nombre2);
                        int combustible1=combustible.get(nombre);

                        if (combustible1<10) {
                            System.out.println(nombre+" no tiene el suficiente combustible");
                        }
                        else{
                            if (estado1 !=1 && estado2 != 1) {
                                System.out.println(nombre+" y "+nombre2+" no estan los dos en tierra");
                            }
                            else{
                                combustible.put(nombre, combustible.get(nombre)-10);
                                combustible.put(nombre2, combustible.get(nombre2)+10);
                            }
                        }
                }
                else if (accion.equals("get_status")) {
                    int combustible1=combustible.get(nombre);
                    System.out.println(nombre+" "+combustible1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : combustible.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        sc.close();
    }
}
