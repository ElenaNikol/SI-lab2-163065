import org.junit.Test;

import javax.jws.soap.SOAPBinding;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class SILab2Test {

    public List<String> users = new ArrayList<>();

    User first = null;
    User second = new User(null,"123","mail2@vv.c");
    User third = new User("user3","123",null);
    User fourth = new User("user4","123","mail4@vv.c");
    User fifth = new User("user5","123","mail5vvc");

    @Test
    public void test1() {
        assertThrows(RuntimeException.class, () -> SILab2.function(first,users));
        assertThrows(RuntimeException.class, () -> SILab2.function(second,users));
        assertEquals(SILab2.function(third,users), false);
        assertEquals(SILab2.function(fourth,users),true);
        assertEquals(SILab2.function(fifth,users),false);
    }

}