%{
#include<ctype.h>
#include<stdio.h>
#define YYSTYPE int
char k='#';
%}
%token NUM
%%
line :  expr'\n'   {printf("E:%d\n",$1);}
	;
expr: expr'+'term {$$=$1+$3;printf("E->E+T\n");}
	| expr'-'term {$$=$1-$3;printf("E->E-T\n");}
	|term		{$$=$1;printf("E->T\n");}
	;
term: term'*'factor {$$=$1*$3;printf("T->T*F\n");}
	|term'/'factor	{$$=$1/$3;printf("T->T/F\n");}
	|factor			{$$=$1;printf("T->F\n");}
	;
factor: '('expr')' {$$=$2;printf("F->(E)\n");}
	|NUM			{$$=$1;printf("F->NUM\n");}
	;
%%
int main(void)
{
	yyparse();
	return 0;
}
int yylex(void)
{
	int flag=0;
	static int done=0;//设定返回值
	char c;
	int num=0;
	if(done==1)
		return 0;
	 while ((c = getchar ()) == ' ');
	while(c>='0'&&c<'10')
    {
      num=10*num+(c-'0');
	  c=getchar();
		flag=1;
    } 
	if(flag==1)
	{
		ungetc (c, stdin);
		yylval=num;
		return NUM;
	}
	
	if(c=='\n')
			done=1;
	return c;
		
	
	
}
void yyerror(char *s)
{
	printf("%s\n",s);
}

