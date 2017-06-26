package gadgetshop;

import controller.StartwindowController;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by lodo4ka on 25/06/2017.
 */
public class StartwindowControllerTest {


    StartwindowController startwindowController;


    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @Before
    public void setup(){
        startwindowController = new StartwindowController();
        System.out.println("Before - setup");
    }


    @Test
    public void shouldSignInSuccessfully() throws Exception {


    }

    @Test
    public void signUp() throws Exception {
    }



    @After
    public void tearDown(){
        System.out.println("AFTER - tear down");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }
}