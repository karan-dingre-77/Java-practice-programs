package OOPs;

class Laptop{
    int RAM;
    int Storage;
    String brand;
    String processor;
    int price=60000;
    Laptop(){
         RAM = 4;
         Storage = 256;
         brand = "HP";
         processor = "intel";
    }
    Laptop(int RAM, int Storage, String processor){
        this.RAM = RAM;
        this.Storage = Storage;
        this.brand = " HP ";
        this.processor = "selenium";
    }
    Laptop(int RAM, int Storage, String brand, String processor, int price){
        this.RAM = RAM;
        this.Storage = Storage;
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }
    void showLaptopDetails(){
        System.out.println(RAM + " " + Storage + " " + brand + " " + processor + " " + price);
    }
}
public class eg4 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(6, 256, "intel");
        laptop.showLaptopDetails();
    }
}
