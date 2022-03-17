package d9_exception_custom;

/**
 * 自定义编译时异常
 *  1 继承Exception
 *  2 重写构造器
 */
public class ahutAgeIlleagalException extends Exception{
    public ahutAgeIlleagalException(String message) {
        super(message);
    }
}
