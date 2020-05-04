package domain.attachment;

public class AudioMessage {
    private int duration;
    private String linkOgg;
    private String linkMp3;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLinkOgg() {
        return linkOgg;
    }

    public void setLinkOgg(String linkOgg) {
        this.linkOgg = linkOgg;
    }

    public String getLinkMp3() {
        return linkMp3;
    }

    public void setLinkMp3(String linkMp3) {
        this.linkMp3 = linkMp3;
    }
}
