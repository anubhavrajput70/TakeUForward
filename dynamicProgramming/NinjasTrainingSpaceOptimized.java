package dynamicProgramming;

public class NinjasTrainingSpaceOptimized {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = {{10,40,70},
                {20,50,80},
                {30,60,90}};
        int n=points.length;
        System.out.println(training(n,points));
	}
	static int training(int n,int[][] points)
	{
		int prev[]=new int[4];
		prev[0]=Math.max(points[0][1],points[0][2]);
		prev[1]=Math.max(points[0][0],points[0][2]);
		prev[2]=Math.max(points[0][0],points[0][1]);
		prev[3]=Math.max(Math.max(points[0][0],points[0][1]),points[0][2]);
		for(int day=1;day<n;day++)
		{
			int temp[]=new int[4];
			for(int last=0;last<4;last++)
			{
				temp[last]=0;
				for(int task=0;task<3;task++)
				{
					if(task!=last)
					{
						temp[last]=Math.max(temp[last],points[day][task]+prev[task]);
					}
				}
			}
			prev=temp;
		}
		return prev[3];
	}

}
