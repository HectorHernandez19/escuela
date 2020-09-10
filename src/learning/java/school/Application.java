package learning.java.school;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        String listaAsistencia="";
        Scanner scanner = new Scanner(System.in);
        Student []students = new Student[]{
                new Student("Isaias","1"),
                new Student("Edgar","2"),
                new Student("Alain","3"),
                new Student("Caleb","4")
        };

        System.out.println("Ingrese la asistencia por alumno:");

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].getName() + "-" + students[i].getCode());
            System.out.print("Asistio?: ");
            String response = scanner.next( "[YNyn]");
            listaAsistencia=listaAsistencia+(students[i].getName() + (response.equalsIgnoreCase("Y") ? ": Si asistio\n" : ": No asistio\n"));

        }
        System.out.println("Lista de asistencia de hoy:");
        System.out.println(listaAsistencia);

    }
}
