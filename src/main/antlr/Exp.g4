/*
 * The operator preceedence copies the C++ behaviour and is taken from
 * https://en.cppreference.com/w/cpp/language/operator_precedence
 */

grammar Exp;

eval returns [int value]
    :    exp=precedence15 {$value = $exp.value;}
    ;

precedence15 returns [int value]
    :   o1=precedence14 {$value = $o1.value;}
        ('||' o2=precedence14 {$value = ((($o1.value != 0) || ($o2.value != 0))) ? 1 : 0;}
        )*
    ;

precedence14 returns [int value]
    :   o1=precedence10 {$value = $o1.value;}
        ('&&' o2=precedence10 {$value = ((($o1.value != 0) && ($o2.value != 0))) ? 1 : 0;}
        )*
    ;

precedence10 returns [int value]
    :    o1=precedence9 {$value = $o1.value;}
        ( '==' o2=precedence9 {$value = ($o1.value == $o2.value) ? 1 : 0;}
        | '!=' o2=precedence9 {$value = ($o1.value != $o2.value) ? 1 : 0;}
        )*
    ;

precedence9 returns [int value]
    :    o1=precedence6 {$value = $o1.value;}
        ( '<' o2=precedence6 {$value = ($o1.value < $o2.value) ? 1 : 0;}
        | '<=' o2=precedence6 {$value = ($o1.value <= $o2.value) ? 1 : 0;}
        | '>' o2=precedence6 {$value = ($o1.value > $o2.value) ? 1 : 0;}
        | '>=' o2=precedence6 {$value = ($o1.value >= $o2.value) ? 1 : 0;}
        )*
    ;

precedence6 returns [int value]
    :    o1=precedence5 {$value =  $o1.value;}
         ( '+' o2=precedence5 {$value += $o2.value;}
         | '-' o2=precedence5 {$value -= $o2.value;}
         )*
    ;

precedence5 returns [int value]
    :    o1=atomExp {$value =  $o1.value;}
         ( '*' o2=atomExp {$value *= $o2.value;}
         | '/' o2=atomExp {$value /= $o2.value;}
         | '%' o2=atomExp {$value %= $o2.value;}
         )*
    ;

atomExp returns [int value]
    :    n=Number {$value = Integer.parseInt($n.text);}
    |    '(' exp=precedence15 ')' {$value = $exp.value;}
    ;

Number
    :    ('0'..'9')+
    ;

WS : (' ' | '\t' | '\r'| '\n') -> skip;