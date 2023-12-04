package ProgrmmingExamples;

public class PerfectSquare {
static void perfectSquare(int count) {
    for(int i=0;i<count;i++) {
	double sqr=Math.sqrt(i);
	if((sqr-Math.floor(sqr))==0) {
	    System.out.print(i+" , ");
	}
    }
}
    public static void main(String[] args) {
	perfectSquare(1000);

    }

}
