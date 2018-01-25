%token NUM
%token DECIMAL
%{
#include <stdio.h>
#include <ctype.h>
#define YYSTYPE double//更改缺省的int
%}


%%
s:expr'\n'		{printf("运算结果为：%lf\n",$1);return 0;}
	;
expr:expr'+'term	{$$=$1+$3;printf("E -> E + T\t");printf("E = %lf + %lf = %lf\n",$1,$3,$$);}
	|expr'-'term	{$$=$1-$3;printf("E -> E - T\t");printf("E = %lf - %lf = %lf\n",$1,$3,$$);}
	|term		{$$=$1;printf("E -> T\t");printf("E = %lf\n",$1);}
	;
term:term'*'factor	{$$=$1*$3;printf("T -> T * F\t");printf("T = %lf * %lf = %lf\n",$1,$3,$$);}
	|term'/'factor	{$$=$1/$3;if($3==0) {yyerror("除零"); return 0;} printf("T -> T / F\t");printf("T = %lf / %lf = %lf\n",$1,$3,$$);}
	|factor			{$$=$1;printf("T -> F\t");printf("T = %lf\n",$1);}
	;
factor:DECIMAL			{$$=$1;printf("F -> NUM.NUM\t");printf("F = %lf\n",$1);}
	|'('expr')'		{$$=$2;printf("F -> (E)\t");printf("F = %lf\n",$1);}
	|NUM			{$$=$1;int temp;temp=$1;printf("F -> NUM\t");printf("F = %d\n",temp);}
	;
%%
#include "lex.yy.c"
int main(){
yyparse();
return 0;
}
void yyerror(char * s){
printf("%s\n",s);
printf("出错");
}
