package creational.builder;

/**
 * Created by vorh on 7/11/17.
 */
public interface Builder<T> {
       Builder setHeight(int height);
       Builder setWidth(int width);
       Builder setMargin(int margin);

       T getResult();
}
