# Dicionários Fonéticos e Conversão G2P
Dicionários fonéticos e _software_ conversor grafema-fonema (g2p)
disponibilizadas de forma gratuita<sup>\*</sup> pelo Grupo FalaBrasil.

<sup>\*</sup>Informações sobre a licença no arquivo _LICENSE_

## Dicionários Fonéticos
Os dicionários fonéticos contém ao todo 40 fonemas (38, mais um modelo de
silêncio e um de _short pause_ ). Todos os dicionários abaixo contém o modelo
de pausa curta (sp) no final. Se o sp não for desejado, pode-se removê-lo com
o simples comando `sed 's/sp$//g' fb_XXXdict.dic > novo_dict.dic`. Os
dicionários também foram ordenado em ordem alfabética de acordo com o valor
ASCII dos caracteres com o comando `LC_ALL=C sort dic > fb_XXXdict.dic`.

- [HTK](http://htk.eng.cam.ac.uk/):
Abaixo, exemplo de palavras do dicionário são mostradas, seguidas das suas
respectivas transcrições.

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

- [CMU Sphinx](https://cmusphinx.github.io/)
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

- [Kaldi](http://kaldi-asr.org/)
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
