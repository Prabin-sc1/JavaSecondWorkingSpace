//[1,4],[7,9],[10,17]---given
//    [3,10]--to be inserted and merged
//interview bit -->website
import java.util.ArrayList;

//edge cases
public class Solution {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		
		if (intervals == null) {
			intervals=new ArrayList<>();
			intervals.add(newInterval);
			return intervals;
			
		}else if(intervals.size() == 0) {
			intervals.add(newInterval);
			return intervals;	
		}
		Interval toInsert = newInterval;
		int i = 0;
		while (i < intervals.size()) {

			Interval currentInterval = intervals.get(i);
			if (currentInterval.end < toInsert.start) {
				i++;
				continue;
			} else if (toInsert.end < currentInterval.start) {
				intervals.add(i, toInsert);
				break;
			} else {
				toInsert.start = Math.min(toInsert.start, currentInterval.start);
				toInsert.end = Math.max(toInsert.end, currentInterval.end);
				intervals.remove(i);

			}
			if (i == intervals.size()) {
				intervals.add(toInsert);
			}
			return intervals;
		}
		return intervals;

	}

}
