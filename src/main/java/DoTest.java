import org.example.JNIDemo;

public class DoTest {
    public static void main(String[] args) {
        JNIDemo jniDemo = new JNIDemo();
        System.out.println(jniDemo.instSayHello("World From Instance Method!"));
        System.out.println(JNIDemo.staticSayHello("World From Class Method!"));
        System.out.println(jniDemo.getTotalLengthOfStringArray(new String[]{"xxxxxx"}));
        // a
    }
}
