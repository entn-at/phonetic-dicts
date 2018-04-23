package g2p;

import falabrasil.g2p.GraphemeToPhoneme;//importa conteúdo da biblioteca g2plib

public class Testfile{
  public static void main(String[] args){

    GraphemeToPhoneme fons = new GraphemeToPhoneme();//instancia objeto para usar os métodos da biblioteca g2plib

    System.out.println("Fonemas: "+fons.g2p(args[0]));//escreve fonemas da primeira palavra passada como parâmetro na tela usando método g2p()
  }

}

