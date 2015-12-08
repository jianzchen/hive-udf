import junit.framework.TestCase;

/**
 * Created by chenjianzhou622 on 2015/12/8.
 */
public class UDFStringDistanceTest extends TestCase {

    public static void main(String[] args) throws Exception {

        System.out.println(new UDFStringDistance().evaluate("abcdefg","acbdefg"));
        System.out.println(new UDFStringDistance().evaluate("abcdefg","acbdefgh"));

    }
}