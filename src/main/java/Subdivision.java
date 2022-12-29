import java.util.Random;

public class Subdivision {
    private int idSubdivision;
    private String nameSubdivision;

    Subdivision(String _subdivisionName){
        nameSubdivision = _subdivisionName;
        Random rand = new Random();
        idSubdivision = rand.nextInt(1000000);
    }

    void println(){
        System.out.println("Id subdivision: " + idSubdivision);
        System.out.println("Name subdivision: " + nameSubdivision);
    }


    /**
     * @return int
     */
    public int getIdSubdivision() {
        return idSubdivision;
    }


    /**
     * @param idSubdivision
     */
    public void setIdSubdivision(int idSubdivision) {
        this.idSubdivision = idSubdivision;
    }


    /**
     * @return String
     */
    public String getNameSubdivision() {
        return nameSubdivision;
    }


    /**
     * @param nameSubdivision
     */
    public void setNameSubdivision(String nameSubdivision) {
        this.nameSubdivision = nameSubdivision;
    }
}