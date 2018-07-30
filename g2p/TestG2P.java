package g2p;
import org.apache.commons.cli.*;

/* importa conteúdo da biblioteca g2plib */
import falabrasil.g2p.GraphemeToPhoneme;

public class TestG2P {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.err.println("Grupo FalaBrasil");
			System.out.println("Conversor Grafema-Fonema (G2P)\n");
			System.err.println("Usage: java -cp \".:g2p/g2plib.jar\" " +
					"g2p.TestG2P <PALAVRA>");
			System.err.println("\t<PALAVRA> é qualquer palavra " + 
					"do Português Brasileiro");
			System.exit(1);
		}

		Options options = new Options();
		options.addOption("f",true,"file");
		options.addOption("w",true,"word");

		CommandLineParser parser = new DefaultParser();

		try{
			CommandLine cmd = parser.parse(options, args);
		
			GraphemeToPhoneme phones = new GraphemeToPhoneme();
			if(cmd.hasOption("w")){
				System.out.println(args[1] + "\t" + phones.g2p(args[1]));
			}

		/* instancia objeto para usar os métodos da biblioteca g2plib */

		/* escreve fonemas da primeira palavra passada como parâmetro na tela usando método g2p() */
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
