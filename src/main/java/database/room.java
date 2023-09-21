package database;

public class room {
    private String room_name;
    private float price;

    public room(String room_name, float price) {
        this.room_name = room_name;
        this.price = price;
    }

    public String getname() {
        return room_name;
    }

    public float getprice() {
        return price;
    }
}
