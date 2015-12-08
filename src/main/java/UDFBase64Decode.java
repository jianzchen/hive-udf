import org.apache.commons.codec.binary.Base64;
import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * Created by chenjianzhou622 on 2015/12/8.
 */
public class UDFBase64Decode extends UDF{
    public String evaluate(String s){
        return new String(Base64.decodeBase64(s.getBytes()));
    }
}
