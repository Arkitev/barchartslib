package com.graphs.lib.graph.element;

import processing.core.PApplet;

public class GraphTitle implements Drawable {
    private PApplet parent;
    private String title;
    private float fontsize;
    private Text.Align hAlign;
    private Text.Align vAlign;
    private Color color;

    public GraphTitle(PApplet parent, String title, float fontsize, Text.Align vAlign, Text.Align hAlign, Color color)
    {
        this.parent = parent;
        this.title = title;
        this.fontsize = fontsize;
        this.hAlign = hAlign;
        this.vAlign = vAlign;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getFontsize() {
        return fontsize;
    }

    public void setFontsize(float fontsize) {
        this.fontsize = fontsize;
    }

    public void sethAlign(Text.Align hAlign) {
        this.hAlign = hAlign;
    }

    public void setvAlign(Text.Align vAlign) {
        this.vAlign = vAlign;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(){
        Text text = new Text(parent, title, new Point(0,0),new Point(parent.width,0.1*parent.height), fontsize, color);
        text.setHorizontalAlign(hAlign);
        text.setVerticalAlign(vAlign);
        text.draw();
    }
}
