import java.io.File;
public class RuntimeEr{
  public static void main(String[] args) {
    mkfiles();
  }  


  private static void mkfiles() {
    try {
    File dir = new File("temp.txt");
    if (!dir.exists()) {
        if (!dir.delete()) {
         throw new RuntimeException("delete error");
        }
    }
    } catch (Exception e) {
        e.printStackTrace();
      }
  }
}