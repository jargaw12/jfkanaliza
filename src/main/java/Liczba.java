public class Liczba {
    int licznik;
    int mianownik;

    public int getLicznik() {
        return licznik;
    }

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }

    public int getMianownik() {
        return mianownik;
    }

    public void setMianownik(int mianownik) {
        this.mianownik = mianownik;
    }

    public Liczba(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public Liczba() {
    }

    public void zmien(int licznik, int mianownik){
        this.licznik=licznik;
        this.mianownik=mianownik;
    }

    @Override
    public String toString() {
        return  licznik + "/" + mianownik;
    }
}
