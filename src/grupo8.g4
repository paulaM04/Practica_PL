grammar grupo8;

@header{
    import java.io.PrintStream;
    import java.io.FileNotFoundException;
}
@members{
    private void inicioPrograma(){
        try{
            PrintStream archivo = new PrintStream("output.txt");
            System.setOut(archivo);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

//prg returns [Program prog]:'program' ID {$prog=new Program($ID.text, false);} ';' blq {$prog.setHayBloque(true);}'.'{System.out.println($prog.toString());};
//blq returns [Boolean bloq]: dcllist 'begin' sentlist 'end' {$bloq=true;};
//dcllist: dcl dcllist | ;

sentlist: sent sentlistPrima;
sentlistPrima : sent sentlistPrima| ;

//dcl : defcte | defvar | defproc| deffun;
//defcte returns [Variable varCte]: 'const' ctelist ;
//ctelist returns [Variable var] : ID '=' simpvalue {$var=new Variable($ID.text, $simpvalue.valor);}';'  ctelistPrima;
//ctelistPrima [Variable varP]: ID '=' simpvalue ';' ctelistPrima {$varP=new Variable($ID.text, $simpvalue.valor);}| ;
simpvalue returns [String valor]: CONSTINT {$valor=$CONSTINT.text;}| CONSTREAL  {$valor=$CONSTREAL.text;}| CONSTLIT {$valor=$CONSTLIT.text;};
defvar: 'var' defvarlist;
defvarlist : varlist ':' tbas ';' defvarlistPrima;
defvarlistPrima: varlist ':' tbas ';'| ;
varlist : ID  varlistAux;
varlistAux:',' varlist|;
defproc : 'procedure' ID formal_paramlist ';' blq ';';

deffun: 'function' ID formal_paramlist ':' tbas ';' blq ';';
formal_paramlist : '('formal_param')'| ;
formal_param: varlist formal_paramAux1 ;
formal_paramAux1:':' tbas formal_paramAux2;
formal_paramAux2:';' formal_param|;
tbas returns [String vlex]: 'INTEGER' {$vlex="int";} | 'REAL' {$vlex="float";};


sentAux:asig ';'| proc_call ';';
asig: ':=' exp ;
sent: ID sentAux;

exp: factor expPrima;
expPrima: op factor expPrima|;
op returns [String ope]: '+' {$ope="+";} | '-'{$ope="-";} | '*' {$ope="*";} | 'div'{$ope="/";} | 'mod'{$ope="%";};
factor : ID subparamlist|'('exp')'|simpvalue;
subparamlist :'(' explist')' |;
explist: exp explistAux;
explistAux:',' varlist|;
proc_call:  subparamlist;


CONSTINT: ('+'|'-')?[0-9]+;
CONSTREAL: [+-]? [0-9]+ ('.'[0-9]+ ([e][+-]?[0-9]+)? | [e][+-]?[0-9]+);
ID: [a-zA-Z][a-zA-Z0-9_]*;
CONSTLIT: '\''+([a-zA-Z0-9_: ] | ('\\\''))* '\'';
COMENTARIOS_UNA_LINEA: '{'~[\n]*'}'->skip;
COMENTARIOS_MAS_LINEAS: '('([ ]|' '[)])'*)' ->skip;
WS: [\n\r\t ] -> skip;
