package com.mark719.magicalcrops.seedbags;

public class Point
{
    private int x;
    private int y;
    private int z;
    
    public Point(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getZ() {
        return this.z;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash += 13 * this.x;
        hash += 19 * this.y;
        hash += 31 * this.z;
        return hash;
    }
    
    @Override
    public boolean equals(final Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof Point)) {
            return false;
        }
        final Point otherPoint = (Point)other;
        return this.x == otherPoint.x && this.y == otherPoint.y && this.z == otherPoint.z;
    }
    
    public int distanceFrom(final int x, final int y, final int z) {
        final int distanceX = this.x - x;
        final int distanceY = this.y - y;
        final int distanceZ = this.z - z;
        return distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ;
    }
    
    public boolean isWithinRange(final Point target, final int range) {
        return this.isWithinRange(target.x, target.y, target.z, range);
    }
    
    public boolean isWithinRange(final int x, final int y, final int z, final int range) {
        return this.distanceFrom(x, y, z) <= range * range;
    }
}
