package StockProgram;

public class Stock {

    private String companyName;
    private String symbol;


    public Stock(String companyName, String symbol) {
        this.companyName = companyName;
        this.symbol = symbol;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
