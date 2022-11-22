package StockProgram;

import java.io.IOException;

import static StockProgram.StockReader.readStockPrice;

public class app {

    public static void main(String[] args) throws IOException {

        Stock stock1 = new Stock("Gamestop", "Gme");
        Stock stock2 = new Stock("Tesla","Tsla");
        Stock stock3 = new Stock("Bed, Bath & Beyond", "Bbby");


        System.out.println(readStockPrice(stock1.getSymbol()));
        System.out.println(readStockPrice(stock2.getSymbol()));
        System.out.println(readStockPrice(stock3.getSymbol()));

    }
}
