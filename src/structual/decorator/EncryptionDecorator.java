package structual.decorator;

/**
 * Created by vorh on 7/14/17.
 */
public class EncryptionDecorator extends DataSourceDecorator{


    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String data) {
        System.out.println("Encode data");
        super.write(data);
    }

    @Override
    public String read() {
        System.out.println("Decode data");
        return super.read();
    }
}
