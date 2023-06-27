package OOP;
public class Polymorphism {
    public static void main(String[] args) {
        Printer canon = new Canon();
        Printer epson = new Epson ();
        Printer brother = new Brother ();

        canon.print();
        epson.print();
        brother.print();
    }
    public interface Printer {
        public void print();
    }

       

       

}
