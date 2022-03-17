package com.zsh;

import org.junit.Assert;
import org.junit.Test;

public class testDemo {
    @Test
    public void testSay(){
        Demo d=new Demo();
        String zsh = d.Say("zsh");
        Assert.assertEquals("hello zsh",zsh);
    }

}
