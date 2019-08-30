public class PancakeState implements State {
	
	int[] pcakes;
	private String action;
	private Double actionCost;
	
	public PancakeState(int[] pcakes)
	{
		this.pcakes = pcakes;
	}
	
	public int[] getPancakes() {
		return pcakes;
	}

	public void setPancakes(int[] pcakes) {
		this.pcakes = pcakes;
	}

	public PancakeState(int[] pcakes, String action, Double actionCost) {
		super();
		this.pcakes = pcakes;
		this.action = action;
		this.actionCost = actionCost;
	}

	@Override
	public Double getActionCost() {
		return actionCost;
	}

	@Override
	public void setActionCost(Double d) {
		this.actionCost = d;
	}
	
	@Override
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pcakes == null) ? 0 : pcakes.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PancakeState other = (PancakeState) obj;
		if (pcakes == null) {
			if (other.pcakes != null)
				return false;
		} else if (!pcakes.equals(other.pcakes))
			return false;
		return true;
	}
	
	@Override
	public String toString()
	{
		String pancakes="";
		for(int i=0;i<pcakes.length;i++)
		{
			pancakes += pcakes[i];
		}
		return pancakes;
	}
}
