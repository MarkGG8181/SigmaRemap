package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.util.math.vector.Vector3d;

public class Class4435 extends CancellableEvent {
    private static String[] field21584;
    public Vector3d field21585;

    public Class4435(Vector3d var1) {
        this.field21585 = var1;
    }

    public double method13992() {
        return this.field21585.x;
    }

    public void method13993(double var1) {
        this.field21585.x = var1;
    }

    public double method13994() {
        return this.field21585.y;
    }

    public void method13995(double var1) {
        this.field21585.y = var1;
    }

    public double method13996() {
        return this.field21585.z;
    }

    public void method13997(double var1) {
        this.field21585.z = var1;
    }

    public Vector3d method13998() {
        return this.field21585;
    }

    public void method13999(Vector3d var1) {
        this.field21585 = var1;
    }
}
