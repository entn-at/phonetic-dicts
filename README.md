# Dicionários Fonéticos e Conversor G2P
Dicionários fonéticos e _software_ conversor grafema-fonema (g2p)
disponibilizadas de forma gratuita<sup>\*</sup> pelo Grupo FalaBrasil.

<sup>\*</sup>Informações sobre a licença no arquivo _LICENSE_.

## Dicionários Fonéticos
Os dicionários fonéticos contém ao todo 40 fonemas (38, mais um modelo de
silêncio e um de _short pause_ ). Todos os dicionários abaixo contém o modelo
de pausa curta (sp) no final. Se o sp não for desejado, pode-se removê-lo com
o simples comando `sed 's/sp$//g' fb_XXXdict.dic > novo_dict.dic`. Os
dicionários também foram ordenado em ordem alfabética de acordo com o valor
ASCII dos caracteres com o comando `LC_ALL=C sort dic > fb_XXXdict.dic`.

No total, os dicionários consistem em 640.390 palavras. As listas de palavras
utilizadas são provenientes das seguintes fontes:

- [Projeto Natura](http://natura.di.uminho.pt/wiki/doku.php), da Universidade do
Minho; 
- [VERO](https://pt-br.libreoffice.org/projetos/vero/), verificador ortográfico
do LibreOffice;
- [Dicio](https://www.dicio.com.br/), dicionário online de Português pertencente
à empresa 7Graus;
- Corpus CETENFolha e demais bases de texto utilizadas para gerar o modelo de
linguagem trigrama disponibilizado pelo Grupo FalaBrasil.

### HTK
Abaixo, exemplo de palavras do dicionário são mostradas, seguidas das suas
respectivas transcrições. A ordenação das palavras baseada no valor ASCII é 
importante para o HTK para evitar erros como, por exemplo, o retornado pelo
HDMan.

> HDMan ERROR [+1452] ReadDictProns: word 'acaso' out of order in dict dict.dic

```
.-----------------------------------------------.
|           dictionary            | monophones0 |
| --------------------------------+-------------|
| </s>     []  sil                |      E      |
| <s>      []  sil                |      J      |
| <unk>    []  sil                |      L      |
| coração      k o r a s a~ w~ sp |      O      |
| história     i s t O r i a sp   |      R      |
| palhinha     p a L i~ J a sp    |      S      |
| sil          sil                |      X      |
| árvore       a R v o r i sp     |      Z      |
| ética        E tS i k a sp      |      a      |
| índio        i~ dZ i u sp       |      a~     |
| órgão        O R g a~ w~ sp     |     ...     |
'---------------------------------'-------------'
```

### CMU Sphinx
O [tutorial](https://cmusphinx.github.io/wiki/tutorialam/) para treino do modelo
acústico com o pacote SphinxTrain deixa claro algumas condições sobre o
dicionário fonético, conforme visto abaixo:

>Do not use case-sensitive variants like "e" and "E".   
>Sphinxtrain doesn’t support some special characters like "\*" or "/"  
>To be safe we recommend you to use alphanumeric-only phone-set.

```
.---------------------------------.-----------.--------.
|            dictionary           | .filler   | .phone |
|---------------------------------+-----------+--------|
| <s>          SIL                | <s>   SIL |  SIL   | 
| </s>         SIL                | </s>  SIL |  a     |
| <sil>        SIL                | <sil> SIL |  aa    |
| coração      k o r a s aa ww sp |           |  b     | 
| história     i s t om r i a sp  |           |  d     |
| palhinha     p a lm ii jm a sp  |           |  dz    |
| árvore       a rm v o r i sp    |           |  e     |
| ética        em ts i k a sp     |           |  ee    |
| índio        ii dz i u sp       |           |  aa    |
| órgão        om rm g aa ww sp   |           |  ...   |
'---------------------------------'-----------'--------'
```

### Kaldi
Coming soon.

```
.---------------------------------.-------.
|            lexicon              |  ...  |
| --------------------------------+-------|
| </s>         sil                |  E    |
| <s>          sil                |  J    |
| <unk>        sil                |  L    |
| árvore       a R v o r i sp     |  O    |
| coração      k o r a s a~ w~ sp |  R    |
| ética        E tS i k a sp      |  S    |
| história     i s t O r i a sp   |  X    |
| índio        i~ dZ i u sp       |  Z    |
| órgão        O R g a~ w~ sp     |  a    |
| palhinha     p a L i~ J a sp    |  a~   |
| sil          sil                | ...   |   
'---------------------------------'-------'
```

### Conversor Grafema-Fonema (G2P)
Compilação feita em versão `javac 1.8.0_162`.    
Instalação de dependências no Ubuntu/Debian:
```
sudo apt-get install openjdk-8-jdk
sudo apt-get install openjdk-8-jre
```

Compilação e execução do arquivo de teste, presente no diretório `g2p/`:
```
javac -cp ".:g2plib.jar" TestG2P.java
java -cp ".:g2p/g2plib.jar" g2p.TestG2P <PALAVRA>
```

`"PALAVRA"` é qualquer palavra da língua Português brasileiro com apenas
caracteres caixa baixa. Caso a localização da lib seja alterada, basta apenas
alterar o _classpath_ de `".:g2p/g2p.jar"` por `".:/absolute/path/to/lib.jar"`.

__Copyright 2005-2018 Grupo FalaBrasil__   
__Universidade Federal do Pará__
