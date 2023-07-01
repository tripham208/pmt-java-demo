package vn.id.pmt.java.exception;

class CurrenciesDoNotMatchException extends Exception {
    public CurrenciesDoNotMatchException(String msg) {
        super(msg);
    }
}

class Amount {
    private final String currency;
    private int amount;

    public Amount(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) throws Exception {
        if(!this.currency.equals(that.currency)) {
            throw new CurrenciesDoNotMatchException("Currencies Don't Match : " + this.currency + " & " + that.currency);
        }
        this.amount += that.amount;
    }

    public String toString() {
        return amount + " " + currency;
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) {
        Amount amount1 = new Amount("USD", 10);
        //Amount amount2 = new Amount("USD", 20);
        Amount amount2 = new Amount("EUR", 20);
        try {
            amount1.add(amount2);
            System.out.println(amount1);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}