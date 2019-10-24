import java.io.File;
public class RuntimeEr2{
  public static void main(String[] args) {
    mkfiles();
  }  


  private static void mkfiles() {
    File dir = new File("temp.txt");
    if (dir.exists()) {
        dir.delete();
        dir.delete();
      }
  }
}