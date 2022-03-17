package d11_extends_methodoverride;

public class NewPhone extends Phone{
    /*
    方法重写了
     */
    @Override
    public void call(){
        super.call();
        System.out.println("支持视频电话");
    }
    @Override
    public void sendMessage(){
    super.sendMessage();
        System.out.println("支持图片发送");
    }

}
