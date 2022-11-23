package Jokenpo;

public class Player {
	// atributo da classe Player informações a querer

	private String nickname;
	private Integer score;
	
	//constructor
	
	public Player(String nickname) {
		this.nickname = nickname;
		this.score = 0;
	}
	//GETer e SETer

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
    
	 
	
	
	
	
}
