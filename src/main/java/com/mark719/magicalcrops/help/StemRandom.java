package com.mark719.magicalcrops.help;

import java.util.*;

public class StemRandom extends Random
{
    private boolean do_proper_random;
    
    public StemRandom() {
        this.do_proper_random = false;
    }
    
    @Override
    public int nextInt(final int i) {
        if (this.do_proper_random) {
            this.do_proper_random = !this.do_proper_random;
            return super.nextInt(i);
        }
        this.do_proper_random = !this.do_proper_random;
        return 0;
    }
}
