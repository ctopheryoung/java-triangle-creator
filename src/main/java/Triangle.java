public class Triangle {
  private int mSideA;
  private int mSideB;
  private int mSideC;

  public Triangle(int sideA, int sideB, int sideC) {
    mSideA = sideA;
    mSideB = sideB;
    mSideC = sideC;
  }

  public int getSideA() {
    return mSideA;
  }

  public int getSideB() {
    return mSideB;
  }

  public int getSideC() {
    return mSideC;
  }

  public boolean isTriangle() {
    return ((mSideA + mSideB > mSideC) && (mSideB + mSideC > mSideA) && (mSideC + mSideA > mSideB));
  }

  public boolean isScalene() {
    return ((mSideA != mSideB) && (mSideB != mSideC) && (mSideA != mSideC));
  }

  public boolean isIsosceles() {
    return (((mSideA == mSideB) && (mSideA!= mSideC)) || ((mSideB == mSideC) && (mSideB != mSideA)) || ((mSideA == mSideC) && (mSideA != mSideB)));
  }

  public boolean isEquilateral() {
    return ((mSideA == mSideB) && (mSideB == mSideC));
  }
}
