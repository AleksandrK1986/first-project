mport java.util.ArrayList;
public class Praktikum {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");
        
        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных:" + "\n" + "Это будут:");
        
        for (String exp : animals){
        System.out.println(exp);
        }
        System.out.println("Расписание кормлений:");
        System.out.println("В 9:00 - " + animals.get(1));
        System.out.println("В 10:00 - " + animals.get(4));
        System.out.println("В 11:00 - " + animals.get(0));
        System.out.println("В 12:00 - " + animals.get(2));
        System.out.println("В 13:00 - " + animals.get(3));
        }
    }