public class ClosestPairNaive {
    
    public final static double INF = java.lang.Double.POSITIVE_INFINITY;
    
    //
    // findClosestPair()
    //
    // Given a collection of nPoints points, find and ***print***
    //  * the closest pair of points
    //  * the distance between them
    // in the form "NAIVE (x1, y1) (x2, y2) distance"
    //
    
    // INPUTS:
    //  - points sorted in nondecreasing order by X coordinate
    //  - points sorted in nondecreasing order by Y coordinate
    //
    
    public static void findClosestPair(XYPoint points[], boolean print)
    {
	// int nPoints = points.length;
	
	//
	// Your code goes here!
	//
    	double minDis=INF;
    	int j=0;
    	int n=points.length;
    	XYPoint x=null;
    	XYPoint y=null;
    	while(j<=n-2){
    		int k=j+1;
    		while(k<=n-1){
    			double dis=points[j].dist(points[k]);
    			if(dis<minDis){
    				minDis=dis;
    				x=points[j];
    				y=points[k];
    			}
    			k++;
    		}
    		j++;
    	}
    	print=true;
    	if(print)
    		System.out.println("NAIVE"+x.toString()+y.toString()+minDis );
	// if (print)
	//   System.out.println("NAIVE " + ...);
    }
}
