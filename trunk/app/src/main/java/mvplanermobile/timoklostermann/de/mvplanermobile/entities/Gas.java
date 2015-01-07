package mvplanermobile.timoklostermann.de.mvplanermobile.entities;

/**
 * Created by Timo on 07.01.2015.
 */
public class Gas {

    private String name;
    private int percentHE;
    private int percentO2;
    private int mod;
    private double ppO2;
    private boolean enable;

    public Gas(String name, int percentHE, int percentO2, int mod, double ppO2, boolean enable) {
        this.name = name;
        this.percentHE = percentHE;
        this.percentO2 = percentO2;
        this.mod = mod;
        this.ppO2 = ppO2;
        this.enable = enable;
        this.enable = enable;

        if(percentO2 == 21 && mod == 66 && ppO2 == 1.6) {
            this.name = "Air";
        } else {
            this.name = "Nitrox " + percentO2;
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentHE() {
        return percentHE;
    }

    public void setPercentHE(int percentHE) {
        this.percentHE = percentHE;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getPercentO2() {
        return percentO2;
    }

    public void setPercentO2(int percentO2) {
        this.percentO2 = percentO2;
    }

    public double getPpO2() {
        return ppO2;
    }

    public void setPpO2(double ppO2) {
        this.ppO2 = ppO2;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
