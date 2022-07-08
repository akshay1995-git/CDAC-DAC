
class Question6{
	public static void main(String[] args) {
		
		int tot =0;
		long[] num= new long[3];
		for(int i=0;i<3;i++){
			num[i]=Long.parseLong(args[i]);
				tot+=num[i];

		}
		double avg= tot/3;
		System.out.println("Average"+avg);
	}
}