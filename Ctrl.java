
/******************************************************************
* 
* Author: Maria Ramirez. 
* Carnet 21342
* Fecha de edicion 11-9-21
* 
* This is the main part of the program and will control the user inputs
* 
******************************************************************/

import java.util.Scanner;
import java.util.ArrayList;

class Ctrl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Crear las clases Radio y Vista
        int opcion = 0;
        Vista UserView = new Vista();
        Radio Radio = new Radio();

        Radio.MostrarSenal(Radio);

        //MENU

        while (opcion != 2){
            UserView.PrintMenuStart();

            opcion = scan.nextInt();

            if(opcion == 1){
                //ECENDIDO
                System.out.println("Radio Encendida");

                int opcionEncendido = 0;

                while (opcionEncendido != 2){

                    UserView.ChooseStation();
                    opcionEncendido = scan.nextInt();

                    if (opcionEncendido == 1){
                        System.out.println("Radio AM seleccionada");

                        int opcionGUI = 0;

                        UserView.RadioGUI();

                        opcionGUI = scan.nextInt();
                        
                        

                        while (opcionGUI != 4){

                            if (opcionGUI == 1){
                                System.out.println("Subiendo emisora");

                                //AGREGAR AQUI el metodo de radio para subir emisora

                                Radio.SubirEmisora(Radio);
                            }

                            if (opcionGUI == 2){
                                System.out.println("Bajar emisora");

                                //AGREGAR AQUI el metodo de radio para bajar emisora

                                Radio.BajarEmisora(Radio);

                            }

                            if (opcionGUI == 3){
                                System.out.println("Elija en que boton desea guardar la emisora");

                                UserView.Botones();

                                int opcionBotones = 0;

                                while (opcionBotones != 12){

                                    if (opcionBotones == 1){
                                        System.out.println("Guardando en boton 1...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora

                                    }

                                    if (opcionBotones == 2){
                                        System.out.println("Guardando en boton 2...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 3){
                                        System.out.println("Guardando en boton 3...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 4){
                                        System.out.println("Guardando en boton 4...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 5){
                                        System.out.println("Guardando en boton 5...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 6){
                                        System.out.println("Guardando en boton 6...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 7){
                                        System.out.println("Guardando en boton 7...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 8){
                                        System.out.println("Guardando en boton 8...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 9){
                                        System.out.println("Guardando en boton 9...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 10){
                                        System.out.println("Guardando en boton 10...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 11){
                                        System.out.println("Guardando en boton 11...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 12){
                                        System.out.println("Guardando en boton 12...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }
                                }
                            }
                        }
                        

                    }

                    if (opcionEncendido == 2){

                        int opcionGUI = 0;


                        System.out.println("Radio FM Seleccionada");

                        UserView.RadioGUI();
                        opcionGUI = scan.nextInt();
                        


                        while (opcionGUI != 4){

                            if (opcionGUI == 1){
                                System.out.println("Subiendo emisora");

                                //AGREGAR AQUI el metodo de radio para subir emisora
                            }

                            if (opcionGUI == 2){
                                System.out.println("Bajar emisora");

                                //AGREGAR AQUI el metodo de radio para bajar emisora
                            }

                            if (opcionGUI == 3){
                                System.out.println("Elija en que boton desea guardar la emisora");

                                UserView.Botones();

                                int opcionBotones = 0;

                                while (opcionBotones != 12){

                                    if (opcionBotones == 1){
                                        System.out.println("Guardando en boton 1...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 2){
                                        System.out.println("Guardando en boton 2...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 3){
                                        System.out.println("Guardando en boton 3...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 4){
                                        System.out.println("Guardando en boton 4...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 5){
                                        System.out.println("Guardando en boton 5...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 6){
                                        System.out.println("Guardando en boton 6...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 7){
                                        System.out.println("Guardando en boton 7...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 8){
                                        System.out.println("Guardando en boton 8...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 9){
                                        System.out.println("Guardando en boton 9...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 10){
                                        System.out.println("Guardando en boton 10...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 11){
                                        System.out.println("Guardando en boton 11...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }

                                    if (opcionBotones == 12){
                                        System.out.println("Guardando en boton 12...");

                                        //AGREGAR AQUI el metodo de radio para guardar emisora
                                    }
                                }
                            }
                        }
                    }

                    if (opcionEncendido == 3){
                        UserView.PrintMenuStart();
                    }
                }
            }

            else {
                //Terminar programa
            }
        }

    }

}