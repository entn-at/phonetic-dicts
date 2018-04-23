package g2p;

import java.util.Scanner;
import voxlaps.voxlib.GraphemeToPhoneme;

public class Testfile{
  public static void main(String[] args){

    Scanner tec = new Scanner(System.in);
    GraphemeToPhoneme fons = new GraphemeToPhoneme();

    final String parada = "halt";
    String txt = "";

    System.out.println("'"+parada+"'"+" para encerrar a execução deste arquivo de teste.");

    while(!txt.equals(parada)){
      txt = tec.nextLine();
      if(!txt.equals(parada))
        System.out.println("Fonemas: "+fons.graphToPhon(txt));
    }
  }

}

