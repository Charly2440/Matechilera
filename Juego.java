import java.util.ArrayList;
import java.util.Random;

public class Juego{
    private Usuario user;
    private Respuestas respuestas;
    private Problemas problemas;
    private ArrayList<String> problemasPasados;

    public Juego() {
        user = new Usuario();
        problemas = new Problemas();
        problemasPasados = new ArrayList<String>();
        
        //respuestas = new Respuestas();
    }

    public String mostrarProblemas(){
        if (user.getNivel() == 1){
            Random rand = new Random();
            int index = rand.nextInt(problemas.getPrimeroBasico().size());
            problemasPasados.add(this.problemas.getPrimeroBasico().get(index));
            
            return this.problemas.getPrimeroBasico().get(index);
        }

        else if (user.getNivel() == 2){
            Random rand = new Random();
            int index = rand.nextInt(problemas.getSegundoBasico().size());
            problemasPasados.add(this.problemas.getSegundoBasico().get(index));

            return this.problemas.getSegundoBasico().get(index);
        }
        
        else if (user.getNivel() == 3){
            Random rand = new Random();
            int index = rand.nextInt(problemas.getTerceroBasico().size());
            problemasPasados.add(this.problemas.getTerceroBasico().get(index));
            
            return this.problemas.getTerceroBasico().get(index);
        }

        else if (user.getNivel() == 4){
            Random rand = new Random();
            int index = rand.nextInt(problemas.getCuartoBachillerato().size());
            problemasPasados.add(this.problemas.getCuartoBachillerato().get(index));
            
            return this.problemas.getCuartoBachillerato().get(index);
        }

        else if (user.getNivel() == 5){
            Random rand = new Random();
            int index = rand.nextInt(problemas.getQuintoBachillerato().size());
            problemasPasados.add(this.problemas.getQuintoBachillerato().get(index));
            
            return this.problemas.getQuintoBachillerato().get(index);
        }

        else if (user.getNivel() == 6){
            Random rand = new Random();
            int index = rand.nextInt(problemas.getLogica().size());
            
            return this.problemas.getLogica().get(index);
        }

        else if (user.getNivel() == 7){
            Random rand = new Random();
            int nivel = rand.nextInt(1, 6);
            int index = 0;
            switch (nivel){
                case 1:
                index = rand.nextInt(problemas.getPrimeroBasico().size());
                problemasPasados.add(this.problemas.getPrimeroBasico().get(index));
                return this.problemas.getPrimeroBasico().get(index);
                case 2:
                index = rand.nextInt(problemas.getSegundoBasico().size());
                return this.problemas.getSegundoBasico().get(index);
                case 3:
                index = rand.nextInt(problemas.getTerceroBasico().size());
                return this.problemas.getTerceroBasico().get(index);
                case 4:
                index = rand.nextInt(problemas.getCuartoBachillerato().size());
                return this.problemas.getCuartoBachillerato().get(index);
                case 5:
                index = rand.nextInt(problemas.getQuintoBachillerato().size());
                return this.problemas.getQuintoBachillerato().get(index);
                case 6:
                index = rand.nextInt(problemas.getLogica().size());
                return this.problemas.getLogica().get(index);
            }
        }

        return "No entra";
    }



    public Usuario getUser() {
        return this.user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Respuestas getRespuestas() {
        return this.respuestas;
    }

    public Problemas getProblemas() {
        return this.problemas;
    }

    public void setRespuestas(Respuestas respuestas) {
        this.respuestas = respuestas;
    }

    public Juego user(Usuario user) {
        setUser(user);
        return this;
    }

    public Juego respuestas(Respuestas respuestas) {
        setRespuestas(respuestas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Juego)) {
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "{" +
            " user='" + getUser() + "'" +
            ", respuestas='" + getRespuestas() + "'" +
            "}";
    }
    


}