public class Sample3_7 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setNumGas(1234, 20.5);
    }
}

class Car {
    int num;
    double gas;

    void setNumGas(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為 " + num + ", 汽油量設為 " + gas);
    }

    void show() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }
}
