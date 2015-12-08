import junit.framework.TestCase;

/**
 * Created by chenjianzhou622 on 2015/12/8.
 */
public class UDFBase64DecodeTest extends TestCase {
    public static void main(String args[]){
        System.out.println(new UDFBase64Decode().evaluate("MTIzNA=="));
    }
}