package zad1.Wyjątki;

public class PowtórzenieParametruException extends Exception {

    public PowtórzenieParametruException(String parametr) {
        super("Powtórzenie parametru: " + parametr);
    }
}
