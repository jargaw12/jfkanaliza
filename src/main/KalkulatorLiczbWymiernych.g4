grammar KalkulatorLiczbWymiernych;

//nie wiem co to ale wazne
start_rule: <wazneDzialazTym>;
//definicja wyrażenia
wyrazenie:
           <assoc=right> wyrazenie(Potega)wyrazenie
           |wyrazenie(Mnozenie|Dzielenie)wyrazenie
           |wyrazenie(Modulo|Kongruencja)wyrazenie
           |wyrazenie(Dodawanie|Odejmowanie)wyrazenie
           |operacja1
           |liczba
           |'('wyrazenie')';

//operacje jednoargumentowe
 operacja1    :op=(WartoscBezwzgledna
                            | Podloga
                            | Sufit
                            |Zaokraglenie
                            |Negacja
                            |Pierwiastek) '('(wyrazenie)')'
                |opm=(Max | Min) '('wyrazenie','wyrazenie')';

 liczba: LICZBA;
 potega :Licznik;

//oznaczenie poszczególnych funkcji
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

//definicja liczby(może to być sam licznik(czyli liczba całkowita) albo ułamek(licznik'/'mianownik)
 LICZBA      :   Licznik MIANOWNIK? |'(-'Licznik MIANOWNIK?')';

//ignorowanie znaków białych
 WS : [ \t\r\n]+ -> skip ;
 //definicja licznika
 Licznik     :   '0'   |     [1-9]+ [0-9]*|'(-'[1-9]+ [0-9]*')';
  //definicja ułamka(licznik obligatoryjny, mianownik opcjonalny
 //Ulamek      :   Licznik MIANOWNIK?;

fragment KRESKAULAMKOWA  :   '/';
fragment MIANOWNIK       :   KRESKAULAMKOWA [1-9]+ [0-9]*;


