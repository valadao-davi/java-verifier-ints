import java.util.ArrayList;

public class verifyNumbers {

    public boolean isPosi (int number){
        if(number > 0){
            return true;
        }else if (number == 0){
            return false;
        }else{
            return false;
        }
    }
    public boolean isNeg (int number){
        if (number < 0){
            return true;
        }else if (number == 0){
            return false;
        }else{
            return false;
        }
    }
    public ArrayList<Integer> onlyPosi (int[] numbers){
        ArrayList<Integer> positives = new ArrayList<Integer>();
        for(int number: numbers){
            if(isPosi(number)){
                positives.add(number);
        }
    }
        return positives;
    }
    public ArrayList<Integer> onlyNeg (int[] numbers){
        ArrayList<Integer> negatives = new ArrayList<Integer>();
        for(int number: numbers){
            if(isNeg(number)){
                negatives.add(number);
            }
        }
        return negatives;
    }
    public static void main (String []args){
        int []numeros = {-7, -30, -15, 20, 17, 40};
        verifyNumbers verificados = new verifyNumbers();
        ArrayList <Integer> numerosVerificados = verificados.onlyPosi(numeros); 
        ArrayList <Integer> numerosVerificados2 = verificados.onlyNeg (numeros);
        System.out.println(numerosVerificados);
        System.out.println(numerosVerificados2);
    }
}
