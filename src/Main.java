public class Main {
    public static void main(String[] args) {
        int respuesta = suma(1,2,3);
        System.out.println("El resultado de la suma es " + respuesta + ".");

        auto miAuto = new auto();
        miAuto.añadirPuertas();
        System.out.println("El auto tiene " + miAuto.puertas + " puertas.");
    }

    public static int suma (int a, int b, int c){
        int resultado = a + b + c;
        return resultado;
    }
}

class auto {
    public int puertas = 0;
     public void añadirPuertas(){
         this.puertas ++;;
    }
}