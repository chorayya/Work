package µÚ¾ÅÕÂ;

public class Ãë±í {

	public static void main(String[] args) {
		 StopWatch time = new StopWatch();
		 int[] nums=new int[100000];
		 for(int i=1;i<99999;++i) {
			 nums[i]=(int)((System.currentTimeMillis()/i)/1000);
		 }
		 time.start();
		 for(int i=0;i<99999;++i) {
			 for(int j=i+1;j<100000;++j) {
				 if(nums[i]>nums[j]) {
					 int temp=nums[i];
					 nums[i]=nums[j];
					 nums[j]=temp;
				 }
			 }
		 }
		 time.stop();
		 System.out.println(time.getElapsedTime());

	}

static class StopWatch {
	private double startTime;
	private double endTime;
	public double getStartTime() {
		return startTime;
	}
	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}
	public double getEndTime() {
		return endTime;
	}
	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}
	
	
	public void start() {
		startTime=System.currentTimeMillis();
	}
	public void stop() {
		endTime=System.currentTimeMillis();
	}
	public double getElapsedTime() {
		return endTime-startTime;
	}
	
}
}

