package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DemoExceptionHandling {

    public static void main(String[] args) {
        DemoExceptionHandling demo = new DemoExceptionHandling();
        demo.demoCallException();
    }

    public void demoCallException() {
        try {
            demoException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void demoException() throws IOException {
        InputStream in = null;

        try {
            File file = new File("D:\\Start CDG\\Mywork\\testJava.docx");
            in = new FileInputStream(file);
            // ดำเนินการอื่น ๆ กับ InputStream
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw e;
                }
            }
        }
    }
}
