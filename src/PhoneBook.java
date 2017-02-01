import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by Shadow on 28.01.2017.
 */
public class PhoneBook {
    public static HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();
    public static String messageCheckName;
    public static boolean checkNameBool;

    public static void main(String[] args) throws IOException {

        addInfoToDb();
        String name = inputName("Введите ФИО пользователя");
        checkNameBool = checkName(name);
        printArrayList(name, checkNameBool);

    }

    public static void addInfoToDb()
    {
        ArrayList<String> ivanov = new ArrayList<>();
        ivanov.add("+8 800 2000 500");
        ivanov.add("+8 800 200 600");
        hashMap.put("Иванов И.И.", ivanov);

        ArrayList<String> petrov = new ArrayList<>();
        petrov.add("+8 800 2000 700");
        hashMap.put("Петров П.П.", petrov);

        ArrayList<String> sidorov = new ArrayList<>();
        sidorov.add("+8 800 2000 800 ");
        sidorov.add("+8 800 2000 900 ");
        sidorov.add("+8 800 2000 000 ");
        hashMap.put("Сидоров С.С.", sidorov);
    }


    public static String inputName(String message) throws IOException {
        System.out.println(message);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        return name;
    }

    public static boolean checkName(String name) {
        if (name.isEmpty()) {
            messageCheckName = "Вы не ввели ФИО пользователя";
            checkNameBool = false;
        } else if (!hashMap.containsKey(name)) {
            messageCheckName = "Такого пользователя нет в БД";
            checkNameBool = false;
        } else {
            checkNameBool = true;
        }
        return checkNameBool;
    }

    public static void printArrayList(String name, boolean checkNameBool) {
        if (checkNameBool) {
            ArrayList<String> numbers = hashMap.get(name);
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println((i + 1) + ". " + numbers.get(i));
            }
        } else {
            System.out.println(messageCheckName);
        }


    }
}