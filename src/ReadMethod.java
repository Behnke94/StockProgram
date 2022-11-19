import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ReadMethod {



    public String readStock() throws IOException {

        final String sym = "tsla";
        String readSym = "https://www.marketwatch.com/investing/stock/" + sym;
        URL url = new URL(readSym);

        URLConnection urlConn = url.openConnection();
        InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
        BufferedReader buff = new BufferedReader(inStream);
        String line = buff.readLine();

        String price = "not found";

        while(line != null){
            if(line.contains("Intangible/FinancialQuote")){
                int target = line.indexOf("price");
                int deci = line.indexOf(".", target);
                int start = deci;
                while(line.charAt(start) != '"' ){
                    start--;
                }
                price = line.substring(start + 1,deci + 3);

            }
            line = buff.readLine();
        }
        return price;
    }
}