import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RoomTest {

    private Room room;

    @BeforeMethod
    public void setUp(){
        //this.room = new Room(20, 20, 10, 3.5, true);
    }

    @Test
    public void turnTempDownTest(){
        Assert.assertEquals(room.turnTempDown(), true);
        Assert.assertEquals(room.getCurrentTemp(), 19.0);
    }
}
