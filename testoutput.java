import java.math.*

public static void main (String args[]){
    int [] outputarray = new int [20];
    double summe = 0;
    for (int i=0; i<outputarray.length; i++){
        outputarray[i] = (int) math.random;
        summe =+ outputarray[i];
        System.out.println((i+1) +". "outputarray[i]);
        if ((i+1) == outputarray.length){
          System.out.println("Summe: "+summe);
        }
    }
}
