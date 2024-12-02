public class Main {
    public static void main(String[] args) {

       Adaptor adaptor = new Adaptor(5,6,7);

        System.out.println("높이 변환 : "+adaptor.getHeighttoCm());
        System.out.println("길이 변환 : "+adaptor.getLengthtoCm());
        System.out.println("너비 변환 : "+adaptor.getWidthtoCm());
        System.out.println("Hexa 넓이 변환 : "+adaptor.volumeForHexa());
        System.out.println("Cube 넓이 변환 : "+adaptor.volumeforCube());

        /* adaptor 패턴의 경우 adaptor 클래스가 Implements 하는 인터페이스를 변경하여 요구사항을 적용하지만 데코레이터 패턴의 경우 기존의
        추상 클래스 ( Decorator ) 를 extends 하여 기능을 확장하는 방식이기 때문에 만약 adaptor 클래스의 문제를 해결하기 위해서는 새로 도입되는
        기능이 기존의 클래스의 메소드 형식을 override 하듯 비슷하게 구현되어야 한다.
         */
    }
}