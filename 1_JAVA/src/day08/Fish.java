package day08;

class Fish extends Animal {
	String name;
	
	public Fish() {
		super();
		//super("물고기", "");
	}
	public Fish( String kind) {
		super();
		this.kind = kind;
	}
	
	public void print() {
		System.out.printf("동물[%s, %s]\n",this.kind, name);
		//System.out.printf("동물[%s, %s]\n",super.kind, name);
	}

	@Override //오버라이드 되는 메소드인지 확인
	public void breath() {
		System.out.println("아가미로 숨쉬기");
	}
}
