package com.bitbucket.simplePaint.config;

import java.util.Objects;

public class CustomLine {

    private int oldX, oldY, x, y;

    public int color;

    public int width;

    public CustomLine(int oldX, int oldY, int x, int y, int color, int width) {
        this.oldX = oldX;
        this.oldY = oldY;
        this.x = x;
        this.y = y;
        this.color = color;
        this.width = width;
    }

    public int getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getOldX() {
        return oldX;
    }

    public int getOldY() {
        return oldY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomLine line = (CustomLine) o;
        return oldX == line.oldX && oldY == line.oldY && x == line.x && y == line.y && color == line.color && width == line.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldX, oldY, x, y, color, width);
    }

    @Override
    public String toString() {
        return "CustomLine{" +
                "oldX=" + oldX +
                ", oldY=" + oldY +
                ", x=" + x +
                ", y=" + y +
                ", color=" + color +
                ", width=" + width +
                '}';
    }
}
