public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
            float weight = 100;
            float growth = (float) 1.9;
        float index = service.calculate(weight, growth);
        System.out.println("Индекс массы тела = "+ index);
    }
}
