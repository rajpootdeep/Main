package org.DesignPattern.Singleton;

public class TVSet implements Cloneable {
    private static volatile TVSet tvSetInstance = null;

    private TVSet() {
        System.out.println("TVSet Instantiated");
    }


    public static TVSet getTVSetInstance() {
        if (tvSetInstance == null) {  // optimisation
            synchronized (TVSet.class) {
                if (tvSetInstance == null)  //  double checking
                    tvSetInstance = new TVSet();
            }
        }
        return tvSetInstance;
    }

    @Override
    public TVSet clone() throws CloneNotSupportedException {

            TVSet clone = (TVSet) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;

    }
}
