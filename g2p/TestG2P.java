package g2p;

/* importa conteúdo da biblioteca g2plib */
import falabrasil.g2p.GraphemeToPhoneme;

public class TestG2P {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.println("Grupo FalaBrasil");
			System.out.println("Conversor Grafema-Fonema (G2P)\n");
			System.err.println("Usage: java -cp \".:g2p/g2plib.jar\" " +
					"g2p.TestG2P <PALAVRA>");
			System.err.println("\t<PALAVRA> é qualquer palavra " + 
					"do Português Brasileiro");
			System.exit(1);
		}

		/* instancia objeto para usar os métodos da biblioteca g2plib */
		GraphemeToPhoneme phones = new GraphemeToPhoneme();

		/* escreve fonemas da primeira palavra passada como parâmetro na tela usando método g2p() */
		System.out.println(args[0] + "\t" + phones.g2p(args[0]));
	}
}
