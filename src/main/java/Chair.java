/**
 * Demonstration of the garbage collector and finalization.
 * Created by Nico on 11/14/16 18:31.
 */
public class Chair {
    static boolean gcrun = false;
    static boolean f = false;
    static int created = 0;
    static int finalized = 0;
    int i;

    Chair() {
        i = ++created;
        if (created == 47) {
            System.out.println("Created 47");
        }
    }

    protected void finalize() {
        if (!gcrun) {
            gcrun = true;
            System.out.println("Beginnig to finalize after " + created +
                    " Chairs have been created");
        }
        if (i == 47) {
            System.out.println("Finalize Chair #47, " + "Setting flag to stop Chair creation");
            f = true;
        }
        finalized++;
        if(finalized >= created) {
            System.out.println("All " + finalized + " finalized");
        }
    }
}
