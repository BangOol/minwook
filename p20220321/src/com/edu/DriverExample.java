package com.edu;

public class DriverExample {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1 = new Taxi(); // 택시에 v1을 담음 :
		v1 = new Bus();

		Driver driver = new Driver();
		driver.drive(v1); // 매개변수의 다형성: v1이 Vehicle의 인스턴스인지 Taxi의 인스턴스인지에 따라 값이 달라짐
		// 아무 클래스나 들어갈 순 없고, 자식- 부모 관계였을 때만 성립된다.
		// bus가 상속받지 못할 경우, v1 자리에 들어갈 수 없다.

		Vehicle vehicle = new Vehicle();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		System.out.println("Vehicle의 최고속력: " + vehicle.getMaxSpeed());
		System.out.println("Taxi의 최고속력: " + taxi.getMaxSpeed());
		System.out.println("Bus의 최고속력: " + bus.getMaxSpeed());

		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = taxi; // 120
		vehicles[1] = bus; // 110
		vehicles[2] = vehicle; // 100

		int a = vehicles.length - 1;

//		for(int i =0; i < a; i++) {
//			int box;
//			for(int m = 0; m < a; m++) {
//				if(vehicles[m].getMaxSpeed() > vehicles[m+1].getMaxSpeed()) {
//					box = vehicles[m].getMaxSpeed(); // 110
//					vehicles[m] = vehicles[m+1];
//					vehicles[m+1].setMaxSpeed(box);
//					
//				}
//			}
//			
//			내가 한 것과 선생님이 한 거 비교해보기
//		}

		int loopCnt = vehicles.length - 1;
		for (int Cnt = 0; Cnt < loopCnt; Cnt++) {
			Vehicle temp = vehicles[0];

			for (int i = 0; i < loopCnt; i++) {

				if (vehicles[i].getMaxSpeed() > vehicles[1 + i].getMaxSpeed()) {
					temp = vehicles[i];
					vehicles[i] = vehicles[1 + i];
					vehicles[1 + i] = temp; // 25 34 48 12 ///

				}

				// 제일 빠른 속도로 타는 것 정렬해서 vehicles[0] = taxi, vehicles[1] = bus, vehicles[2] =
				// vehicle 들어가도록
				// if(intAry[i] > intAry[i+1]
			}

		}
		System.out.println("제일 느린 것 : " + vehicles[0].toString()); //택시의 최고속도는 120입니다.
		System.out.println("제일 빠른 것 : " + vehicles[2].toString()); // 버스의 최고속도는 100입니다
	}
}
