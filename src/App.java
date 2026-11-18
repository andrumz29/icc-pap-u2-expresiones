import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjemplo1();
        runejemplo3();
    }
/**
 * 
 * 
 * private static void runEjemplo1(){
    String patron = "ab*";
    String[] palabras = new String[] {"a","ab","abbb",
        "abab","b", ""    };
        for (String p : palabras) {
            System.out.println(p+ "->"+ p.matches(patron));
        }
}
 * 
 * 
 */

/**
 * private static void runejemplo2(){
 String regex = "[TO][0-9]{3}";
        String[] list = new String[]{"T001", "0120", "T01", "X001", "T0001"};
        for(String codigo : list){
            System.out.printf("%s -> %s%n", codigo, codigo.matches(regex));

        }
}
 * 
 */

private static void runejemplo3() {
    String texto = "Sensores: T001 reporta 23.5 C;\n" +
                   "S001 reporta 12 personas; T002 reporta 2 C";

    Pattern patron = Pattern.compile("T[0-9]{3}");
    Matcher matcher = patron.matcher(texto);

    while (matcher.find()) {
        System.out.printf("Encontrado %s, posicion: %d%n",
                matcher.group(), matcher.start());
    }
}

}
