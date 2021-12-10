public class Equipamento_sonoro extends Equipamento{
    private short volume;
    private boolean stereo;

    public void mono(){
        this.stereo=false;
    }
    public void stereo(){
        this.stereo=true;
    }

    public Equipamento_sonoro(int estado) {
        super(estado);
    }

    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        this.volume = volume;
    }

    public boolean isStereo() {
        return stereo;
    }

    public void setStereo(boolean stereo) {
        this.stereo = stereo;
    }
}
