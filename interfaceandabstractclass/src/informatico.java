
public class informatico extends Personal {
	
	private Integer id_informatico;

	public void Informatico() {
		
	}
	
	final public void trabajar(){
		super.trabajar();
		System.out.println("el informatico trabaja hoy");
	}

	public Integer getId_informatico() {
		return id_informatico;
	}

	public void setId_informatico(Integer id_informatico) {
		this.id_informatico = id_informatico;
	}
	

}
