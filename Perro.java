import java.util.Random;

public class Perro {

    double EstadoAnimo;
    double umbral;
    boolean cola;

    Perro(){
        this.EstadoAnimo = 0f;
        this.umbral = 0f;
        this.cola = false;
        //psican(p);
        calUmbral();
    }
    
    Random rand = new Random();

    //contructor persona
    Persona p = new Persona();

    //psicologia de perro en estado de animo
    public void psican(Persona p){
        this.EstadoAnimo = (1.0/p.getConfiabilidad())*(rand.nextFloat() - 0.5) * 10 + this.EstadoAnimo;
        
        System.out.println("Mi nuevo animo es: "+ EstadoAnimo);
    }

    //
    public void galleta(Persona p){
        if(p.tieneGalleta() == true){
            p.darGalleta();
            this.EstadoAnimo += (1.0/ p.getConfiabilidad()) * (rand.nextInt(2));
            System.out.println("Mi nuevo animo es: "+ EstadoAnimo);
        } 
    }

    public double getEstadoanimo(){
        return this.EstadoAnimo;
    }

    //get umbral
    public double getumbral(){
        return this.umbral;
    }

    //calcular umbral
    public void calUmbral(){
        this.umbral = rand.nextFloat() * (-20);
    }
    //get cola
    public boolean getcola(){
        return this.cola;
    }
}
