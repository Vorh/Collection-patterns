package structual.decorator;

/**
 * Created by vorh on 7/14/17.
 */
public class DataSourceDecorator implements DataSource{

    private DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void write(String data) {
        dataSource.write(data);
    }

    @Override
    public String read() {
        return dataSource.read();
    }
}
