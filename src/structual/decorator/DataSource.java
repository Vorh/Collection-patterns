package structual.decorator;

/**
 * Created by vorh on 7/14/17.
 */
public interface DataSource {
    void write(String data);


    String read();

}
