package polymorphism;

public class SamsungTV implements TV{

    private String _name;
    public SamsungTV(){
        this._name = "Samsung TV";
        System.out.println("============ " + _name + "  construct");
    }

    public void PowerON() {
        System.out.println("============ " + _name + "  PowerON");
    }

    public void PowerOff() {
        System.out.println("============ " + _name + "  PowerOff");
    }

    public void VolumeUP() {
        System.out.println("============ " + _name + "  VolumeUP");
    }

    public void VolumeDown() {
        System.out.println("============ " + _name + "  VolumeDown");
    }
}
