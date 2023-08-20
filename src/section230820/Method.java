package section230820;

public class Method {
	public static void main(String[] args) {
		
		// ============= 메인메서드의 매개변수 args ============= 
		System.out.println("main method arguments ==> ");
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			System.out.print(arg);
		}
		System.out.println("");
		
		// ============= 배열타입의 매개변수 ============= 
		String[] names = {"박은정","말하는감쟈","캐피바라","독수리"};
		print(names);
		print02(names);
		
		// ============= 문자열리턴 ============= 
		String name = getName();
		System.out.println("name : " + name);
		
		// ============= 숫자리턴 ============= 
		int[] nums = {1,2,3,4,5};
		int sum = add(nums);
		System.out.println("sum : " + sum);
		
		double[] result = getSum(nums);
		System.out.print("함계 : " + result[0] + " // 평균 : " + result[1]);
		
		// ============= 배열참조 ============= 
		System.out.println("");
		for (int num : nums) {
			System.out.print(num + " // ");
		}
		System.out.println("");
		testRef(nums);
		for (int num : nums) {
			System.out.print(num + " // ");
		}
		
		// ============= MemberVO: 회원가입 유저정보 ============= 
		MemberVO memberVO = new MemberVO();
		
		memberVO.setId("ID");
		memberVO.setPassword("PWD");
		memberVO.setName("NAME");
		memberVO.setAge(15);
		memberVO.setMobile("0100000000");
		
		String userId = memberVO.getId();
		String userPwd = memberVO.getPassword();
		String userName = memberVO.getName();
		int userAge = memberVO.getAge();
		String userMobile = memberVO.getMobile();
		
		System.out.println("");
		System.out.println("userId : " + userId);
		System.out.println("userPwd : " + userPwd);
		System.out.println("userName : " + userName);
		System.out.println("userAge : " + userAge);
		System.out.println("userMobile : " + userMobile);		
		
	}
	
	public static void print(String[] names) {
		System.out.println("배열타입의 매개변수01 String[]");
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			if(i<names.length-1) System.out.print(name + " // ");
			else System.out.println(name);
		}
	}
	 
	public static void print02(String... names) {
		System.out.println("배열타입 매개변수02 String...");
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			if(i<names.length-1) System.out.print(name + " // ");
			else System.out.println(name);
		}
	}
	
	public static String getName() {
		String name = "피카츄";
		return name;
	}

	public static int add(int[] nums) {
		int sum = 0;
		for (int index = 0; index < nums.length; index++) {
			int num = nums[index];
			sum = sum + num;
		}
		return sum;
	}
	
	public static double[] getSum(int... values) {
		double[] result = new double[2];
		int sum = 0;
		
		// for-each 반복문 : 배열이나 컬렉션과 같은 반복 가능한 객체에 대한 반복작업 수행
		// value: values의 요소
		for(int value: values) {
			sum += value;
		}
		double avg = sum / values.length;
		result[0] = sum;
		result[1] = avg;
		return result;
	}
	
	public static void testRef(int[] nums) {
		nums[2] = 100;
	}
}
