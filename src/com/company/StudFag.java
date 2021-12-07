package com.company;


public class StudFag {
    private Integer stdnr;
    private Integer fagnr;
    private Studerende s=new Studerende();
    private Fag f=new Fag();


    public Integer getStdnr() {
        return stdnr;
    }

    public void setStdnr(Integer stdnr) {
        this.stdnr = stdnr;
    }

    public Studerende getS() {
        return s;
    }

    public void setS(Studerende s) {
        this.s = s;
    }

    public Fag getF() {
        return f;
    }

    public void setF(Fag f) {
        this.f = f;
    }

    public Integer getFagnr() {
        return fagnr;
    }

    public void setFagnr(Integer fagnr) {
        this.fagnr = fagnr;
    }
}
