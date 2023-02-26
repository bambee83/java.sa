package taxi;

class Taxi implements TaxiFunction {

    //멤버변수 선언
    private int taxiFare; // 택시 수익
    private int maxPassenger; // 멤버변수 최대승객
    private int distance; // 운행거리
    private int fuel; // 연료량
    private String state; // 운행상태

    private int plusMoney; // 수익

    // 생성자 : 인스턴스를 초기화 하는데 사용한다. 초기화는 처음값을 넣어주는 것. 기본값으로 돌린다. 기본값을 정해줘야한다.
    public Taxi(int taxiFare, int maxPassenger, int distance, int fuel, String state) {
        this.taxiFare = taxiFare;
        this.maxPassenger = maxPassenger;
        this.distance = distance;
        this.fuel = fuel;
        this.state = state;
    }
    //초기화 했으니까 다음에 머함?
    //매개변수는 있으니까 동작을 하는 애들이 있어야겠지? 메소드 작성
    //저는 this 와 super 를 아직 정확히 이해하지 못했습니다... ㅠ(다정) 232p,200p


    // getter를 통한 값읽기(메서드) > 메서드를 통한 간접 접근 허용
    // setter를 통한 값변경(메서드)
    // p244-245 참고 // 접근제어자를 private으로 외부에서 직접접근 못하게 값을 보호한다 !!

    public String getState() {return state;}

    public void setState(String state) {this.state = state;}


    // 오버로딩과 오버라이딩(230p~ )
    // 메서드의 이름은 그대로하고 내용만 바뀌는 것입니다 (메서드동사시작은소문자!!)
    @Override
    public void TaxiState(String str) {
        if (str.equals("고객있음")) this.state = "고객있음";
        else this.state = "운행중";
        System.out.println("상태 = " + getState());
    }

    @Override
    public void moveDistance(int distance) {
        plusMoney = 1000+((distance / (int) 3 ) * 10000);  //게터세터왜 얀결안했는데 plusmoney받아오죠???
        this.taxiFare = taxiFare+plusMoney;
        maxPassenger = 0;
        System.out.println("고객님의 요금은 "+plusMoney+"원 입니다");
        System.out.println("승객이 모두 하차하였습니다.");
        System.out.println("현재 탑승인원"+maxPassenger+" 명입니다");
        System.out.println("현재 수익은 "+taxiFare+"원 입니다 부자다 !! ");
        System.out.println("^====================================^");

    }


    @Override
    public void gasDecrease(int num) {

    }

    @Override
    public void addPassenger(int num) {
        if (0 < num && num <5 ){
            maxPassenger = num + maxPassenger;
            System.out.println("탑승 승객은 현재"+maxPassenger+"명 입니다");
            System.out.println("^====================================^");
        } else {
            System.out.println("탑승인원을 초과하여 승객을 받지 못했습니다");
            System.out.println("^====================================^");
        }

    }






//    @Override
//    public void taxiState(String str) {
//        if (str.equals("승객있음")) this.state = "승객있음";
//        else this.state = "승객없음";
//        System.out.println("상태 = " + getState()); /*getstate는 */
//    }
//


//
//    public int getMaxPassenger() {
//        return maxPassenger;
//    }
//
//    public void setMaxPassenger(int maxPassenger) {
//        this.maxPassenger = maxPassenger;
//    }








}

package taxi;

    public interface TaxiFunction {
        void TaxiState(String str);

        void moveDistance (int distance);

        void gasDecrease(int num);

        void addPassenger(int num);
    }


//interface (다형성)
//


package taxi;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(0, 0, 0, 100, "운행중");

        taxi.addPassenger(3); //첫번째 고객 3명
        taxi.moveDistance(9); //9키로 이다 distance 오ㅑㅐ 안떠요??? 나도 몰루
        taxi.addPassenger(4); //두번째 고객 4명 양심없네
        taxi.moveDistance(20); //20키로 이동
        taxi.addPassenger(5); //5명 타려고해서 탑승거부




    }
}

//    public Taxi(int taxiFare, int maxPassenger, int distance, int fuel, String state)
//기타 연산자 new 에 의해 인스턴스(객체)가 메모리 빈공간에 생성된다. + 초기화값입력 + 호출 !!
// > 이것이 간결하고 직관적인 객체지향적인 코드였군요ㅣ.....


//택시
//기본요금 1,000원
//최대승객수 4명
//현재승객수 초기상태 0명
//이동거리에 따른 수익계산 3키로당 1000원
//이동거리에 따른 주유차감 3키로당 10리터
//주유량 (최대 150/ 최소0 / 기본 100)
//일반,탑승불가(운행상태)
