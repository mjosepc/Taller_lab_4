package modelo;

public class Team {
    private int id;
    private String nombre;
    private int ranking;
    private String rutaBandera;

    public Team (int id, String nombre, int ranking, String rutaBandera){
        this.id = id;
        this.nombre = nombre;
        this.ranking = ranking;
        this.rutaBandera = rutaBandera;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public String getRutaBandera() {
        return rutaBandera;
    }
}
