// 
// Decompiled by Procyon v0.5.36
// 

package org.netbeans.lib.awtextra;

import java.util.Enumeration;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.Component;
import java.util.Hashtable;
import java.io.Serializable;
import java.awt.LayoutManager2;

public class AbsoluteLayout implements LayoutManager2, Serializable
{
    static final long serialVersionUID = -1919857869177070440L;
    protected Hashtable constraints;
    
    public AbsoluteLayout() {
        this.constraints = new Hashtable();
    }
    
    @Override
    public void addLayoutComponent(final String s, final Component component) {
        throw new IllegalArgumentException();
    }
    
    @Override
    public void removeLayoutComponent(final Component key) {
        this.constraints.remove(key);
    }
    
    @Override
    public Dimension preferredLayoutSize(final Container container) {
        int width = 0;
        int height = 0;
        final Enumeration<Component> keys = this.constraints.keys();
        while (keys.hasMoreElements()) {
            final Component key = keys.nextElement();
            final AbsoluteConstraints absoluteConstraints = this.constraints.get(key);
            final Dimension preferredSize = key.getPreferredSize();
            int n = absoluteConstraints.getWidth();
            if (n == -1) {
                n = preferredSize.width;
            }
            int n2 = absoluteConstraints.getHeight();
            if (n2 == -1) {
                n2 = preferredSize.height;
            }
            if (absoluteConstraints.x + n > width) {
                width = absoluteConstraints.x + n;
            }
            if (absoluteConstraints.y + n2 > height) {
                height = absoluteConstraints.y + n2;
            }
        }
        return new Dimension(width, height);
    }
    
    @Override
    public Dimension minimumLayoutSize(final Container container) {
        int width = 0;
        int height = 0;
        final Enumeration<Component> keys = this.constraints.keys();
        while (keys.hasMoreElements()) {
            final Component key = keys.nextElement();
            final AbsoluteConstraints absoluteConstraints = this.constraints.get(key);
            final Dimension minimumSize = key.getMinimumSize();
            int n = absoluteConstraints.getWidth();
            if (n == -1) {
                n = minimumSize.width;
            }
            int n2 = absoluteConstraints.getHeight();
            if (n2 == -1) {
                n2 = minimumSize.height;
            }
            if (absoluteConstraints.x + n > width) {
                width = absoluteConstraints.x + n;
            }
            if (absoluteConstraints.y + n2 > height) {
                height = absoluteConstraints.y + n2;
            }
        }
        return new Dimension(width, height);
    }
    
    @Override
    public void layoutContainer(final Container container) {
        final Enumeration<Component> keys = this.constraints.keys();
        while (keys.hasMoreElements()) {
            final Component key = keys.nextElement();
            final AbsoluteConstraints absoluteConstraints = this.constraints.get(key);
            final Dimension preferredSize = key.getPreferredSize();
            int width = absoluteConstraints.getWidth();
            if (width == -1) {
                width = preferredSize.width;
            }
            int height = absoluteConstraints.getHeight();
            if (height == -1) {
                height = preferredSize.height;
            }
            key.setBounds(absoluteConstraints.x, absoluteConstraints.y, width, height);
        }
    }
    
    @Override
    public void addLayoutComponent(final Component key, final Object value) {
        if (!(value instanceof AbsoluteConstraints)) {
            throw new IllegalArgumentException();
        }
        this.constraints.put(key, value);
    }
    
    @Override
    public Dimension maximumLayoutSize(final Container container) {
        return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
    
    @Override
    public float getLayoutAlignmentX(final Container container) {
        return 0.0f;
    }
    
    @Override
    public float getLayoutAlignmentY(final Container container) {
        return 0.0f;
    }
    
    @Override
    public void invalidateLayout(final Container container) {
    }
}
