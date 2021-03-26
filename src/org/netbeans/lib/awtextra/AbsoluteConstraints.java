// 
// Decompiled by Procyon v0.5.36
// 

package org.netbeans.lib.awtextra;

import java.awt.Dimension;
import java.awt.Point;
import java.io.Serializable;

public class AbsoluteConstraints implements Serializable
{
    static final long serialVersionUID = 5261460716622152494L;
    public int x;
    public int y;
    public int width;
    public int height;
    
    public AbsoluteConstraints(final Point point) {
        this(point.x, point.y);
    }
    
    public AbsoluteConstraints(final int x, final int y) {
        this.width = -1;
        this.height = -1;
        this.x = x;
        this.y = y;
    }
    
    public AbsoluteConstraints(final Point point, final Dimension dimension) {
        this.width = -1;
        this.height = -1;
        this.x = point.x;
        this.y = point.y;
        if (dimension != null) {
            this.width = dimension.width;
            this.height = dimension.height;
        }
    }
    
    public AbsoluteConstraints(final int x, final int y, final int width, final int height) {
        this.width = -1;
        this.height = -1;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    @Override
    public String toString() {
        return super.toString() + " [x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + "]";
    }
}
