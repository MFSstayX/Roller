public class Main{
    public static void main(String[] args){
        Roller schwarzer = new Roller(12.0, 120, 9.0);
        Besitzer benutzer = new Besitzer(1000.0, "Vincent", schwarzer);
        System.out.println(benutzer.getGeld());
        benutzer.erhalteTaschenGeld(1.0);
        System.out.println(benutzer.getGeld());
    }
}