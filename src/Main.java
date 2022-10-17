public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО cотрудника= " + fullName);

        System.out.println();
        // Задание 2
        System.out.println("Задание 2");
        fullName = fullName.replace("v", "V");
        fullName = fullName.replace("a", "A");
        fullName = fullName.replace("n", "N");
        fullName = fullName.replace("o", "O");
        fullName = fullName.replace("v", "V");
        fullName = fullName.replace("v", "V");
        fullName = fullName.replace("a", "A");
        fullName = fullName.replace("n", "N");
        fullName = fullName.replace("v", "V");
        fullName = fullName.replace("a", "A");
        fullName = fullName.replace("n", "N");
        fullName = fullName.replace("o", "O");
        fullName = fullName.replace("v", "V");
        fullName = fullName.replace("i", "I");
        fullName = fullName.replace("c", "C");
        fullName = fullName.replace("h", "H");
        System.out.println("Данные ФИО сотрудника для заполнения отчёта-" + fullName);
        System.out.println();

        //Задание 3
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника- " + fullName1);
    }
}