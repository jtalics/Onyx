tree grammar Test1Walker;
options {
	tokenVocab=Test1; // use tokens in Test1
	ASTLabelType=CommonTree; // use CommonTree nodes
}

@header {
package com.cboe.onyx;
import java.util.Map;
import java.util.HashMap;
}

@members {
private Map<String, String> _map = new HashMap<String,String>();
}

tester //PREV7 FAILS with input "username 'myName'"
	: a=noun b=VALUE
	{
		System.out.println("WALKER: "+$a.text+" "+$b.text);
	}
	;

testerPREV6
	: a=VALUE b=VALUE
	{
		System.out.println($a.text+$b.text);
	}
	;

testerPREV5
	: a=noun b=VALUE
	{
		System.out.println($a.text +"="+ $b.text);
	}
	;

testerPREV4
	: a=noun b=VALUE c=noun d=VALUE
	{
		System.out.println($a.text +"="+ $b.text);
		System.out.println($c.text +"="+ $d.text);
	}
	;

testerPREV2
	: noun VALUE noun VALUE
	;
	
testerPREV3
	: a=noun b=VALUE c=noun d=VALUE
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

testerPREV
	: mapper[new HashMap<String,String>()]
	{
		for (Map.Entry<String,String> entry : _map.entrySet()) {
			System.out.println(
			 	entry.getKey() +" = "+entry.getValue()+" "
			);
		}
	}
	;

mapper[Map map]
	: (keyValue[map])(keyValue[map])*
	;

keyValue[Map map] returns [String key, String val]
	: noun VALUE
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
