package Analizador;
import static Analizador.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n,\f]+
%{
    public String lexemas;
%}
%%
/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Tipos de datos */
/* Byte */
( byte ) {lexemas=yytext(); return T_byte;}
/* Int */
( int ) {lexemas=yytext(); return T_int;}
/* Char */
( char ) {lexemas=yytext(); return T_char;}
/* Long */
( long ) {lexemas=yytext(); return T_long;}
/* Float */
( float ) {lexemas=yytext(); return T_float;}
/* Double */
( double ) {lexemas=yytext(); return T_double;}
/* Tipo de dato String */
( string ) {lexemas=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexemas=yytext(); return If;}
/* Palabra reservada Else */
( else ) {lexemas=yytext(); return Else;}
/* Palabra reservada While */
( while ) {lexemas=yytext(); return While;}
/* Palabra reservada Switch */
( switch ) {lexemas=yytext(); return Switch;}
/* Palabra reservada Default */
( default ) {lexemas=yytext(); return Default;}
/* Palabra reservada For */
( for ) {lexemas=yytext(); return For;}
/* Palabra reservada Do */
( do ) {lexemas=yytext(); return Do;}

/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}
/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}
/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}
/* Operador Multiplicacion */
( "*" ) {lexemas=yytext(); return Multiplicacion;}
/* Operador Division */
( "/" ) {lexemas=yytext(); return Division;}

/* Operadores logicos */
/* AND */
( "&&" ) {lexemas=yytext(); return Op_and;}
/* OR */
( "||" ) {lexemas=yytext(); return Op_or;}
/* NOT */
( "!" ) {lexemas=yytext(); return Op_not;}
/* AND BINARIO */
( "&" ) {lexemas=yytext(); return Op_andB;}
/* OR BINARIO */
( "|" ) {lexemas=yytext(); return Op_orB;}

/*Operadores Relacionales */
/*mayor que*/
( ">" ) {lexemas = yytext(); return Op_mayor;}
/*menor que*/
( "<" ) {lexemas = yytext(); return Op_menor;}
/*igual que*/
( "==" ) {lexemas = yytext(); return Op_igual;}
/*diferente que*/
( "!=" ) {lexemas = yytext(); return Op_diferente;}
/*mayor o igual que*/
( ">=" ) {lexemas = yytext(); return Op_mayorE;}
/*menor o igual que*/
( "<=" ) {lexemas = yytext(); return Op_menorE;}
/*desplazamiento a la izquierda*/
( "<<" ) {lexemas = yytext(); return Op_desIzq;}
/*desplazamiento a la derecha*/
( ">>" ) {lexemas = yytext(); return Op_desDer;}

/* Operadores Atribucion */
/* Asignacion y suma */
( "+=" ) {lexemas = yytext(); return Op_asigSuma;}
/* Asignacion y resta */
( "-=" ) {lexemas = yytext(); return Op_asigResta;}
/* Asignacion y multiplicacion */
(  "*=" ) {lexemas = yytext(); return Op_asigMult;}
/* Asignacion y division */
( "/=" ) {lexemas = yytext(); return Op_asigDiv;}
/* Asignacion y resto */
( "%=" ) {lexemas = yytext(); return Op_asigResto;}

/* Operadores Incremento */
( "++" ) {lexemas = yytext(); return Op_incremento;}
/* Operadores decremento */
( "--" ) {lexemas = yytext(); return Op_decremento;}

/*Operadores Booleanos*/
/* True */
(true) {lexemas = yytext(); return Op_boolTrue;}
/* False */
(false) {lexemas = yytext(); return Op_boolFalse;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parentesis_a;}
/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}
/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexemas = yytext(); return Corchete_a;}
/* Corchete de cierre */
( "]" ) {lexemas = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* Marcador de inicio de metodos */
( "void" ) {lexemas=yytext(); return Void;}

/* Marcador de inicio de impresion en pantalla */
( "printf" ) {lexemas=yytext(); return Printf;}

/* Marcador de inicio de lectura en pantalla */
( "scanf" ) {lexemas=yytext(); return Scanf;}

/* Punto y coma */
( ";" ) {lexemas=yytext(); return P_coma;}
/* Punto */
( "." ) {lexemas=yytext(); return Punto;}
/* Coma */
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}