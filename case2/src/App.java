public class App {
    public static void main(String[] args) throws Exception {
        //2 - Tienes un array de 20 números enteros: decir cuales
        //son pares e impares.
        //+EXTRA: irlos añadiendo a nuevos arrays: 'arrayPares' y 'arrayImpares', y al final mostrar los tres arrays.
        int[] numEnteros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; //dando la cantidad
        int numPares=0;
        int numImpares=0;
        for(int i=0; i<numEnteros.length; i++){
            if (numEnteros[i] % 2 == 0) {
                numPares=numPares+1;
                System.out.println(numEnteros[i]+" es par");
                

            }
            else {numImpares=numImpares+1;
                System.out.println(numEnteros[i]+" es impar");}
        

        
        
        }

}
}
