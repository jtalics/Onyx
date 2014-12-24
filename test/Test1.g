grammar Test1;

options {
	language=Java;
	output=AST;
}

tokens {
    LOGIN='login';
    USERNAME='username';
    PASSWORD='password';
	WHERE='where';
}

@header {
package com.cboe.onyx;
import java.util.Map;
import java.util.HashMap;
}

@lexer::header{ 
package com.cboe.onyx;
import java.util.Map;
import java.util.HashMap;
}

@members {
private Map<String, String> _map = new HashMap<String,String>();
}

tester // PASSES "username 'myName'"
	: a=noun WS! b=VALUE
	{
		System.out.println("PARSER: " + $a.text+" "+$b.text);
	}
	;

testerPREV6
	: a=VALUE WS! b=VALUE
	{
		System.out.println("PARSER: "+$a.text+$b.text);
	}
	;

testerPREV5
	: a=noun WS!? '='! WS!? b=VALUE EOF!
	{
		System.out.println($a.text +"="+ $b.text);
	}
	;

testerPREV4
	: a=noun '='! b=VALUE WS! c=noun '='! d=VALUE EOF!
	{
		System.out.println($a.text +"="+ $b.text);
		System.out.println($c.text +"="+ $d.text);
	}
	;

testerPREV3
	: a=noun '='! b=VALUE WS! c=noun '='! d=VALUE EOF!
	{
		_map.put($a.text,$b.text);
		_map.put($c.text,$d.text);
		for (Map.Entry<String,String> entry : _map.entrySet()) {
			System.out.println(
			 	entry.getKey() +" = "+entry.getValue()+" "
			);
		}
	}
	;

testerPREV2
	: noun '='! VALUE WS! noun '='! VALUE EOF!
	;

testerPREV
	: mapper[new HashMap<String,String>()] EOF
	{
		for (Map.Entry<String,String> entry : _map.entrySet()) {
			System.out.println(
			 	entry.getKey() +" = "+entry.getValue()+" "
			);
		}
	}
	;

mapper[Map map]
	: (keyValue[map])(WS! keyValue[map])*
	;

keyValue[Map map] returns [String key, String val]
	: noun WS!? '='! WS!? VALUE
	{
		$key = $noun.text; 
		$val = $VALUE.text;
		$map.put($key,$val);
	}
	;


noun
	: 
	| USERNAME
	| PASSWORD
	;

NEWLINE 
	: '\r'? '\n' 
	;

WS 
	: (' '|'\t'|'\n'|'\r')+
	;

VALUE: 
	( '"' (~'"')* '"'
		| '\'' (~'\'')* '\''
	)
	;

