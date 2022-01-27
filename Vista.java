
/******************************************************************
* 
* Author: Gonzalo Santizo. 
* Carnet 21504
* Fecha de edicion 1-26-2022
* 
* This is the part of the program where all the menus are called from
* 
******************************************************************/

import java.util.Scanner;

class Vista {

  Scanner scan = new Scanner(System.in);

  /******************************************************************
   * 
   * This menu is the first thing sommeone sees when they start the program
   * 
   ******************************************************************/

  public void PrintMenuStart() {
    System.out.println("\n\nQue deseas hacer?!");
    System.out.println("1. Encender radio");
    System.out.println("2. Salir");

    System.out.println("Que eliges?");
  }

  public void ChooseStation() {
    System.out.println("\n\nQue tipo de emisora escoges?");
    System.out.println("1. Am");
    System.out.println("2. FM");
    System.out.println("3. Regresar");

    System.out.println("Que eliges?");
  }

  public void RadioGUI() {
    System.out.println("\n\nQue Deseas hacer?");
    System.out.println("1. Cambiar Emisora ++");
    System.out.println("2. Cambiar Emisora --");
    System.out.println("3. Guardar Emisora");
    System.out.println("4. Cambiar a boton especifico");

    System.out.println("Que eliges?");
  }

  public void Botones() {
    System.out.println("\n\nQue Deseas hacer?");
    System.out.println("Boton 1");
    System.out.println("Boton 2");
    System.out.println("Boton 3");
    System.out.println("Boton 4");
    System.out.println("Boton 5");
    System.out.println("Boton 6");
    System.out.println("Boton 7");
    System.out.println("Boton 8");
    System.out.println("Boton 9");
    System.out.println("Boton 10");
    System.out.println("Boton 11");
    System.out.println("Boton 12");


    System.out.println("Que eliges?");
  }
}