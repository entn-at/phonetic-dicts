target=TestG2P.java
deps=g2plib.jar
word=falabrasil

all:
	javac -cp ".:*" TestG2P.java

test:
	cd .. && java -cp ".:g2p/*" g2p.TestG2P -f $(word)
#java -cp ".:g2p/*" g2p.TestG2p -f <ENTRADA> <SAIDA>

clean:
	rm -f *.class
