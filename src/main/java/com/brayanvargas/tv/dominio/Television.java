package com.brayanvargas.tv.dominio;

public class Television {

    public String serial;
    public String brand;
    public short size;
    public short chanel;
    public byte volume;
    public boolean power;

    public void powered(){
        this.power = true;
    }

    public void off(){
        this.power = false;
    }

    public short chanelChange(short newChanel){
        this.chanel = newChanel;
        return newChanel;
    }

    public byte changeVolume(byte newVolume){
        if (newVolume > 0 && newVolume <= 100){
            this.volume = newVolume;
            return newVolume;
        } else {
            return this.volume;
        }

    }
}
