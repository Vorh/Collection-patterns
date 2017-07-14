package structual.decorator;

/**
 * Created by vorh on 7/14/17.
 */
public class Main {

    public static void main(String[] args) {
        String data = "Data for write";

        DataSource dataSource = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource()
                )
        );
        dataSource.write(data);
        dataSource.read();


    }
}
