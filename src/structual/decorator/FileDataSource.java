package structual.decorator;

/**
 * Created by vorh on 7/14/17.
 */
public class FileDataSource implements DataSource{
    private String data;

    @Override
    public void write(String data) {
        this.data = data;
        System.out.println("Write data in file");
    }

    @Override
    public String read() {
        System.out.println("Read a data from file");
        return data;
    }
}
