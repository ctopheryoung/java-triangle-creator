import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void newTriangle_getsSides() {
    Triangle testTriangle = new Triangle(2, 3, 4);
    assertEquals(2, testTriangle.getSideA());
    assertEquals(3, testTriangle.getSideB());
    assertEquals(4, testTriangle.getSideC());
  }
}
