// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String city = "Columbus";
        int zipCode = 43215;
        double total = 0.0;
        double[] highTemps = {8, 5, 9, 6, 5};
        for (int i = 0; i < highTemps.length; i++) {
            total += highTemps[i];
        }
        double avgTemp = total/highTemps.length;

        System.out.println(city);
        System.out.println(zipCode);
        System.out.println(avgTemp);

    }
}