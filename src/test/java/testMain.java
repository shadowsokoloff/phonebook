import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Shadow on 01.02.2017.
 */
public class testMain {

    String messageEmpty = "Вы не ввели ФИО пользователя";
    String messageFalse = "Такого пользователя нет в БД";

    @Test
    public void testCheckName(){

        PhoneBook pb = new PhoneBook();
        pb.addInfoToDb();
        boolean resultTrue = pb.checkName("Иванов И.И.");

        boolean resultFalse = pb.checkName("Соколов");
        assertEquals(messageFalse, pb.messageCheckName);

        boolean resultEmpty = pb.checkName("");
        assertEquals(messageEmpty, pb.messageCheckName);

        assertTrue(resultTrue);
        assertFalse(resultFalse);
        assertFalse(resultEmpty);
    }
}
