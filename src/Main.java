import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shadow on 28.01.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();

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

        System.out.println("Введите ФИО пользователя");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();


        while (true) {

            if (!hashMap.containsKey(name)) {
                System.out.println("Такого пользователя нет в БД");
            } else {
                ArrayList<String> numbers = hashMap.get(name);
                for (int i = 0; i < numbers.size() ; i++) {
                    System.out.println((i+1)+". "+numbers.get(i));
                }
                break;
            }
        }



    }
}
