package in.co.certificate;

public class Certificate {

	private int id;
	private String certificateName;

	public Certificate() {
		System.out.println("I'M DEFAULT");
	}

	public Certificate(String certificateName) {
		this.certificateName = certificateName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

}
