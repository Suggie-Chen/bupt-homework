%{ 
#include <string.h> 
#include <stdio.h> 
%} 
digit  [0-9] 
number  {digit}+ 
decimal	{digit}+(\.{digit}+)
%%
{number}  { int temp; 
	    sscanf(yytext,"%d",&temp);
	    yylval = temp;
	    return NUM; }
{decimal} {double temp;
	   sscanf(yytext,"%lf",&temp);
	   yylval = temp;
	   return DECIMAL;}
"\n"	{ return * yytext; } 
.	{ return * yytext; } 
%%
int yywrap() 
{  
	return 1; 
}
