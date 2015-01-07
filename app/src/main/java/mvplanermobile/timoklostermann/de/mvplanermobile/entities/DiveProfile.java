package mvplanermobile.timoklostermann.de.mvplanermobile.entities;

/**
 * Created by Timo on 07.01.2015.
 */
public class DiveProfile {

    private int depth;
    private int time;
    private Gas gas;
    private double sp;
    private boolean enable;

    public DiveProfile(int depth, int time, Gas gas, double sp, boolean enable) {
        this.depth = depth;
        this.time = time;
        this.gas = gas;
        this.sp = sp;
        this.enable = enable;
    }

    @Override
    public String toString() {
        return depth + "m, " + time + "min, " + gas + " @" + sp;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Gas getGas() {
        return gas;
    }

    public void setGas(Gas gas) {
        this.gas = gas;
    }

    public double getSp() {
        return sp;
    }

    public void setSp(double sp) {
        this.sp = sp;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
