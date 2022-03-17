package d4_decorator_pattern;

/**
 * 装饰类
 */
public class BufferedInputStream extends InputStream{

    private InputStream inputStream;

    public BufferedInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public int read() {
        System.out.println("提供8kb缓冲区");
       return inputStream.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8kb缓冲区");
        return inputStream.read(buffer);
    }
}
