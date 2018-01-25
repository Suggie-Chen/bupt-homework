#include<stdio.h>
#include <string.h>
#include <ctype.h>
#include<stdlib.h>
int ai=0;												//记录已经是第几个单词 
                                        //记录每一个变量或关键字的值,-1为关键字，0为变量，1为数字 ,2为小数 ,3为指数 ,4为relop,5为\ 

int  num[1000]; 
int line=0;												//用来处理错误 
char jihao[100];										//记号 
int km=32;                                              //用来记录变量的属性 
char strin[1000][100];                                 //保存token的值 
int row=0;												//用来处理错误 
void error()
{
	printf("第%d行第%d列出问题\n",row,line); 
}
int reserveid(char A[])
{
	int i=0;
	while(i<ai)
	{
		if(strcmp(A,strin[i])==0)
		{
		
			printf(";;;%d",i);
			return num[i];
		}
			
		i++; 
	}
		km++;
		return km; 
}
int reserve(char token[])
{
	int i=0;
	char *p[32]={"auto","break","case","char","const","continue","default","do","double","else","enum","extern","float","for","goto","if","int","long","register","return","short","signed","sizeof","static","struct","switch","typedef","unsigned","union","void","volatile","while"};
	//printf("%s\n",token);
	while(i!=31)
	{
		if(strcmp(token,p[i])==0)
		{
			strcpy(jihao,p[i]) ;
			return i;
		}
			
		i++; 
	}
	return 0;
}
void cat(char c,char k[])
{
	k[strlen(k)] = c;
	k[strlen(k) + 1] = '\0';
}
int check(char &C,int STATE,char token[],FILE *fp,int &iskey)
{
	
	do{
	switch(STATE)
	{	
		case 0:	
		C=fgetc(fp);
		line++;
		while(C==32)
		{
			C=fgetc(fp);
			line++;
		}
			
		if(C=='\n')
		{
			row++;
			line=0;
		}
		memset(token, 0x00, sizeof (char) * 100); //全部设置为0x00即\0字符
			switch(C)
			{
				case 'a':
					STATE=1;
					break;
				case 'b':
					STATE=1;
					break;
				case 'c':
					STATE=1;
					break;
				case 'd':
					STATE=1;
					break;
				case 'e':
					STATE=1;
					break;
				case 'f':
					STATE=1;
					break;
				case 'g':
					STATE=1;
					break;
				case 'h':
					STATE=1;
					break;
				case 'i':
					STATE=1;
					break;
				case 'j':
					STATE=1;
					break;
				case 'k':
					STATE=1;
					break;
				case 'l':
					STATE=1;
					break;
				case 'm':
					STATE=1;
					break;
				case 'n':
					STATE=1;
					break;
				case 'o':
					STATE=1;
					break;
				case 'p':
					STATE=1;
					break;
				case 'q':
					STATE=1;
					break;
				case 'r':
					STATE=1;
					break;
				case 's':
					STATE=1;
					break;
				case 't':
					STATE=1;
					break;
				case 'u':
					STATE=1;
					break;
				case 'v':
					STATE=1;
					break;
				case 'w':
					STATE=1;
					break;
				case 'x':
					STATE=1;
					break;
				case 'y':
					STATE=1;
					break;
				case 'z':
					STATE=1;
					break;
				case 'A':
					STATE=1;
					break;
				case 'B':
					STATE=1;
					break;
				case 'C':
					STATE=1;
					break;
				case 'D':
					STATE=1;
					break;
				case 'E':
					STATE=1;
					break;
				case 'F':
					STATE=1;
					break;
				case 'G':
					STATE=1;
					break;
				case 'H':
					STATE=1;
					break;
				case 'I':
					STATE=1;
					break;
				case 'J':
					STATE=1;
					break;
				case 'K':
					STATE=1;
					break;
				case 'L':
					STATE=1;
					break;
				case 'M':
					STATE=1;
					break;
				case 'N':
					STATE=1;
					break;
				case 'O':
					STATE=1;
					break;
				case 'P':
					STATE=1;
					break;
				case 'Q':
					STATE=1;
					break;
				case 'R':
					STATE=1;
					break;
				case 'S':
					STATE=1;
					break;
				case 'T':
					STATE=1;
					break;
				case 'U':
					STATE=1;
					break;
				case 'V':
					STATE=1;
					break;
				case 'W':
					STATE=1;
					break;
				case 'X':
					STATE=1;
					break;
				case 'Y':
					STATE=1;
					break;
				case 'Z':
					STATE=1;
					break;
				case '0':
					STATE=2;
					break;
				case '1':
					STATE=2;
					break;
				case '2':
					STATE=2;
					break;
				case '3':
					STATE=2;
					break;
				case '4':
					STATE=2;
					break;
				case '5':
					STATE=2;
					break;
				case '6':
					STATE=2;
					break;
				case '7':
					STATE=2;
					break;
				case '8':
					STATE=2;
					break;
				case '9':
					STATE=2;
					break;
				case '<':
					STATE=8;
					break;
				case '>':
					STATE=9;
					break;
				case ':':
					STATE=10;
					break;
				case '/':
					STATE=11;
					break;
				case '=':
					STATE=12;
					break;
				case '+':
					STATE=13;
					break;
				case '-':
					STATE=14;
					break;
				case '&':
					STATE=15;
					break;
				case '#':
					STATE=0;
					break;
				case '*':
					STATE=0;
					break;
				case '(':
					STATE=0;
					cat(C,token);
					return -1;
					break;
				case ')':
					STATE=0;
					cat(C,token);
					return -1;
					break;
				case ';':
					STATE=0;
					break;
				case '\\': 
					STATE=0;
					break;
				case '_':
					STATE=16;
					break;
				case '\n':
					STATE=0;
					strcpy(token,"回车"); 
					//cat("回车",token);
					return -1;
					break;
				default :
					STATE =17;
					break;		
			}
			break;
		case 1:
			cat(C,token);
			C=fgetc(fp);
			line++;
			//while(C==32)
				//	C=fgetc(fp);
			if(isalnum(C)||C==95)
			{
				STATE=1;
			}	
			else
			{		
				fseek(fp,-1,SEEK_CUR);
				line--;
				STATE=0;
				iskey=reserve(token);
				if(iskey!=0) return iskey;
				else
				{
					iskey=reserveid(token);
					return iskey;
				}
				
			}
			break;
			case 2:
				cat(C,token);
				C=fgetc(fp);
				line++;
				switch(C)
				{
					case '0':
						STATE=2;
						break;
					case '1':
						STATE=2;
						break;
					case '2':
						STATE=2;
						break;
					case '3':
						STATE=2;
						break;
					case '4':
						STATE=2;
						break;
					case '5':
						STATE=2;
						break;
					case '6':
						STATE=2;
						break;
					case '7':
						STATE=2;
						break;
					case '8':
						STATE=2;
						break;
					case '9':
						STATE=2;
						break;
					case '.':
						STATE=3;
						break;
					case 'E':
						STATE=5;
						break;
					default:
						fseek(fp,-1,SEEK_CUR);
						line--;
						STATE=0;
						iskey=1;
						return iskey;
						break;
					}
					break;
			case 3:
				cat(C,token);
				C=fgetc(fp);
				line++;
				if(48<=C&&C<=57)
					STATE=4;
				else
				{
					error();
					STATE=0;
				}
				break;
			case 4:
				cat(C,token);
				C=fgetc(fp);
				line++;
				switch(C)
				{
					case '0':
						STATE=4;
						break;
					case '1':
						STATE=4;
						break;
					case '2':
						STATE=4;
						break;
					case '3':
						STATE=4;
						break;
					case '4':
						STATE=4;
						break;
					case '5':
						STATE=4;
						break;
					case '6':
						STATE=4;
						break;
					case '7':
						STATE=4;
						break;
					case '8':
						STATE=4;
						break;
					case '9':
						STATE=4;
						break;
					case 'E':
						STATE=5;
						break;
					default:
						fseek(fp,-1,SEEK_CUR);
						line--;
						STATE=0;
						iskey=2;
						return iskey;
						break;
				}
				break;
				case 5:
					cat(C,token);
					C=fgetc(fp);
					line++;
					switch(C)
					{
					case '0':
						STATE=7;
						break;
					case '1':
						STATE=7;
						break;
					case '2':
						STATE=7;
						break;
					case '3':
						STATE=7;
						break;
					case '4':
						STATE=7;
						break;
					case '5':
						STATE=7;
						break;
					case '6':
						STATE=7;
						break;
					case '7':
						STATE=7;
						break;
					case '8':
						STATE=7;
						break;
					case '9':
						STATE=7;
						break;
					case '+':
						STATE=6;
						break;
					case '-':
						STATE=6;
						break;
					default :
						fseek(fp,-1,SEEK_CUR);
						line--;
						error();
						STATE=0;
						break;	
					}
					break;	
				case 6:	
					cat(C,token);
					C=fgetc(fp);
					line++;
					if('0'<=C&&C<='9')
					{
						STATE=7;
					}
					else
					{
						fseek(fp,-1,SEEK_CUR);
						line--;
						error();
						STATE=0;
					}
					break;
				case 7:
					cat(C,token);
					C=fgetc(fp);
					line++;
					if('0'<=C&&C<='9')
					{
						STATE=7;
					}
					else
					{
						fseek(fp,-1,SEEK_CUR);
						line--;
						STATE=0;
						iskey=3;
						return iskey;
					}
					break; 
				
				case 8:
					cat(C,token);
					C=fgetc(fp);
					line++;
					switch(C)
					{
						case '=':
							cat(C,token);
							strcpy(jihao,"relop");
							STATE=0;
							iskey=4;
							return iskey;
							break;
						default:
							fseek(fp,-1,SEEK_CUR);
							line--;
							STATE=0;
							strcpy(jihao,"relop");
							return 4;
							break;
							
							 
					}
				break;
				case 9:
					cat(C,token);
					C=fgetc(fp);
					line++;
					switch(C)
					{
						case '=':
							cat(C,token);
							STATE=0;
							iskey=4;
							return iskey;
							break;
						default:
							fseek(fp,-1,SEEK_CUR);
							line--;
							STATE=0;
							return 4;
							break;		 
					}
				break;
				case 10:
					cat(C,token);
					//fseek(fp,-1,SEEK_CUR);
						iskey=4;
						return iskey;
					
				break;
				case 11:
					cat(C,token);
					C=fgetc(fp);
					line++;
					switch(C)
					{
						case '/':
							C=fgetc(fp);
							line++;
							while(C!='\n')
							{
								C=fgetc(fp);
								line++;
								if(C=='\n')
								{
									fseek(fp,-1,SEEK_CUR);
									break;
								}
									 
							}
										
							STATE=0;
							break;
						case '*':
							STATE=12;
							break;	
						default:
							fseek(fp,-1,SEEK_CUR);
							line--;
							STATE=0;
							iskey=5;
							return 5;
							break;		 
					}
					break;
				case 12:
					C=fgetc(fp);
					line++;
					while(C!='*')
					{
						C=fgetc(fp);
						line++;
					}	
					C=fgetc(fp);
					line++;
					if(C=='/')
						STATE=0;
					else
						STATE=12;
					break;
				case 17:
					error();
					STATE=0;
					break;
				
					
					
							
	}
		
				
	 
	}while(C!=EOF);	
}
int main()
{
	int iskey=3;                                           //-1是非关键字 ，其他是关键字 
	FILE *fp=NULL;
	fp = fopen("S:\\aboutcode\\bianyi\\C.txt", "r");
	char C;  												//每次读取一个字符 
	int STATE=0;											//状态 
	char FLAG[2];                                           //记录返回的属性 
	char token[100];                                        //记录正在识别的字符串 
	int  num[1000];                                         //记录每一个变量或关键字的值,-1为关键字，0为变量，1为数字 ,2为小数 ,3为指数 ,4为relop,5为\ 
//	char strin1[1000][100];                                 //保存token的值 
	//int ai=0;
	do
	{
		num[ai]=check( C, STATE, token,fp,iskey);
		//strin1[ai]={"123"};
		if(C!=EOF)
		{
			
		
		strcpy(strin[ai],token); 
		
	//	system("pause");
		printf("%s\t",strin[ai]);	
		printf("<");	
		printf("%s,",jihao);
		printf("%d>\n",num[ai]);
		memset(token, 0x00, sizeof (char) * 100); //全部设置为0x00即\0字符
		memset(jihao, 0x00, sizeof (char) * 100); //全部设置为0x00即\0字符
	
		iskey=-1;
		ai++;
		}
			
	}while(C!=EOF) ;
//	printf("%c",C);
for(int t=0;t<ai;t++)
{
	printf("%d\t",num[t]);
}
	fclose(fp);
	
} 
