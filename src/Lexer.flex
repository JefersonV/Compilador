import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"

/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*

/* Número */
Numero = 0 | [1-9][0-9]*
%%

/* Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }

/*Identificador*/
\${Identificador} { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn); }

/*Tipos de dato*/
número |
color { return token(yytext(), "TIPO_DATO", yyline, yycolumn); }

/*Número*/
{Numero} { return token(yytext(), "NUMERO", yyline, yycolumn); }

/*Colores*/
#[{Letra}|{Digito}]{6} { return token(yytext(), "COLOR", yyline, yycolumn); }

/* Operadores de Agrupación*/
"(" { return token(yytext(), "PARENTESIS_A", yyline, yycolumn); }
")" { return token(yytext(), "PARENTESIS_C", yyline, yycolumn); }
"{" { return token(yytext(), "LLAVE_A", yyline, yycolumn); }
"}" { return token(yytext(), "LLAVE_C", yyline, yycolumn); }

/*Signos de Puntuación*/
"," { return token(yytext(), "COMA", yyline, yycolumn); }
";" { return token(yytext(), "PUNTO_COMA", yyline, yycolumn); }

/*Operador de asignación*/
--> { return token(yytext(), "OP_ASIG", yyline, yycolumn); }

/*Movimiento*/
adelante |
atrás |
izquierda |
derecha |
norte |
sur |
este |
oeste { return token(yytext(), "MOVIMIENTO", yyline, yycolumn); }

/*Pintar*/
pintar { return token(yytext(), "PINTAR", yyline, yycolumn); }

/*Detener pintar*/
detenerPintar { return token(yytext(), "DETENER_PINTAR", yyline, yycolumn); }

/*Tomar*/
tomar |
poner { return token(yytext(), "TOMAR", yyline, yycolumn); }

/*Lanzar moneda*/
lanzarMoneda { return token(yytext(), "LANZAR", yyline, yycolumn); }

/*Ver*/
izquierdaEsObstáculo |
izquierdaEsClaro |
izquierdaEsBaliza |
izquierdaEsBlanco |
la izquierda es negra |
frenteEsObstáculo |
frenteEsClaro |
frenteEsBaliza |
frenteEsBlanco |
frenteEsNegro |
derechaEsObstáculo |
derechaEsClaro |
derechaEsBaliza |
derechaEsBlanco |
derechaEsNegro { return token(yytext(), "VER", yyline, yycolumn); }

/*Estructuras de control*/
mientras |
repetirMientras { return token(yytext(), "CICLO_M", yyline, yycolumn); }

/*Detener mientras*/
interrumpir { return token(yytext(), "ROMPE_CICLO", yyline, yycolumn); }

/*Condicional*/
si |
sino { return token(yytext(), "ESTRUCTURA_SI", yyline, yycolumn); }

/*Operadores lógicos*/
"&" |
"|" |
"!" { return token(yytext(), "OP_LOGICO", yyline, yycolumn); }

/* Fin programa */
final { return token(yytext(), "FIN", yyline, yycolumn); }

/* Número erróneo */
0{Numero} { return token(yytext(), "ERROR_1", yyline, yycolumn); }

/* Identificador Erróneo*/
{Identificador} { return token(yytext(), "ERROR_2", yyline, yycolumn); }

. { return token(yytext(), "ERROR", yyline, yycolumn); }