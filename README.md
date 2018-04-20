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

- __HTK__: 
Abaixo, exemplo de palavras do dicionário são mostradas, seguidas das suas
respectivas transcrições. A ordenação das palavras baseada no valor ASCII é 
importante para o HTK para evitar erros como, por exemplo, o retornado pelo
HDMan.

> HDMan ERROR [+1452] ReadDictProns: word 'acaso' out of order in dict dict.dic

```
</s>     []  sil 
<s>      []  sil 
<unk>    []  sil 
coração      k o r a s a~ w~ sp
história     i s t O r i a sp 
palhinha     p a L i~ J a sp
sil          sil
árvore       a R v o r i sp
ética        E tS i k a sp 
índio        i~ dZ i u sp 
órgão        O R g a~ w~ sp
```

- __Sphinx__: 
O [tutorial](https://cmusphinx.github.io/wiki/tutorialam/) para treino do modelo
acústico com o pacote SphinxTrain deixa claro algumas condições sobre o
dicionário fonético, conforme visto abaixo:

>Do not use case-sensitive variants like "e" and "E".   
>Sphinxtrain doesn’t support some special characters like "\*" or "/"  
>To be safe we recommend you to use alphanumeric-only phone-set.

```
<s>          SIL
</s>         SIL
<sil>        SIL
árvore       a rm v o r i sp
coração      k o r a s aa ww sp
ética        em ts i k a sp
história     i s t om r i a sp
índio        ii dz i u sp
órgão        om rm g aa ww sp
palhinha     p a lm ii jm a sp
```

- __Kaldi__: 
Coming soon.

```
</s>         sil
<s>          sil
<unk>        sil 
árvore       a R v o r i sp 
coração      k o r a s a~ w~ sp 
ética        E tS i k a sp 
história     i s t O r i a sp 
índio        i~ dZ i u sp 
órgão        O R g a~ w~ sp 
palhinha     p a L i~ J a sp 
sil          sil
```

## Conversor Grafema-Fonema (G2P)
Coming soon.

__Copyright 2005-2018 Grupo FalaBrasil__   
__Universidade Federal do Pará__
