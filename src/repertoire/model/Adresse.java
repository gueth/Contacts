package repertoire.model;

public class Adresse {

	//Attribus
	private String rue;
	private String code;
	private String ville;
	
	
	//contructeur
	public Adresse(String rue, String code, String ville) {
		this.rue = rue;
		this.code = code;
		this.ville = ville;
	}
	@Override
	public String toString() {
		return  rue+" "+code+" "+ville ;
	}
	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}
	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
