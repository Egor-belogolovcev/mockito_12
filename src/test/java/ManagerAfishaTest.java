import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerAfishaTest {

    @Test
    public void testFindAll() {
        ManagerAfisha managerAfisha = new ManagerAfisha();

        managerAfisha.add("cinema 1");
        managerAfisha.add("cinema 2");
        managerAfisha.add("cinema 3");

        String[] actual = managerAfisha.findAll();
        String[] expected = {"cinema 1", "cinema 2","cinema 3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        ManagerAfisha managerAfisha = new ManagerAfisha();

        managerAfisha.add("cinema 1");
        managerAfisha.add("cinema 2");
        managerAfisha.add("cinema 3");

        String[] actual = managerAfisha.findlast();
        String[] expected = {"cinema 3", "cinema 2","cinema 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast2() {
        managerAfisha2.add("cinema 1");
        managerAfisha2.add("cinema 2");
        managerAfisha2.add("cinema 3");
        managerAfisha2.add("cinema 4");
        String[] expected = {"cinema 4", "cinema 3", "cinema 2", "cinema 1"};
        String[] actual = managerAfisha2.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    ManagerAfisha managerAfisha2 = new ManagerAfisha(14);
    @Test
    public void testMoreLimits() {
        managerAfisha2.add("Cinema 1");
        managerAfisha2.add("Cinema 2");
        managerAfisha2.add("Cinema 3");
        managerAfisha2.add("Cinema 4");
        managerAfisha2.add("Cinema 5");
        managerAfisha2.add("Cinema 6");
        managerAfisha2.add("Cinema 7");
        managerAfisha2.add("Cinema 8");
        managerAfisha2.add("Cinema 9");
        managerAfisha2.add("Cinema 10");
        managerAfisha2.add("Cinema 11");
        managerAfisha2.add("Cinema 12");
        String[] expected = {"Cinema 12", "Cinema 11", "Cinema 10", "Cinema 9", "Cinema 8", "Cinema 7", "Cinema 6", "Cinema 5", "Cinema 4", "Cinema 3", "Cinema 2", "Cinema 1"};
        String[] actual = managerAfisha2.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    ManagerAfisha managerAfisha3 = new ManagerAfisha(7);
    @Test
    public void testLessLimits() {
        managerAfisha3.add("Cinema 3");
        managerAfisha3.add("Cinema 4");
        managerAfisha3.add("Cinema 5");
        managerAfisha3.add("Cinema 6");
        managerAfisha3.add("Cinema 7");
        managerAfisha3.add("Cinema 8");
        managerAfisha3.add("Cinema 9");
        String[] expected = { "Cinema 9", "Cinema 8", "Cinema 7", "Cinema 6", "Cinema 5", "Cinema 4", "Cinema 3"};
        String[] actual = managerAfisha3.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
