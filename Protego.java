package HW3;

public class Protego implements Command {
	Spells s;

	Protego(Spells s) {
		this.s = s;
	}

	@Override
	public void execute(String deathEater) {
		s.Protego(deathEater);
	}
}
