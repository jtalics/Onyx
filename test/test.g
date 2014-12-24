grammar test;

options {
language=Java;
}

tokens {
TEST='test';
}

@header {
package org.antlr.test;
}
@lexer::header{ package org.antlr.test; } 
@member {
}

INT	:	'0'..'9'+ ;
parse
  :  INT
  ;

