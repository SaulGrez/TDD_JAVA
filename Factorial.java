public class Factorial {

    public static int Calcular (int num){

        if(num == 0){

            return 1;
        }



        return num * Calcular(num-1);
    }
}
