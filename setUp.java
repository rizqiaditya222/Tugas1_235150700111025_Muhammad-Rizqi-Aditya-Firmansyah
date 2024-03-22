public class setUp {
    private String Status, Cable;
    private int Volume, Brightness;

    setUp (){
        Status = "Off";
        Cable = "VGA";
        Volume = 50;
        Brightness = 50;
    }

    public String getStatus (){
        return Status;
    }
    public int getVolume (){
        return Volume;
    }
    public int getBrightness (){
        return Brightness;
    }
    public String getCable (){
        return Cable;
    }

    public void setStatus (String Status){
        this.Status = Status;
    }
    public void setVolume (int Volume){
        if (Volume>100) {
            Volume=100;
        }else if (Volume<0) {
            Volume=0;
        }
        this.Volume = Volume;

    }
    public void setBrightness (int Brightness){
        if (Brightness>100) {
            Brightness=100;
        }else if (Brightness<0) {
            Brightness=0;
        }
        this.Brightness = Brightness;
    }

    //Cable
    public void setCable (int Choice){
        if (Choice==1){
            Cable = "VGA";
        }else if (Choice==2){
            Cable = "DVI";
        }else if (Choice==3){
            Cable = "HDMI";
        }else if (Choice==4){
            Cable = "DisplayPort";
        }else {
            Cable = "VGA";
        }
    }

    //Status
    public void turnOn (){
        setStatus("On");
    }
    public void turnOff (){
        setStatus("Off");
    }
    public void Freeze (){
        setStatus("Freeze");
    }
    
    //Volume
    public void volumeUp (){
        int temp = Volume;
        if (Volume<100) {
            temp ++;
            setVolume(temp);
        }else {
            setVolume(100);
        }
    }
    public void volumeDown (){
        int temp = Volume;
        if (Volume>0) {
            temp --;
            setVolume(temp);
        }else {
            setVolume(0);
        }
    }
    
    //Brightness
    public void BrightnessUp (){
        int temp = Brightness;
        if (Brightness<100) {
            temp ++;
            setBrightness(temp);
        }else {
            setBrightness(100);
        }
    }
    public void BrightnessDown (){
        int temp = Brightness;
        if (Brightness>0) {
            temp --;
            setBrightness(temp);
        }else {
            setBrightness(0);
        }
    }
}