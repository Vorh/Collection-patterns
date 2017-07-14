package structual.decorator;

/**
 * Created by vorh on 7/14/17.
 */
public class CompressionDecorator extends DataSourceDecorator{
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String data) {
        System.out.println("Compression data");
        super.write(data);
    }

    @Override
    public String read() {
        System.out.println("Decompression data");
        return super.read();
    }
}
