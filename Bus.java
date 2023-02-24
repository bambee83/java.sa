package transport;

public class Bus extends PublicTransportation {

    public Bus(int busNum) {
        super.startOperation("운행");
        super.num = busNum;
        super.maxPassenger = 30;
        super.price = 1000;
        super.currentPassenger = 26;
        System.out.println(busNum + "번 버스가 생성되었습니다.");
    }
}


//버스 객체가 생성될 때 가져갈 값이 state를 "운행"으로 해줘야했고
//busNum 에 입력하는 번호가 부모 클래스의 num 값이 되므로
//super.num으로 해주었다. 또한 최대승객수와 기본요금은 버스와 택시가 다르므로 객체가 생성될 때 다르게 들어가도록 설정해주었다.
//시나리오상 기본 현재 승객이 26인 것 같아서 그것도 넣어주었다.


