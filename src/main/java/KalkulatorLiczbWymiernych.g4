grammar KalkulatorLiczbWymiernych;

//nie wiem co to ale wazne
start_rule: <wazneDzialazTym>;

wyrazenie:
           <assoc=right> wyrazenie(Potega)Licznik
           |wyrazenie(Mnozenie|Dzielenie)wyrazenie
           |wyrazenie(Modulo|Kongruencja)wyrazenie
           |wyrazenie(Dodawanie|Odejmowanie)wyrazenie
           |operacja1
           |liczba
           |'('wyrazenie')';


 operacja1    :op=(WartoscBezwzgledna
                            | Podloga
                            | Sufit
                            |Zaokraglenie
                            |Negacja
                            |Pierwiastek) '('(liczba|wyrazenie)')'
                |(Max | Min) '('wyrazenie','wyrazenie')';

 liczba: LICZBA;

 Dodawanie   :   '+';
 Odejmowanie :   '-';
 Mnozenie    :   '*';
 Dzielenie   :   ':';
 Modulo      :   '%';
 WartoscBezwzgledna  :   'abs';
 Podloga     :   'p';
 Sufit       :   's';
 Zaokraglenie    :   'z';
 Negacja     :   '~';
 Kongruencja :   'k';
 Potega      :   '^';
 Pierwiastek :   'sqrt';
 Max         :   'max';
 Min         :   'min';

 LICZBA      :   Licznik |   Ulamek ;

 WS : [ \t\r\n]+ -> skip ;
 Licznik     :   '0'   |     [1-9]+ [0-9]*;
 Ulamek      :   Licznik MIANOWNIK?;

fragment KRESKAULAMKOWA  :   '/';
fragment MIANOWNIK       :   KRESKAULAMKOWA [0-9]*;


