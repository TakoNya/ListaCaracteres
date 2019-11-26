package listacaracteresapp;

public class ListaCaracteresApp {

        public static void main(String[] args) {
            
            String cadena= "La lluvia en Sevilla es una maravilla";
            
            for (int i = 0; i<cadena.length(); i++)
                
                //Hacemos un c{asting para convertir el char en int
                System.out.print((int) cadena.charAt(i) + " ");
       
    }
    
}
