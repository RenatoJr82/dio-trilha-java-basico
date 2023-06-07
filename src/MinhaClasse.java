public class MinhaClasse {

   public static void main(String[] args) {

        String primeiroNome = "Renato";
        String segundoNome = "Roberto";
        String nomeCompleto = nameComplete(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
   }

   public static String nameComplete (String primeiroNome, String segundoNome){
        return primeiroNome + " " + segundoNome;
   }
}