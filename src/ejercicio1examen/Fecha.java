package ejercicio1examen;

import java.util.Scanner;

public class Fecha {
    private int mes;
    private int dia;
    private int año;

    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    public Fecha() {
    }
    

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public int mostrarFecha(){
        int dia,mes,año;
        
        Scanner x= new Scanner(System.in);
        System.out.println("Ingresa el dia: ");
        dia=x.nextInt();
        if(dia>31){
            System.out.println("Error, debe de ingresar un numero de escala 1-31");
        } else{
            this.dia = dia;
        }
        System.out.println("Ingresa el mes: ");
        mes=x.nextInt();
        if(mes>12){
            System.out.println("Eroor, los meses llegan hasta el numero 12");
        } else{
            this.mes = mes;
        }
         System.out.println("Ingresa el año: ");
        año=x.nextInt();
        if(año>2023){
           System.out.println("Eroor, estamos en el año 2023");
        }else{
            this.año = año;
        }
        System.out.println("La fecha es: "+dia+"/"+mes+"/"+año);
        return 0;
    }
}
