------  Card_Manager_API  ------	

Card_Manager � uma biblioteca para manipula��es b�sicas
sobre um baralho de cartas comum.
O seu deck � composto por 52 cartas.

Opera��es b�sicas s�o:
 - Ver baralho, consultar quantidade, embaralhar, 
 - Criar monte de descarte, mover cartas do in�cio ao fim,
 - do fim ao in�cio e cortar deck ao meio.

Para compilar baixe a �ltima vers�o do Maven em 
http://maven.apache.org/download.html

Requisitos de Sistema
---------------------
Maven:
  Testado com a vers�o 3.0.4
JDK:
  1.5 ou superior; necess�rio para executar o Maven.
Mem�ria:
  N�o h� um m�nimo estipulado.
Disco:
  N�o h� um m�nimo estipulado.
Sistema Operacional:
  Windows XP ou superior, 
Internet:
  Uma conex�o com a internet ser� necess�ria.


Composi��o da Biblioteca
------------------------

  A biblioteca � composta dos seguintes arquivos .java:
  - Baralho_Cartas.java
  - Carta.java

  O arquivo Main_Jogo.java � uma classe que faz uso das funcionalidades
  da biblioteca. E n�o deve ser compilado com a biblioteca.


Compilando a Biblioteca
-----------------------

1) Instalar o Maven conforme seu manual de instala��o.

2) A pasta da biblioteca deve conter uma pasta dos fontes "cardmanager" e um arquivo pom.xml

3) Navegar pelo prompt de comando at� o diret�rio com os arquivos.   

4) Executar o comando: mvn clean install
   Este comando compilar� os arquivos .java do diret�rio com os fontes.

5) O resultado ser� uma biblioteca .jar, geralmente na pasta target;
   este arquivo poder� ser utilizada em qualquer projeto Java como qualquer 
   outra biblioteca.