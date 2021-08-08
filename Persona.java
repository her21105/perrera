import java.util.Random;

public class Persona {

    //declarar
    float confiabilidad;
    boolean galleta;

    Persona(){
        this.confiabilidad = 0f;
        this.galleta = true;
        Confiabilidad();
    }

    //constructor random
    Random rand = new Random();

    //confirmar si tiene galleta
    public boolean tieneGalleta(){

        return this.galleta;
    }

    //dar galleta
    public void darGalleta(){
        this.galleta = false;
    }

    //confiabilidad
    public void Confiabilidad(){

        this.confiabilidad = rand.nextFloat() * (10);
    }

    public float getConfiabilidad(){
        return this.confiabilidad;
    }

    public boolean getgalleta(){

        return this.galleta;
    }
}

    