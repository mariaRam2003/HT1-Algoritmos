
/******************************************************************
* 
* Author: Gonzalo Santizo. 
* Carnet 21504
* Fecha de edicion 1-26-2022
* 
* En esta parte del programa se crean los metodos que el usuario accesara por medio del control
* 
******************************************************************/

import java.util.Scanner;

class Radio {

    private Boolean TipoSenal = true;
    private float EmisoraActual = 87.9f;
    private int Boton1;
    private int Boton2;
    private int Boton3;
    private int Boton4;
    private int Boton5;
    private int Boton6;
    private int Boton7;
    private int Boton8;
    private int Boton9;
    private int Boton10;
    private int Boton11;
    private int Boton12;

    /******************************************************************
     * 
     * Aqui se suben las emisiones
     * 
     ******************************************************************/

    public void SubirEmisora(Radio CurrentRadio) {

        CurrentRadio.setEmisoraActual(CurrentRadio.getEmisoraActual() + 0.2f);

        System.out.println(CurrentRadio.getEmisoraActual());

    }

    /******************************************************************
     * 
     * Aqui se bajan las emisoras
     * 
     ******************************************************************/

    public void BajarEmisora(Radio CurrentRadio) {

        CurrentRadio.setEmisoraActual(CurrentRadio.getEmisoraActual() - 0.2f);

        System.out.println(CurrentRadio.getEmisoraActual());

    }

    /******************************************************************
     * 
     * Aqui se expresa el tipo de emisora en la que esta el usuario.
     * Este metodo solo imprime la emisora actual.
     * Es importante que en el menu si estan en opcion FM cambie la variable a false
     * 
     ******************************************************************/

    public void MostrarSenal(Radio CurrentRadio) {

        Boolean CurrentStation = CurrentRadio.getTipoSenal();

        if (CurrentStation.equals(true)) {
            System.out.println("El radio esta en modo AM");

        } else if (CurrentStation.equals(false)) {

            System.out.println("El radio esta en modo FM");

        }

    }

    /******************************************************************
     * 
     * Aqui se encuentra la emisora actual
     * 
     ******************************************************************/

    public void EmisoraActual(Radio CurrentRadio) {

        System.out.println(CurrentRadio.getEmisoraActual());

    }

    /******************************************************************
     * 
     * Setters and getters below
     * 
     ******************************************************************/

    public Boolean getTipoSenal() {
        return TipoSenal;
    }

    public void setTipoSenal(Boolean TipoSenal) {
        this.TipoSenal = TipoSenal;
    }

    public float getEmisoraActual() {
        return EmisoraActual;
    }

    public void setEmisoraActual(float EmisoraActual) {
        this.EmisoraActual = EmisoraActual;
    }

    public int getBoton1() {
        return Boton1;
    }

    public void setBoton1(int Boton1) {
        this.Boton1 = Boton1;
    }



    public int getBoton2() {
        return Boton2;
    }

    public void setBoton2(int Boton2) {
        this.Boton2 = Boton2;
    }



    
    public int getBoton3() {
        return Boton3;
    }

    public void setBoton3(int Boton3) {
        this.Boton3 = Boton3;
    }


    public int getBoton4() {
        return Boton4;
    }

    public void setBoton4(int Boton4) {
        this.Boton4 = Boton4;
    }



    public int getBoton5() {
        return Boton5;
    }

    public void setBoton5(int Boton5) {
        this.Boton5 = Boton5;
    }






    public int getBoton6() {
        return Boton6;
    }

    public void setBoton6(int Boton6) {
        this.Boton6 = Boton6;
    }





    public int getBoton7() {
        return Boton7;
    }

    public void setBoton7(int Boton7) {
        this.Boton7 = Boton7;
    }



    public int getBoton8() {
        return Boton8;
    }

    public void setBoton8(int Boton8) {
        this.Boton8 = Boton8;
    }





    public int getBoton9() {
        return Boton9;
    }

    public void setBoton9(int Boton9) {
        this.Boton9 = Boton9;
    }



    public int getBoton10() {
        return Boton10;
    }

    public void setBoton10(int Boton10) {
        this.Boton10 = Boton10;
    }





    public int getBoton11() {
        return Boton11;
    }

    public void setBoton11(int Boton11) {
        this.Boton11 = Boton11;
    }







    public int getBoton12() {
        return Boton12;
    }

    public void setBoton12(int Boton12) {
        this.Boton12 = Boton12;
    }


    

}