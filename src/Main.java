public class Main {
    public static void main(String[] args) {
        //task 1
        int age = 4;
        boolean maturity = (age >= 18);
        if (maturity) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {  System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //task 2
        int degree = 6;
        boolean temperature = (degree > 5);
        if (temperature) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        //task 3
        int speed = 65;
        boolean fine = (speed < 60);
        if (fine) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");

        }

        //task 4
        age = 10;
        if (age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        //task 5
        age = 4;
        if (age < 5) {
            System.out.println("Если возраст человека " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age > 5 && age < 14) {
            System.out.println("Если возраст человека " + age + ", то ему можно кататься на аттракционе в сопровождении");
        }
        if (age > 14) {
            System.out.println("Если возраст человека " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //task 6
        int places = 102;
        int standing = 60;
        int occupiedPlaces = 52;
        if (occupiedPlaces > places) {
            System.out.println("Мест в вагоне нет");
        }
        if (occupiedPlaces >= standing && occupiedPlaces < places) {
            System.out.println("В вагоне остались только стоячие места");
        }
        if (occupiedPlaces < standing) {
            System.out.println("В вагоне остались и сидячие, и стоячие места");
        }


        //task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two &&  one > three) {
            System.out.println(one);
        }
        if (two > one &&  two > three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }






        }
        }













