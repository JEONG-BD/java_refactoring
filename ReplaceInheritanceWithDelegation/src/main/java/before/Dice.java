package before;

import java.util.Random;

public class Dice extends Random {

    public Dice(){
        super(314159L);
    }

    public Dice(long seed){
        super(seed);
    }

    @Override
    public int nextInt() {
        return nextInt(6) + 1;
    }
}
