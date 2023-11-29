import java.util.InputMismatchException;

public class App extends faktur {
    public static void main(String[] args) throws Exception {

        // polymorphisme
        dataPembelian gass = new faktur();

        gass.isidata();

        try {
            if (totalBayar > 0)
                throw new Exception();
            System.out.println("Struk tidak keluar karna pembelian salah");

        } catch (Exception e) {
            gass.cetakFaktur();
        }

    }
}
