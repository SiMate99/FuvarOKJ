package fuvar;


class Fuvar {
    private int id;
    private String indulas;
    private int tartam;
    private double megtett;
    private double vitel;
    private double borr;
    private String fizm;

    public Fuvar(String sor) {
        String[] s = sor.split(";");
        this.id = Integer.parseInt(s[0]);
        this.indulas = s[1];
        this.tartam = Integer.parseInt(s[2]);
        this.megtett = Double.parseDouble(s[3]);
        this.vitel = Double.parseDouble(s[4]);
        this.borr = Double.parseDouble(s[5]);
        this.fizm = s[6];
    }

    public int getId() {
        return id;
    }

    public String getIndulas() {
        return indulas;
    }

    public int getTartam() {
        return tartam;
    }

    public double getMegtett() {
        return megtett;
    }

    public double getVitel() {
        return vitel;
    }

    public double getBorr() {
        return borr;
    }

    public String getFizm() {
        return fizm;
    }
    
    
}
