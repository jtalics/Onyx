grammar Test2;

options {
	language=Java;
	output=AST;
}

tokens {
    USERNAME='username';
}

@header {
package com.cboe.onyx;
}

@lexer::header{ 
package com.cboe.onyx;
}

tester // PASSES "username 'myName'"
	: a=noun ' '! b=VALUE
	{
		System.out.println("PARSER: " + $a.text+" "+$b.text);
	}
	;

noun
	: USERNAME
	;

VALUE: 
	('\'' (~'\'')* '\'')
	;

