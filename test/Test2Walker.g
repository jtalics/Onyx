tree grammar Test2Walker;
options {
	tokenVocab=Test2;
	ASTLabelType=CommonTree;
}

@header {
package com.cboe.onyx;
}

tester //PREV7 FAILS with input "username 'myName'"
	: a=noun b=VALUE
	{
		System.out.println("WALKER: "+$a.text+" "+$b.text);
	}
	;

noun
	: USERNAME
	;
