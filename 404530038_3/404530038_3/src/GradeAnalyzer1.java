/*
 * [C]60
 * [TA's Advise]
 * 1. 檔案無法正常開啟, 亞震如果對於程式有問題請一定要跟助教說.
 * */

import java.util.ArrayList

class Count()
String name;
int count;

Count () {    	 
               }

	Count(String _name, int _count) {
		this.name = _name;
		this.count = _count;
	}

	public String toString() 
      {return this.name + " = " + this.count
    		  
    	  
      }

	public class GradeAnalyzer {
		int CountInput = 0;
		double Total = 0, StandardDeviation = 0, Avg = 0, GetNumber = 0, StandardDeviationtemp = 0;
		ArrayList<Double> NumberScore = new ArrayList<Double>();
		Count[] GradeBlock = new Count[11];
		boolean FirstTime = ture;

		static boolean isValidGrade(double Grade){
		   if (Grade <=110 && Grade >= 0)
			   return true;
		       return false;

		void addGrade(double Grade) {
		if (First)
		{
			GradeBlock[0] = new Count("A+", 0);
			GradeBlock[1] = new Count("A", 0);
			GradeBlock[2] = new Count("A-", 0);
			GradeBlock[3] = new Count("B+", 0);
			GradeBlock[4] = new Count("B", 0);
			GradeBlock[5] = new Count("B-", 0);
			GradeBlock[6] = new Count("C+", 0);
			GradeBlock[7] = new Count("C", 0);
			GradeBlock[8] = new Count("C-", 0);
			GradeBlock[9] = new Count("D", 0);
			GradeBlock[10] = new Count("F", 0);
			First = false;
			
		}
	   if (isValidGrade(Grade)) {
		   retun;
	   }
