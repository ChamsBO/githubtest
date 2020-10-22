
        // Fråga användaren hens för - och efer namn och spara det (ANGE DITT EGET NÄR DU KÖR)

        // Fråga användare efer hens ålder och spara det

        // om åldern är mindre än 39, skriv ut [förnamn], du är yngre och snyggare än johan!
        // om åldern är lika med 39, skriv "[förnamn], du är lika gammal och klok som johan!
        // om åldern är störrre än 39, skriv ut "[förnamn]", du är ändre och visare än johan

        import java.util.Scanner;

        public class PraktisktProv {
        
            public static void main(String[] args) {
        
                int older;
                String farnamn;
                String efternamn;
        
                Scanner in = new Scanner(System.in);
                System.out.println("Vad är ditt förnamn: ");
                farnamn =in.nextLine();
        
                System.out.println("Vad är ditt Efternamn: ");
                efternamn =in.nextLine();
        
                System.out.println("Vad är din ålder: ");
                older =in.nextInt();
        
                if(older < 39) {
                    System.out.println(farnamn + " Du är yngre och Snyggare än johan!");
                }else if(older == 39) {
                    System.out.println(farnamn + " Du är lika gammal och klok som johan!");
                }else if(older > 39) {
                    System.out.println(farnamn + " Du är äldre och visare än Johan");
                }
        
            }

}