public class Main {
public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 17;
        if (age >= 18) {
        System.out.println("Поздравляем, Вы достигли совершеннолетия!!!");
        }else{
        System.out.println("К сожалению, возраст совершеннолетия ещё не наступил. Подождите совсем чуть-чуть!");
        }
        System.out.println("Задание 2");
        int ageHuman = 8;
        if (ageHuman >= 7 && ageHuman < 18) {
        System.out.println("Ребёнок ходит в школу.");
        }else if (ageHuman >= 18 && ageHuman < 24) {
        System.out.println("Человек уже закончил школу и ходит в университет.");
        }else if (ageHuman >= 24) {
        System.out.println("Человек ходит на работу");
        }


        System.out.println("Задание 3");
        int totalSeats = 102;
        int seating = 60;
        int standing = totalSeats - seating;

        int standingPeople = 42;
        int occupiedSeats = 60;

        if (occupiedSeats < seating) {
        System.out.println("Есть ещё " + (seating - occupiedSeats) + " сидячих мест");
        }else{
        System.out.println("Сидячих мест нет");
        }
        if (standingPeople < standing) {
        System.out.println("Есть ещё " + (standing - standingPeople) + " стоячих мест мест");
        }else  {
        System.out.println("Стоячих мест нет");
        }




        }

        }