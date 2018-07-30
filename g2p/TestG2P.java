package g2p;
import org.apache.commons.cli.*;
import java.io.ByteArrayInputStream;                                           
import java.io.File;                                                
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.io.*;  

/* importa conteúdo da biblioteca g2plib */
import falabrasil.g2p.GraphemeToPhoneme;

public class TestG2P {
	public static void main(String[] args) {
		if(args.length <= 1) {
			System.err.println("Grupo FalaBrasil");
			System.out.println("Conversor Grafema-Fonema (G2P)\n");
			System.err.println("Usage 1: java -cp \".:g2p/*\" " +
					"g2p.TestG2P -w <PALAVRA>");
			System.err.println("\t<PALAVRA> é qualquer palavra " + 
					"do Português Brasileiro");
			System.err.println("Usage 2: java -cp \".:g2p/*\" " + 
					"g2p.TestG2P -f <ENTRADA> <SAIDA>");
			System.err.println("\t<ENTRADA> é qualquer arquivo com uma "+
					"palavra por linha");
			System.err.println("\t<SAIDA> é o arquivo destino para os "+
					"fonemas gerados");
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
			if(cmd.hasOption("f")){
				File dir = new File("");
				
				String source = dir.getCanonicalPath() + File.separator +
				args[1];
				System.out.println(args[2]);
				String dest = dir.getCanonicalPath() + File.separator+args[2];
				File fin = new File(source);
				FileInputStream fis = new FileInputStream(fin);
				BufferedReader in = new BufferedReader (new InputStreamReader(fis));
				FileWriter fstream = new FileWriter(dest, true);
				BufferedWriter out = new BufferedWriter(fstream);
				
				String aLine = null;
				while ((aLine = in.readLine()) != null) {
					aLine = aLine +"\t" + phones.g2p(aLine);
					out.write(aLine);
					out.newLine();
				}
				in.close();
				out.close();
			}

		/* instancia objeto para usar os métodos da biblioteca g2plib */

		/* escreve fonemas da primeira palavra passada como parâmetro na tela usando método g2p() */
		} catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("uhuhhuh");
		}
	}
}
