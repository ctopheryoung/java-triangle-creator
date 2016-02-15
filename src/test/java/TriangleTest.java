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

  @Test
  public void isTriangle_notValidLengths_false() {
    Triangle testTriangle = new Triangle(1, 2, 10);
    assertEquals(false, testTriangle.isTriangle());
  }

  @Test
  public void isTriangle_validTriangle_true() {
    Triangle testTriangle = new Triangle(2, 3, 4);
    assertEquals(true, testTriangle.isTriangle());
  }

  @Test
  public void isScalene_noSidesEquals_true() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(true, testTriangle.isScalene());
  }

  @Test
  public void isIsosceles_twoSidesEqual_true() {
    Triangle testTriangle = new Triangle(2, 2, 3);
    assertEquals(true, testTriangle.isIsosceles());
  }
}
