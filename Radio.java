
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

    private Boolean Encendido = false;
    private Boolean TipoSenal = true;
    private float EmisoraActual = 87.9f;
    private int Boton1;

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

}