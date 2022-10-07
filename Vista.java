public class Vista {
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.getProblemas().getPrimeroBasico().add("2+2=?");
        juego.getProblemas().getPrimeroBasico().add("2x-4=0");
        juego.getProblemas().getPrimeroBasico().add("8x-4=0");
        juego.getProblemas().getPrimeroBasico().add("2x-20=0");
        juego.getProblemas().getPrimeroBasico().add("12x-14=0");
        System.out.println(juego.mostrarProblemas());
    }
}
