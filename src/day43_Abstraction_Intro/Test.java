package day43_Abstraction_Intro;

 interface Test {

  void readBook();
  abstract void watchTv();




}
abstract class B implements Test{
    @Override
    public void readBook() {
        System.out.println("a");
    }
}