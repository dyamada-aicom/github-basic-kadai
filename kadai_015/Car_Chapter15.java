package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int carNum = 0; //車の番号
	private int gear = 1; //ギア 1～5
	private int speed = 10; //ギアチェンジ後の速度
	
	//コントラクト
	public Car_Chapter15(int carNum){
		this.carNum = carNum;
		System.out.println("【登録】車体番号：" + this.carNum );
	}
	
	//ギアチェンジのメソッド
	public void gearChange(int afterGear) {
		if(1 <= afterGear && afterGear <= 5) {
			System.out.println("ギア" + this.gear + "から"
								+ afterGear + "に切り替えました");
			this.gear = afterGear;
			
			//速度変更
			switch(this.gear) {
				case 1 -> this.speed = 10;
				case 2 -> this.speed = 20;
				case 3 -> this.speed = 30;
				case 4 -> this.speed = 40;
				case 5 -> this.speed = 50;
				default -> this.speed = 10;
			}
			
		}
		return;
	}
	
	//速度表示のメソッド
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
		return;
	}
	

}
