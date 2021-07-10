
public class GeneraPassword {

    public static void main(String[] args) {
        System.out.println(generaClave());
    }
    
    static String generaClave(){
        char[] mayusculas = {'A','B','C','D','E'};
        char[] minusculas = {'a','b','c','d','e'};
        char[] numeros = {'1','2','3','4','5'};
        char[] simbolos = {'/','*','-','.',','};
        
        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        caracteres.append(simbolos);
        
        StringBuilder clave = new StringBuilder();
        
        for(int i = 0; i <= 15; i++) {
            int cantidadCaracteres = caracteres.length();
            int numeroRandom = (int)(Math.random()*cantidadCaracteres);
            clave.append(caracteres.toString().charAt(numeroRandom));
        }

        
        return clave.toString();
        
    }
    
}
