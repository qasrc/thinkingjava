package net.mindview;

public class BlankFinal {
    private final int i;
    private final Poppet poppet;

    public BlankFinal(int i, Poppet poppet) {
        this.i = i;
        this.poppet = poppet;
    }

    public BlankFinal(){
        this.i=0;
        this.poppet = new Poppet(23);
    }

    public void aa(final Poppet poppet) {
        poppet.setI(23);

    }
}
