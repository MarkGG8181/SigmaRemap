package com.mentalfrostbyte.jello.unmapped;

import mapped.Class2125;

import java.util.ArrayList;
import java.util.List;

public class Class9578 {
    private static String[] field44774;
    public String field44775;
    public String field44776;
    public Class2125 field44777;
    public List<Class9133> field44778 = new ArrayList<Class9133>();
    public boolean field44779 = false;

    public Class9578(String var1, String var2, Class2125 var3) {
        this.field44775 = var1;
        this.field44776 = var2;
        this.field44777 = var3;
    }

    public void method37195() {
        this.field44778 = new ArrayList<Class9133>();
        Class7869[] var3 = new Class7869[0];
        if (this.field44777 != Class2125.field13869) {
            if (this.field44777 == Class2125.field13868) {
             //   var3 = Class6972.method21518(this.field44776);
            }
        } else {
            var3 = Class6972.method21517(this.field44776);
        }

        for (Class7869 var7 : var3) {
            this.field44778.add(new Class9133(var7.field33683, var7.field33684, var7.field33685));
        }
    }

    @Override
    public boolean equals(Object var1) {
        if (var1 != this) {
            if (var1 instanceof Class9578) {
                Class9578 var4 = (Class9578) var1;
                return var4.field44776.equals(this.field44776);
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
