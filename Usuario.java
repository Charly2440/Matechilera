public class Usuario {
    private String user;
    private int correctas;
    private int contador;
    private int nivel;

    public Usuario() {
        user = "Usuario";
        correctas = 0;
        contador = 0;
        nivel = 1;
    }

    public Usuario(String user, int correctas, int contador, int nivel) {
        this.user = user;
        this.correctas = correctas;
        this.contador = contador;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getCorrectas() {
        return this.correctas;
    }

    public void setCorrectas(int correctas) {
        this.correctas = correctas;
    }

    public int getContador() {
        return this.contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Usuario user(String user) {
        setUser(user);
        return this;
    }

    public Usuario correctas(int correctas) {
        setCorrectas(correctas);
        return this;
    }

    public Usuario contador(int contador) {
        setContador(contador);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Usuario)) {
            return false;
        }
        return false;
    }


    @Override
    public String toString() {
        return "{" +
            " user='" + getUser() + "'" +
            ", correctas='" + getCorrectas() + "'" +
            ", contador='" + getContador() + "'" +
            "}";
    }

}
