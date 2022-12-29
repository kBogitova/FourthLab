public class Human {
    private int id;
    private String name;
    private String sex;
    private Subdivision subdivision;
    private double salary;
    private String birthday;

    Human() {

    }

    Human(int _id, String _name, String _sex, String _subdivisionName, double _salary, String _birhtday) {
        id = _id;
        name = _name;
        sex = _sex;
        subdivision = new Subdivision(_subdivisionName);
        salary = _salary;
        birthday = _birhtday;
    }

    void println() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Subdivision: ");
        subdivision.println();
        System.out.println("Salary: " + salary);
        System.out.println("Birthday: " + birthday);
    }


    /**
     * @param type
     * @param fild
     */
    public void setFild(int type, String fild) {
        switch (type) {
            case 0:
                id = Integer.parseInt(fild);
                break;
            case 1:
                name = fild;
                break;
            case 2:
                sex = fild;
                break;
            case 3:
                birthday = fild;
                break;
            case 4:
                subdivision = new Subdivision(fild);
                break;
            case 5:
                salary = Double.parseDouble(fild);
                break;
        }
    }


    /**
     * @return int
     */
    public int getId() {
        return id;
    }


    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * @return String
     */
    public String getName() {
        return name;
    }


    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return String
     */
    public String getSex() {
        return sex;
    }


    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }


    /**
     * @return Subdivision
     */
    public Subdivision getSubdivision() {
        return subdivision;
    }


    /**
     * @param subdivision
     */
    public void setSubdivision(Subdivision subdivision) {
        this.subdivision = subdivision;
    }


    /**
     * @return double
     */
    public double getSalary() {
        return salary;
    }


    /**
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }


    /**
     * @return String
     */
    public String getBirthday() {
        return birthday;
    }


    /**
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
