package transport;

public class PublicTransportation {
    int num;
    int fuelVolume;
    int speed;
    int maxPassenger;
    int currentPassenger;
    int price;
    String state;     //맴버변수선언

    public PublicTransportation() {
    } //기본생성자생성  왜용???

    // 운행 시작
    public void startOperation(String state) {
        this.state = state;
    }

    // 상태 변경
    public void changeState() {
        if (this.state == "운행") this.state = "차고지행";
        else if (this.state == "차고지행") this.state = "운행";

        if (fuelVolume < 10) {
            this.state = "차고지행";
        }
    }

    // 승객 탑승 - 버스
    public void boardingPassenger(int newPassenger) {
        this.maxPassenger = 30;
        if (this.currentPassenger + newPassenger <= maxPassenger && state.equals("운행")) {
            this.currentPassenger += newPassenger;
            System.out.println("탑승 승객 = " + newPassenger);
            System.out.println("잔여 승객 = " + currentPassenger);
            System.out.println("요금 확인 = " + price * newPassenger);
        } else {
            System.out.println("최대 승객 수를 초과하였습니다");
            currentPassenger = 20;
        }
    }

    // 승객 탑승 - 택시
    public void boardingPassenger(int newPassenger, String destination, int distanceDestination) {
        this.currentPassenger = 0;
        this.price = 3000;
        this.maxPassenger = 4;
        if (state.equals("일반") && newPassenger <= maxPassenger) {
            this.currentPassenger += newPassenger;
            System.out.println("탑승 승객 = " + newPassenger);
            System.out.println("잔여 승객 = " + currentPassenger);
            System.out.println("기본 요금 확인 = " + price);
            System.out.println("목적지 = " + destination);
            System.out.println("목적지까지 거리 = " + distanceDestination + "km");
            state = "운행중";
        } else {
            System.out.println("탑승 불가");
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
        if (fuelVolume < 10) {
            System.out.println("주유 필요!");
            changeState();
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getCurrentPassenger() {
        return currentPassenger;
    }

    public void setCurrentPassenger(int currentPassenger) {
        this.currentPassenger = currentPassenger;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}




