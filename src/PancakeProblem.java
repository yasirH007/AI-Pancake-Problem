import java.util.List;
import java.util.ArrayList;

public class PancakeProblem implements SearchProblem {

	@Override
	public State getInitialState() {
		int[] pancakes = {8,1,3,6,5,2,7,4};
		PancakeState initialState = new PancakeState(pancakes);
		initialState.setActionCost(0.0);
		return initialState;
	}

	@Override
	public List<State> generateSuccessors(State s) {
		List<State> returnStates = new ArrayList<>();
		
		PancakeState currentState = (PancakeState)s;
		
		for(int i=0;i<currentState.pcakes.length;i++)
		{
									
			if(i==currentState.pcakes.length-1)
			{
				int[] random = new int[currentState.pcakes.length];
				for(int k=0;k<random.length;k++)
				{
					random[k] = currentState.pcakes[currentState.pcakes.length-(k+1)];
				}
				PancakeState child  = new PancakeState(random,"Flipped from "+i+" position",1.0);
				returnStates.add(child);
			}
			else
			{
				int[] random = new int[currentState.pcakes.length];
				int count = i;
				for(int k=0;k<random.length;k++)
				{
					if(k<i+1)
					{
						random[k] = currentState.pcakes[count--];
					}
					else
					{
						random[k] = currentState.pcakes[k];
					}
				}
				PancakeState child  = new PancakeState(random,"Flipped from "+i+" position",1.0);
				returnStates.add(child);
			}
		}
		
		return returnStates;
	}

	@Override
	public Boolean isGoal(State s) {
		
		if(s.toString().equals("12345678"))
		{
			return true;
		}
		else
			return false;
	}

}
