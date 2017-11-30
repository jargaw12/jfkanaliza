grammar KalkulatorLiczbWymiernych;

//definicja wyrażenia
wyrazenie:
           <assoc=right> wyrazenie(Potega)wyrazenie
           |wyrazenie(Mnozenie|Dzielenie)wyrazenie
           |wyrazenie(Modulo|Kongruencja)wyrazenie
           |wyrazenie(Dodawanie|Odejmowanie)wyrazenie
           |funkcja1
           |funkcja2
           |liczba
           |'('wyrazenie')';

//funkcje jednoargumentowe
 funkcja1    :f1 = (WartoscBezwzgledna
                            | Podloga
                            | Sufit
                            |Zaokraglenie
                            |Negacja
                            |Pierwiastek) '('(wyrazenie)')';

 //funkcje dwuargumentowe
 funkcja2   :f2 = (Max | Min) '('wyrazenie','wyrazenie')';

 liczba: Liczba;

//oznaczenie poszczególnych operacji
 Dodawanie   :   '+';
 Odejmowanie :   '-';
 Mnozenie    :   '*';
 Dzielenie   :   ':';
 Modulo      :   '%';
 WartoscBezwzgledna  :   'abs';
 Podloga     :   'p';
 Sufit       :   's';
 Zaokraglenie    :   'z';
 Negacja     :   '!';
 Kongruencja :   'k';
 Potega      :   '^';
 Pierwiastek :   'sqrt';
 Max         :   'max';
 Min         :   'min';

//definicja liczby
 Liczba      :   Licznik MIANOWNIK? |'(-'Licznik MIANOWNIK?')';

 //definicja licznika
 Licznik     :   '0'   |     [1-9]+ [0-9]*|'(-'[1-9]+ [0-9]*')';

//ignorowanie znaków białych
 WS : [ \t\r\n]+ -> skip ;
fragment KRESKAULAMKOWA  :   '/';
fragment MIANOWNIK       :   KRESKAULAMKOWA [1-9]+ [0-9]*;


