package com.mber.patterns.adapter.method3;

/*
2-й способ через композицию, более гибкий
 */
public class Adapter {
    public static void main(String[] args) {
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster(new RasterGraphics());
        g1.drawLine();
        g1.drawSquare();
    }
}

interface VectorGraphicsInterface {
    void drawLine();
    void drawSquare();
}

class RasterGraphics {
    void drawRasterLine() {
        System.out.println("Рисуем линию");
    }

    void drawRasterSquare() {
        System.out.println("Рисуем квадрат");
    }
}

class VectorAdapterFromRaster implements VectorGraphicsInterface {
    RasterGraphics rasterGraphics;

    public VectorAdapterFromRaster(RasterGraphics rasterGraphics) {
        this.rasterGraphics = rasterGraphics;
    }

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}